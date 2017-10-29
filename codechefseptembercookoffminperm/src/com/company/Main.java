package com.company;

import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int test = sc.nextInt();
            while(test>0){
                int digit = sc.nextInt();
                int num = 1;
                int a[] = new int[digit];
                if(digit<4 && digit>1){
                    int count = 0;
                    int index = 1;
                    while(count<digit){
                        if(count==0) {
                            a[index] = num;
                            num++;
                            count++;
                            continue;
                        }
                        if(count%2==0){
                            index = index + 2;
                            a[index] = num;

                        } else {
                            index--;
                            a[index] = num;
                        }
                        num++;
                        count++;
                    }
                }else if(digit%2!=0){
                    int count = 0;
                    int index = 1;
                    while(count<digit){
                        if(count==0) {
                            a[index] = num;
                            num++;
                            count++;
                            continue;
                        }
                        if((index+4)!=(digit-1)) {
                            if(count%2==0){
                                index = index + 3;
                                a[index] = num;
                            } else {
                                index--;
                                a[index] = num;
                            }
                        } else {
                            for(int i=2; i<=4; i++){
                                a[count + (i%3)] = num;
                                num++;
                            }
                            count = count + 3;
                        }
                        count++;
                        num++;
                    }
                } else {
                    int count = 0;
                    int index = 1;
                    while(count<digit){
                        if(count==0) {
                            a[index] = num;
                            num++;
                            count++;
                            continue;
                        }
                        if(count%2==0){
                            index = index + 3;
                            a[index] = num;

                        } else {
                            index--;
                            a[index] = num;
                        }
                        num++;
                        count++;
                    }
                }
                for(int i=0; i<digit; i++){
                    System.out.print(a[i] + " ");
                }
                System.out.println();
                test--;
            }
        }
    }
}
