package com.ashu.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {

    @RequestMapping("/fizzbuzz")
    public String showFizzBuzz(){
        String result = "";

        int sevenCounter=0;
        int seventeenCounter=0;
        int twentythreeCounter=0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = keyboard.nextInt();
        for (int i = 1; i <=number; i ++){
            if(i%7==0) sevenCounter++;
            if(i%17==0) seventeenCounter++;
            if(i%23==0) twentythreeCounter++;

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

        return result +"The numbers of multiple of 7 is  " +"<b>"+sevenCounter+"</b>" + " 17 is "+"<b>"+ seventeenCounter+"</b>"+ " 23 is "+ "<b>"+twentythreeCounter+"</b>";
    }

}
