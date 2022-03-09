package day17;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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
@Controller
public class RestAPIExample {
    private Map<String, User> userProfile = new HashMap<>();
    private Map<String, List<Tweet>> tweets = new HashMap<>();
    private Map<String, List<String>> following = new HashMap<>();

    /*
    Template Engine -> Mustache, JSP, Thymeleaf
     */
    @GetMapping("/displayUserDetails")
    public ModelAndView getUserDetails() {
        ModelAndView modelAndView = new ModelAndView("users");
        if (userProfile.isEmpty())
            allAccDetails();
        List<User> users = new ArrayList<>();
        for(Map.Entry entry: userProfile.entrySet()){
            users.add((User)entry.getValue());
        }
        modelAndView.getModel().put("users", users);
        return modelAndView;
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
            Session session = getSession(User.class);
            Transaction transaction = session.beginTransaction();
            session.persist(user);
            transaction.commit();
            session.close();
            userProfile.put(email, user);
            responseEntity = new ResponseEntity<>("User account created successfully!", HttpStatus.OK);
        }
        return responseEntity;
    }

    //    User can all account details --> GET
    @GetMapping("/fetchUsers")
    @ResponseBody
    Map<String, User> allAccDetails() {
        Session session = getSession(User.class);
        List<Object[]> list = session.createQuery("select name,email,password from users ", Object[].class).getResultList();
        for (int i = 0; i < list.size(); i++) {
            Object[] arr = list.get(i);
            User user = new User(arr[0].toString(), arr[1].toString(), arr[2].toString());
            userProfile.put(arr[1].toString(), user);
        }
        session.close();
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
                Session session = getSession(Tweet.class);
                Transaction transaction = session.beginTransaction();
                session.persist(tweet);
                transaction.commit();
                session.close();
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
        Session session = getSession(Tweet.class);
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
        session.close();
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

    public Session getSession(Class annotatedClass) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(annotatedClass);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        return session;
    }
}