package com.boot.admin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN, reason = "用户数量太多！")
public class UserToolManyException extends RuntimeException{

    public UserToolManyException(){

    }

    public UserToolManyException(String message){
        super(message);
    }

}
