package LabRepo;

import java.util.Scanner;

class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 , num2 , num3;
        int sum = 0 ;
        int largest ;
        int smallest;
        System.out.println("Enter no 1:");
        num1 = sc.nextInt();

        System.out.println("Enter no 2:");
        num2 = sc.nextInt();

        System.out.println("Enter no 3:");
        num3 = sc.nextInt();

        if(num1 > num2  && num1 > num3) {
            largest = num1;

            if(num2 > num3){
                smallest = num3 ;
            }
            else{
                smallest = num2;
            }
            sum = largest + smallest;
        }
        else if(num2 > num1 && num2 > num3) {
            largest = num2;
            if(num1 > num3) {
                smallest = num3 ;
            }
            else{
                smallest = num1 ;
            }
            sum = largest + smallest;
        }
        else{
            largest = num3 ;
            if(num1 > num2){
                smallest = num2;
            }
            else{
                smallest = num1;
            }
            sum = largest + smallest;
        }
        System.out.println("Sum is :" + sum);
    }
}