package com.programs.arrays;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6}; // Output: 1,4,2,5,3,6
        int n = 3;
        int[] newArray = shuffle(nums,n);
        System.out.println(Arrays.toString(newArray));

    }

    public static int[] shuffle(int[] nums,int n){
        int[] newArray = new int[2*n];

        for (int i = 0;i<= n-1;i++){
            newArray[2*i] = nums[i];
            newArray[2*i+1] = nums[i+n];
        }
        return newArray;
    }
}
