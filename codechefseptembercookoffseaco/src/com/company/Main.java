package com.company;

import java.util.Scanner;

public class Main {

    static void command(int comm[][], int a[], int x, int y){
        //System.out.println("command: " + " x: " + x + " y: " + y);
        for(int i = x; i<=y; i++){
            //System.out.println("i: " + i);
            if(comm[i-1][0] == 1){
                int l = comm[i-1][1];
                int k = comm[i-1][2];
                //System.out.println("l: " + l + " k: " + k);
                compute(a, l, k);
               // System.out.println(Arrays.toString(a));
            } else {
                int l = comm[i-1][1];
                int k = comm[i-1][2];
                command(comm, a, l, k);
            }
        }
    }

    static void compute(int arr[], int x, int y){
        //System.out.println("compute: " + " x: " + x + " y: " + y);
        for(int k=x-1; k<=y-1; k++){
            arr[k]++;
        }
        //System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int testCases = sc.nextInt();
            while(testCases>0){
                int n = sc.nextInt();
                int m = sc.nextInt();
                int a[] = new int[n];
                int comm[][] = new int[m][3];
                for (int i = 0; i<m; i++){
                    for (int j=0; j<3; j++){
                        comm[i][j] = sc.nextInt();
                    }
                }
                for (int i=0; i<m; i++){
                    for (int j=0; j<1; j++){
                        if(comm[i][j] == 1){
                            int x = comm[i][j+1];
                            int y = comm[i][j+2];
                            compute(a, x, y);
                        } else {
                            int x = comm[i][j+1];
                            int y = comm[i][j+2];
                            command(comm, a, x, y);
                        }
                    }
                }
                for (int i=0; i<n; i++){
                    System.out.print(a[i] + " ");
                }
                System.out.println();
                //System.out.println(Arrays.toString(a));
                testCases--;
            }
        }
    }
}
