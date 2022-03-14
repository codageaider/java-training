package day20.spring;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
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

    @ExceptionHandler(value =InvalidCredentialException.class)
    public ResponseEntity<Object> handleException3(Exception exception) {
        return new ResponseEntity<>("Credentials are not valid", HttpStatus.FORBIDDEN);
    }
}
