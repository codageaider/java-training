package day20;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {
    @ExceptionHandler(value =TweetNotFoundException.class)
    public ResponseEntity<Object> handleException(Exception exception) {
        return new ResponseEntity<>("Tweet not found", HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(value =TweetNotFoundException2.class)
    public ResponseEntity<Object> handleException2(Exception exception) {
        return new ResponseEntity<>("Tweet not found", HttpStatus.NOT_FOUND);
    }
}
