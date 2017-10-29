package com.company;

import java.util.Scanner;

public class Main {

    static boolean pallindrome(String check){
        int flag = 0;
        int a = check.length();
            for(int i = 0; i < a / 2; i++){
                //char x = check.charAt(i);
                //System.out.println("x is char at " + i + ": " +x);
                for(int j=a-i-1; j >= a-i-1; j--){
                    //char y = check.charAt(j);
                    //System.out.println("y is char at " + j + " : " + y);
                    if(check.charAt(i) == check.charAt(j)){
                        flag = 1;
                    } else {
                        flag = 0;
                        break;
                    }
                }
                if(flag==0){
                    break;
                }
            }

        if(flag == 0){
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = null;
        try{
            sc = new Scanner(System.in);
            int testCases = sc.nextInt();
            while(testCases>0){
                if(testCases>10){
                    break;
                } else {
                    String input = sc.next();
                    int flag = 0;
                    int x = input.length();
                    if(x>=1 && x<=100000){
                        if(x==2){
                            if(input.charAt(0)==input.charAt(1)) {
                                flag = 1;
                            } else {
                                flag = 0;
                            }
                        } else {
                            for(int i=0; i<x-1; i++){
                                    String checker = input.substring(i, x);
                                    System.out.println(checker);
                                    if(pallindrome(checker)){
                                        flag = 1;
                                        break;
                                    } else {
                                        flag = 0;
                                    }
                                }
                            }
                        }
                        if(flag==0){
                            System.out.println("NO");
                        } else {
                            System.out.println("YES");
                        }
                    }
                    testCases--;
                    //System.out.println(testCases);
                }
        } finally {
            if(sc!=null){
                sc.close();
            }
        }
    }
}
