import java.util.ArrayList;
import java.util.Arrays;

public class Running_Sum_0f_1d_Array_1480 {
    public static int[] runningSum(int[] nums) {
        int[] running_arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            if(i>0) {
                running_arr[i] = nums[i] + running_arr[i - 1];
                System.out.println(running_arr[i]);
            }else{
                running_arr[i] = nums[i];
            }
        }
        System.out.println(Arrays.toString(running_arr));
        return running_arr;
    };

    public static void main(String args[]){
    int[] myArr = new int[5];
    myArr[0] = 3;
    myArr[1] = 1;
    myArr[2] = 2;
    myArr[3] = 10;
    myArr[4] = 1;


    runningSum(myArr);

    }
}
