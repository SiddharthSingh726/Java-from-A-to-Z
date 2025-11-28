// Write a program to use a break statement to go to the end of a block.
package Control_Statements_in_Java;

public class Program10 {
    public static void main(String [] args){
        boolean x = true;
        bl1:{
            bl2:{
                bl3:{
                System.out.println("Block3");
                if(x) break bl2;
                }
                System.out.println("Block2");
            }
            System.out.println("Block1");
        }
        System.out.println("Out of all blocks");
    }
}
