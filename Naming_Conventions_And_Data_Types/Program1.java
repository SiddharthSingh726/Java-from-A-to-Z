// Write a program to display a binary number in other number systems.

package Naming_Conventions_And_Data_Types;

public class Program1 {
    public static void main(String [] args){
        int num = 0b1010; //binary

        System.out.printf("\nIn Decimal = %d", num);
        System.out.printf("\nIn Octal = %o", num);
        System.out.printf("\nIn Hexadecimal = %x", num);
        System.out.printf("\nIn Binary = %s", Integer.toBinaryString(num)); //This converts an integer number into its binary representation as a string.
    }
}
