package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static String checkRainbow(List list){

        List <Integer> num;
        if(reverseCheck(list)){
            for(int i=0; i<list.size(); i++){
                num = new ArrayList<Integer>();
                int number = Integer.parseInt(list.get(i).toString());
                switch(number){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        if(!num.contains(number)){
                            num.add(number);
                        }
                        break;
                     default:
                         return "No";
                }

            }
            return "Yes";
        }
        return "No";
    }

    static boolean reverseCheck(List list){
        String val = "";
        for(int i=0; i<list.size(); i++){
            val += list.get(i);
        }
        System.out.println(val);
        String reverse = new StringBuffer(val).reverse().toString();
        System.out.println(reverse);
        if(reverse.equals(val)){

            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases: ");
        int testCases = sc.nextInt();
        List<Integer> list;
        while(testCases>0){
            System.out.println("Enter the number of inputs: ");
            int numOfInput = sc.nextInt();
            if(numOfInput>=7 && numOfInput<=100){
                list = new ArrayList<>();
                System.out.println("Enter the numbers in the array: ");
                for(int i = 0; i < numOfInput; i++){
                    int entry = sc.nextInt();
                    list.add(entry);
                }
                System.out.println(checkRainbow(list));
            }
            testCases--;
        }

    }
}
