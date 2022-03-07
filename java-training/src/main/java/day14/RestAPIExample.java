package day14;
/*
GET, POST, PUT
HTTP request and it is returning a response.
Especially in this case it is non - GUI
It's returning some data
HTTP API which you call and it returns some data it is also called
REST API
domain/ -> Get request and it has to return all the tweets
http://localhost:8080/tweets GET
http://localhost:8080/tweets?mention=abc&word=def GET
These requests are handled by Tomcat server

http://localhost:8080/tweet  POST
{"userId" : "user-1", "tweet":"tweet-message"}
 */

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RestAPIExample {
    //    @GetMapping("/tweets")
//    List<String> getTweets() {
//        return Arrays.asList("tweet-1", "tweet-2", "tweet-3");
//    }
//    @GetMapping("/tweets")
//    List<String> getTweets(@RequestParam String mention,@RequestParam String word) {
//        return Arrays.asList(mention,word);
//    }
//    @GetMapping("/tweets")
//    List<String> getTweets(@RequestParam Map<String,String> requestParams) {
//        List<String> stringList = new ArrayList<>();
//         requestParams.entrySet().forEach(entry->stringList.add(entry.getValue()));
//         return stringList;
//    }
//
//    @PostMapping("/tweet")
//    List<String> postTweet(@RequestBody String body) {
//        return Arrays.asList(body);
//    }
    private Map<String, String> users = new HashMap<>();

    //    User can create an account  -->POST
    @PostMapping("/create")
    List<String> getTweets(@RequestBody Map<String, String> requestBodyMap) {
        String email = requestBodyMap.get("email");
        String name = requestBodyMap.get("name");

        users.put(email, name);
        return Arrays.asList(name, email);
    }

    //    User can fetch account details --> GET
    @GetMapping("/fetch")
    Map<String, String> getAccDetails() {
        return users;
    }

    @GetMapping("/getDetails")
    private String getAccDetails(@RequestParam String email) {
        return users.get(email);
    }


    //    User can update account details  -->PUT
    @PutMapping("/update")
    private ResponseEntity<String> updateRecord(@RequestBody Map<String, String> requestBodyMap) {
        /*
        (i) email doesnot exist
        (ii) Email present and name is also same
        (iii) Email present and name is different
        Making my API complete or robust.

         */
        String email = requestBodyMap.get("email");
        String name = requestBodyMap.get("name");
        ResponseEntity<String> responseEntity = null;
        if (containsInvalidChars(name)) {
            responseEntity = new ResponseEntity<>("name contains invalid characters",
                    HttpStatus.BAD_REQUEST);
        } else if (users.containsKey(email)) {
            String currName = users.get(email);
            if (currName.equals(name)) {
                responseEntity = new ResponseEntity<>("No change rquired",
                        HttpStatus.OK);
            } else {
                users.put(email, name);
                responseEntity = new ResponseEntity<>("update successful",
                        HttpStatus.OK);
            }
        } else {
            // (i) response body (ii) you specify the appropriate status codes
            // email does not exist
            responseEntity = new ResponseEntity<>("User doesn't exist",
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
    String deleteRecord(@RequestParam String email) {
        if (users.containsKey(email)) {
            users.remove(email);
        }
        return email + " successfully deleted";
    }


}
