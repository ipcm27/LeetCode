package com.igor.java;

import java.util.ArrayList;
import java.util.List;

public class FIzz_Buzz_412 {

    public List<String> fizzBuzz(int n) {
        ArrayList<String> answer = new ArrayList<String>();


        for(int i=1;i <= n; i++){
            if (i%3 == 0 && i%5 == 0 ){
                answer.add("FizzBuzz");
        }
            else if (i%3 == 0){
                answer.add("Fizz");
            } else if (i%5 == 0){
                answer.add("Buzz");
            }
            else{
                answer.add(Integer.toString(i));
            }
        }

        return answer;

    }

    public List<String> fizzBuzzBetterAnswer(int n) {
        // ans list
        List<String> ans = new ArrayList<String>();

        for (int num = 1; num <= n; num++) {

            boolean divisibleBy3 = (num % 3 == 0);
            boolean divisibleBy5 = (num % 5 == 0);

            String numAnsStr = "";

            if (divisibleBy3) {
                // Divides by 3, add Fizz
                numAnsStr += "Fizz";
            }

            if (divisibleBy5) {
                // Divides by 5, add Buzz
                numAnsStr += "Buzz";
            }

            if (numAnsStr.equals("")) {
                // Not divisible by 3 or 5, add the number
                numAnsStr += Integer.toString(num);
            }

            // Append the current answer str to the ans list
            ans.add(numAnsStr);
        }

        return ans;
    }

    public static void main (String args[]){

    }
}
