package com.example.controller;


import com.example.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CalculatorController {

    @GetMapping(path="")
    public String home(){
        return "Test";
    }

    @GetMapping(path="addition/{x}/{y}")
    public Result addition(@PathVariable double x, @PathVariable double y){
        Result result = new Result();
        result.setResult(x + y);
        return result;
    }

}

