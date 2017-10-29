package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int test = sc.nextInt();
            while(test>0){
                int size = sc.nextInt();
                int a[] = new int[size];
                for(int i=0; i<size; i++){
                    a[i] = sc.nextInt();
                }
                int min = 0;
                for(int i=1; i<size; i++){
                    if(a[i]<a[min]){
                        min = i;
                    }
                }
                System.out.println(min);
                test--;
            }
        }

        /**
         * Another potential solution
         */
        /*
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0){
            int size = sc.nextInt();
            int a[] = new int[size];
            for(int i=0; i<size; i++){
                a[i] = sc.nextInt();
            }
            int min = 0;
            int sum = 0;
            int pos = 0;
            int size1 = size;
            while(size1>0){
                int prefixSum = 0;
                int suffixSum = 0;
                for(int i=0; i<=size-size1; i++){
                    prefixSum += a[i];
                }
                System.out.println("prefixSum: " + prefixSum);
                for(int i=size-1; i>=size-size1; i--){
                    suffixSum += a[i];
                }
                System.out.println("suffixSum: " + suffixSum);
                if(size1==size){
                    min = prefixSum + suffixSum;
                    pos = size - size1 + 1;
                    System.out.println("Min: " + min);
                    System.out.println("Pos: " + pos);
                } else {
                    sum = prefixSum + suffixSum;
                    System.out.println("sum: " + sum);
                    if(sum<min){
                        min = sum;
                        pos = size - size1 + 1;
                        System.out.println("Min: " + min);
                        System.out.println("Pos: " + pos);
                    }
                }
               size1--;
            }
            System.out.println(pos);
            test--;
        }
        */
    }
}
