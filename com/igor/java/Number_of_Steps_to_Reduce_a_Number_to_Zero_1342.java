package com.igor.java;

public class Number_of_Steps_to_Reduce_a_Number_to_Zero_1342 {
    int count =0;
    public int numberOfSteps(int num) {

        if(num == 0){
            return count;
        }
        else if(num%2 ==0 ){
            count++;
            numberOfSteps(num/2);
        }else{
            numberOfSteps(num-1);
            count++;
        }
        return count;
    }

    public static void main (String args[]){


    }
}
/*
obs: Pretty good

        Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Steps to Reduce a Number to Zero.
        Memory Usage: 38.9 MB, less than 97.86% of Java online submissions for Number of Steps to Reduce a Number to Zero.

*/