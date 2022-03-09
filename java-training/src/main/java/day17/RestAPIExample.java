package day17;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import utils.Utility;

import javax.persistence.Query;
import java.time.LocalDateTime;
import java.util.*;

/*
<div>
    {{#users}}
        <h3>{{email}}</h3>
    {{/users}}
</div>

users = [{"email":"a@gmail.com"},{"email":"b@gmail.com"},{"email":"c@gmail.com"}]

Template and data are merged or combined to finally produce and html
After processing of this template and data we will have the following HTML
<div>

        <h3>a@gmail.com</h3>
        <h3>b@gmail.com</h3>
        <h3>c@gmail.com</h3>

</div>
 */
/*
User login, making tweets.
Reference:
(i) Form Tag in HTML (for making http request from web page)
https://www.w3schools.com/tags/tag_form.asp

(ii) Tag to be used when making a tweet
 https://www.w3docs.com/snippets/html/how-to-create-a-multi-line-text-input-field-in-html.html

(iii) Manual for Mustache. This explains all the different kind of keyword available in mustache.
Like {{}}, {{#}},...
https://mustache.github.io/mustache.5.html


Ex:
(i) Make an API that list down all the tweets of a user.
You can pass email or id in the query params

(ii) Make a separate HTML page having a button. Which when clicked
takes to the (i) API so that it automatically lists down the tweets of the user.

(iii) Make a simple login page with two fields for entering username and password
and a button. When button is clicked there is either an error in case of invalid password
or it takes to the list of all tweets that the user has made.

(iv) Provide a field on tweets page to create a new tweet.
This will need a field and a button to create which will link
to the already written api for creating a tweet

(v) Provide a button to create a new user on the login page which when clicked
takes to another page where user can enter name and password



 */
@Controller
public class RestAPIExample {
    private Map<String, User> userProfile = new HashMap<>();
    private Map<String, List<Tweet>> tweets = new HashMap<>();
    private Map<String, List<String>> following = new HashMap<>();
    private Session session;

    public RestAPIExample() {
        session = Utility.getSession();
        List<User> list = session.createQuery("from User", User.class).getResultList();
        for (User user : list) {
            userProfile.put(user.getEmail(), user);
        }

    }

    /*
    Template Engine -> Mustache, JSP, Thymeleaf
     */
    @GetMapping("/displayUserDetails")
    public ModelAndView getUserDetails() {
        ModelAndView modelAndView = new ModelAndView("users");
        if (userProfile.isEmpty())
            allAccDetails();
        List<User> users = new ArrayList<>();
        for (Map.Entry entry : userProfile.entrySet()) {
            users.add((User) entry.getValue());
        }
        modelAndView.getModel().put("users", users);
        return modelAndView;
    }

    @GetMapping("/loginForm")
    public ModelAndView loginForm() {
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }

    @GetMapping("/getTweets")
     public ModelAndView fetchTweets(@RequestParam String email) {
        String hql = "from Tweet where email = :email";
        Query query = session.createQuery(hql);
        query.setParameter("email", email);
        List<Tweet> tweetList = query.getResultList();
        ModelAndView modelAndView = new ModelAndView("tweets");
        modelAndView.getModel().put("tweets",tweetList);
        modelAndView.getModel().put("name",tweetList.get(0).getName());

        return modelAndView;

    }

