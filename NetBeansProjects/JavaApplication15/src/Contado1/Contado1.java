
package Contado1;

import java.util.Scanner;

//by me


public class Contado1 {
    public static void main(String[] args) {

    int min, max;

    Scanner s = new Scanner(System.in);
    System.out.print("Enter a Value: ");
    int count = s.nextInt();
    min = max = count;

     while (count != 0) {
       if (count > 5 && count < 10) {
           System.out.println("True");
        }
       else {
           System.out.println("False");
       }     
        System.out.print("Enter a Value: ");
        count = s.nextInt();
    }
}   

}