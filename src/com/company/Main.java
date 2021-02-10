package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 0, max = 0, ans=0;
        for(int i=0; i<a-1; i++){
            count = 0;
            for(int j=i+1; j<a; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>=max) {
                max = count;
                ans = arr[i];
            }
        }
        System.out.println(ans);


    }
}
