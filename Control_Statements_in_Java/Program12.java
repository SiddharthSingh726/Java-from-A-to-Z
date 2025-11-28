//Labeled continue statement.
package Control_Statements_in_Java;

public class Program12 {
    public static void main(String [] args){
        int i = 1,j;
        lp1:while(i<=3){
            System.out.print(i);
            for(j = 1; j <= 5; j++){
                System.out.println("\t"+j);
                if(j==3){
                    i++;
                    continue lp1;
                }
            }
            i++;
            System.out.println("---------------------------");
        }
    }
}
