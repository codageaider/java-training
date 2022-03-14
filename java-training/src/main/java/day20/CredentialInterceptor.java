package day20;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class CredentialInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws InvalidCredentialException {
        System.out.println("inside prehandle");
        if (1 == 1) {
            throw new InvalidCredentialException();
        } else
            return true;
    }
}
