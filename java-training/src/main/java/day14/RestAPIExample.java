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

These requests are handled by Tomcat server
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class RestAPIExample {
    @GetMapping("/tweets")
    List<String> getTweets() {
        return Arrays.asList("tweet-1", "tweet-2", "tweet-3");
    }
}
