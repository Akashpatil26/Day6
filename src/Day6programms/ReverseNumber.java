package Day6programms;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to reverse :");
        Scanner sc=new Scanner(System.in);
        int number =sc.nextInt();
        int reversenum=0;
        while(number!=0){
            reversenum=reversenum*10;
            reversenum=reversenum +number%10;
            number=number/10;
        }
        System.out.println("The reverse number is "+reversenum);


    }

}