    @PostMapping(value = "/login", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ModelAndView login(@RequestBody MultiValueMap<String, String> formData) {
        if (!isUserValid(formData)) {
            return errorMessageModelAndView("Wrong credentials");
        }
        ModelAndView modelAndView = new ModelAndView("profile");
        String email = formData.get("email").get(0);
        String name = userProfile.get(email).getName();
        modelAndView.getModel().put("name", name);
        modelAndView.getModel().put("email", email);
        return modelAndView;
    }


    private ModelAndView errorMessageModelAndView(String message) {
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.getModel().put("message", message);
        return modelAndView;
    }

    private boolean isUserValid(MultiValueMap<String, String> map) {
        String email = map.get("email").get(0);
        String password = map.get("password").get(0);
        User user = userProfile.get(email);
        if (user.getPassword().equals(password))
            return true;
        return false;
    }


    //    User can create an account  -->POST
    @PostMapping("/create")
    @ResponseBody
    private ResponseEntity<String> createUser(@RequestBody User user) {
        ResponseEntity<String> responseEntity = null;
        if (userProfile.containsKey(user.getEmail())) {
            responseEntity = new ResponseEntity<>("User already registered!",
                    HttpStatus.BAD_REQUEST);
        } else {
            String email = user.getEmail();
            Transaction transaction = session.beginTransaction();
            session.persist(user);
            transaction.commit();
            userProfile.put(email, user);
            responseEntity = new ResponseEntity<>("User account created successfully!", HttpStatus.OK);
        }
        return responseEntity;
    }

    //    User can all account details --> GET
    @GetMapping("/fetchUsers")
    @ResponseBody
    Map<String, User> allAccDetails() {
        return userProfile;
    }

    //    User can fetch particular account details --> GET
    @GetMapping("/getDetails")
    @ResponseBody
    private ResponseEntity<User> getAccDetails(@RequestParam String email, String password) {
        ResponseEntity<User> responseEntity = null;
        if (userProfile.containsKey(email)) {
            if (userProfile.get(email).getPassword().equals(password))
                responseEntity = new ResponseEntity<>(userProfile.get(email), HttpStatus.OK);
            else {
                responseEntity = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
                System.out.println("Wrong Password");
            }
        } else {
            responseEntity = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
            System.out.println("User is not registered");
        }
        return responseEntity;
    }

    //    User can update account details  -->PUT
    @PutMapping("/update")
    @ResponseBody
    private ResponseEntity<String> updateRecord(@RequestBody User user) {
        String email = user.getEmail();
        String updatedName = user.getName();
        String password = user.getPassword();
        ResponseEntity<String> responseEntity = null;
        if (password.equals(userProfile.get(email).getPassword())) {
            if (containsInvalidChars(updatedName)) {
                responseEntity = new ResponseEntity<>("name contains invalid characters",
                        HttpStatus.BAD_REQUEST);
            } else if (userProfile.containsKey(email)) {
                String currName = userProfile.get(email).getName();
                if (currName.equals(updatedName)) {
                    responseEntity = new ResponseEntity<>("No change rquired",
                            HttpStatus.OK);
                } else {
                    userProfile.get(email).setName(updatedName);
                    //write update query here
                    responseEntity = new ResponseEntity<>("update successful",
                            HttpStatus.OK);
                }
            } else {
                responseEntity = new ResponseEntity<>("User doesn't exist",
                        HttpStatus.NOT_FOUND);
            }
        } else {
            responseEntity = new ResponseEntity<>("Wrong password",
                    HttpStatus.NOT_FOUND);
        }
        return responseEntity;
    }

    private boolean containsInvalidChars(String name) {
        // name contains any numbers or +-
        return false;
    }


    //    User can delete account  -->DELETE
    @DeleteMapping("/delete")
    @ResponseBody
    private ResponseEntity<String> deleteRecord(@RequestParam String email, String password) {
        ResponseEntity<String> responseEntity = null;
        if (userProfile.containsKey(email)) {
            if (userProfile.get(email).getPassword().equals(password)) {
                //write delete query here
                responseEntity = new ResponseEntity<>("User Deleted Successfully", HttpStatus.OK);
                userProfile.remove(email);
            } else {
                responseEntity = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
                System.out.println("Wrong Password");
            }
        } else {
            responseEntity = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
            System.out.println("User is not registered");
        }
        return responseEntity;
    }

    //User can create tweet -->POST
    @PostMapping("/createTweet")
    @ResponseBody
    ResponseEntity<String> createTweet(@RequestBody Tweet tweet, @RequestParam String password) {
        ResponseEntity<String> responseEntity = null;
        String email = tweet.getEmail();
        if (userProfile.containsKey(email)) {
            if (userProfile.get(email).getPassword().equals(password)) {
                if (tweets.containsKey(email))
                    tweets.get(email).add(tweet);
                else {
                    List<Tweet> list = new ArrayList<>();
                    list.add(tweet);
                    tweets.put(email, list);
                }
                Transaction transaction = session.beginTransaction();
                session.persist(tweet);
                transaction.commit();
                responseEntity = new ResponseEntity<>("Tweet added successfully", HttpStatus.OK);
            } else {
                responseEntity = new ResponseEntity<>("Wrong Password", HttpStatus.BAD_REQUEST);
            }
        } else {
            responseEntity = new ResponseEntity<>("User is not registered", HttpStatus.BAD_REQUEST);
        }
        return responseEntity;
    }

    //user can see all tweets
    @GetMapping("/fetchTweets")
    @ResponseBody
    Map<String, List<Tweet>> fetchTweets() {
        List<Object[]> list = session.createQuery("select name,email,tweet,localDateTime from TweetTable ", Object[].class).getResultList();
        for (int i = 0; i < list.size(); i++) {
            Object[] arr = list.get(i);
            Tweet tweet = new Tweet(arr[0].toString(), arr[1].toString(), arr[2].toString(), (LocalDateTime) arr[3]);
            String email = arr[1].toString();
            if (tweets.containsKey(email)) {
                tweets.get(email).add(tweet);
            } else {
                List<Tweet> tweetList = new ArrayList<>();
                tweetList.add(tweet);
                tweets.put(arr[1].toString(), tweetList);
            }

        }
        return tweets;
    }

    //user can see tweets from a particular account
    @GetMapping("/fetchTweetsOfUser")
    @ResponseBody
    List<Tweet> fetchTweetsOfUser(@RequestParam String email) {
        return tweets.get(email);
    }

    //user can follow another user
    @PostMapping("/followUser")
    @ResponseBody
    private ResponseEntity<String> followUsers(@RequestParam String email, String userEmail) {
        ResponseEntity<String> responseEntity = null;
        if (!userProfile.containsKey(email)) {
            responseEntity = new ResponseEntity<>("User doesn't exist", HttpStatus.BAD_REQUEST);
            return responseEntity;
        }
        if (userEmail.equals(email)) {
            responseEntity = new ResponseEntity<>("You can't follow yourself", HttpStatus.BAD_REQUEST);
            return responseEntity;
        }
        if (userProfile.get(userEmail) != null) {
            if (following.containsKey(email)) {
                following.get(email).add(userEmail);
            } else {
                List<String> list = new ArrayList<>();
                list.add(userEmail);
                following.put(email, list);
            }
            responseEntity = new ResponseEntity<>("User " + userEmail + " followed successfully"
                    , HttpStatus.OK);
        } else {
            responseEntity = new ResponseEntity<>("User you are following doesn't exist"
                    , HttpStatus.BAD_REQUEST);
        }
        return responseEntity;
    }

    //to view following of a user
    @GetMapping("/follow")
    @ResponseBody
    private List<String> following(@RequestParam String email) {
        if (following.containsKey(email))
            return following.get(email);
        else
            return Arrays.asList("User doesn't follow anyone");
    }

}