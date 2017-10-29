package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            //System.out.println("Enter the number of test cases: ");
            int testCases = sc.nextInt();
            int a[];
            while (testCases > 0) {
                //System.out.println("Enter the number of inputs: ");
                int numOfInput = sc.nextInt();
                a = new int[numOfInput];
                if (numOfInput >= 7 && numOfInput <= 100) {
                    //System.out.println("Enter the numbers in the array: ");
                    for (int i = 0; i < numOfInput; i++) {
                        a[i] = sc.nextInt();
                    }
                }
                int flag = 0;
                int count = 1;

                for (int i = 0; i < (numOfInput / 2); i++) {
                    for (int j = numOfInput - i - 1; j >= numOfInput - i - 1; j--) {
                        if(a[0]!=1) {
                            flag = 1;
                            break;
                        } else if (a[i] != a[j]) {
                            flag = 1;
                            break;
                        } else if (a[i + 1] < a[i] || a[j - 1] < a[j]) {
                            flag = 1;
                            break;
                        } else if(a[i+1] > a[i]+1 || a[j-1] > a[j] + 1) {
                            flag = 1;
                            break;
                        } else if(a[i]>10 || a[j]>10){
                            flag = 1;
                            break;
                        } else if (a[i + 1] > 7) {
                            flag = 1;
                            break;
                        } else if(a[i+1] == a[i] + 1){
                            flag = 0;
                            count++;
                            continue;
                        } else {
                            flag = 0;
                        }
                    }
                    if (flag == 1) {
                        break;
                    } else {
                        continue;
                    }
                }
                if (flag == 0 && count ==7) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
                testCases--;
            }
        }
    }
}
