package com.hendisantika.exception.handler.exception;

import com.hendisantika.exception.exception.BaseException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 04/08/18
 * Time: 17.25
 * To change this template use File | Settings | File Templates.
 */
@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = BaseException.class)
    public String handleBaseException(BaseException e){
        return e.getMessage();
    }

    @ExceptionHandler(value = Exception.class)
    public String handleException(Exception e){return e.getMessage();}


}
