package com.igor.java;

public class Two_sum_1 {

    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
            for(int i= 0; i< nums.length; i++){

                        for (int j = 0; j< nums.length; j++){
                            int sum = nums[i]+nums[j];
                            if( j!= i && sum == target){
                                answer [0]=i;
                                answer [1]=j;
                                return answer ;
                            }
                        }
            }
            return answer ;
    };


    public static void main(String args []){}
}
