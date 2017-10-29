package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases>0){
            String a[] = new String[4];
            String b[] = new String[4];
            for (int i=0; i<4; i++){
                a[i] = sc.next();
            }
            sc.nextLine();
            for(int j=0; j<4; j++){
                b[j] = sc.next();
            }
            int count = 0;
            for(int i=0; i<4; i++){
                for(int j=0; j<4; j++){
                    if(a[i].equals(b[j])){
                        count++;
                    }
                }
            }
            if(count>=2){
                System.out.println("similar");
            } else {
                System.out.println("dissimilar");
            }
            testCases--;
        }
    }
}
