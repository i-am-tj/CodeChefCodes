package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()){
                int test = sc.nextInt();
                while(test>0){
                    int input = sc.nextInt();
                    int len = (Integer.toString(input)).length();
                    int a[] = new int[len];
                    for(int i=0; i<len; i++){
                        a[i] = Character.getNumericValue(Integer.toString(input).charAt(i));
                    }
                    int n = a.length;
                    int size = n*(n-1);
                    int b[] = new int[size];
                    int count = 0;
                    for(int i=0; i<len; i++){
                        for(int j=0; j<len; j++){
                            if(i!=j){
                                b[count] = Integer.parseInt(Integer.toString(a[i]) + Integer.toString(a[j]));
                                count++;
                            }
                        }
                    }
                    int k;
                    for(int i=0; i<size-1; i++){
                        for(int j=i+1; j<size; j++){
                            if(b[i]>b[j]){
                                k = b[j];
                                b[j] = b[i];
                                b[i] = k;
                            }
                        }
                    }
                    /*
                    for(int i=0; i<size; i++){
                        System.out.print(b[i] + " ");
                    }
                    System.out.println();
                    */
                    int min = 64;
                    int max = 91;
                    String s = "";
                    int flag = 0;
                    int sum = 0;
                    for (int i=0; i<size; i++){
                        if(b[i]<=min || b[i]>=max){
                            flag = 1;
                            sum++;
                            continue;
                        } else {
                            min = b[i];
                            s += String.valueOf((char)b[i]);
                            flag = 2;
                        }
                    }
                    if(flag==1 && sum==size){
                        System.out.println();
                    } else {
                        System.out.println(s);
                    }

                    test--;
                }
            }
        }catch(Exception e){
            return;
        }

    }
}
