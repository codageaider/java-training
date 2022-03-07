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

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
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
    @GetMapping("/tweets")
    List<String> getTweets(@RequestParam Map<String,String> requestParams) {
        List<String> stringList = new ArrayList<>();
         requestParams.entrySet().forEach(entry->stringList.add(entry.getValue()));
         return stringList;
    }

    @PostMapping("/tweet")
    List<String> postTweet(@RequestBody String body) {
        return Arrays.asList(body);
    }

}
