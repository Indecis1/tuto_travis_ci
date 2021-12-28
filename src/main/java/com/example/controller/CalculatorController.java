package com.example.controller;


import com.example.utils.ModuloOperation;
import com.example.utils.Result;
import org.springframework.web.bind.annotation.*;


@RestController
public class CalculatorController {

    @GetMapping(path="")
    public String home(){
        return "Veuillez allez sur le chemin correspondant à votre opération\n1-addition\n2-soustraction\n3-multiplication\n4-division\n5-modulo";
    }

    @GetMapping(path="addition/{x}/{y}")
    public Result addition(@PathVariable double x, @PathVariable double y){
        Result result = new Result();
        result.setResult(x + y);
        return result;
    }

    @GetMapping(path="soustraction/{x}/{y}")
    public Result soustraction(@PathVariable double x, @PathVariable double y){
        Result result = new Result();
        result.setResult(x - y);
        return result;
    }

    @GetMapping(path="multiplication/{x}/{y}")
    public Result multiplication(@PathVariable double x, @PathVariable double y){
        Result result = new Result();
        result.setResult(x * y);
        return result;
    }

    @GetMapping(path="division/{x}/{y}")
    public Result division(@PathVariable double x, @PathVariable double y){
        Result result = new Result();
        result.setResult(x / y);
        return result;
    }

    @PostMapping(path="modulo")
    public Result modulo(@RequestBody ModuloOperation operation){
        Result result = new Result();
        result.setResult(operation.getX() % operation.getY());
        return result;
    }

}

