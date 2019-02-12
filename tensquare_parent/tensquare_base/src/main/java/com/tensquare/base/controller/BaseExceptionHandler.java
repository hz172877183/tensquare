package com.tensquare.base.controller;

import entity.Result;
import entity.StatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: ${description}
 * @ProjectName: tensquare_parent
 * @Package: com.tensquare.base.controller
 * @Author: hz
 * @Date: 2019/2/12 19:37
 * @Version: 1.0
 */
@ControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result error(Exception e){
        return new Result(false, StatusCode.ERROR,e.getMessage());
    }
}
