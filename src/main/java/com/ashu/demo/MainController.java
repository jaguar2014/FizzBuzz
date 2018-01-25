package com.ashu.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/fizzbuzz")
    public String showFizzBuzz(){
        String result = "";
        for (int i = 1; i <=100; i ++){
            if(i%3==0 && i%5==0){
                result += "FizzBuzz"+"<br />";
            }else if (i%3==0){
                result+="Fizz"+"<br />";
            }else if (i%5==0){
                result+="Buzz"+"<br />";
            }else{
                result+=i+"<br />";
            }

        }
        return result;
    }

}
