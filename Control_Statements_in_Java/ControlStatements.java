/* The most commonly used statements in any programming language are as follows:-
 * a. Sequential statements:- These are the statements which are executed one by one.
 * b. Control statements:- These are the statements that are executed randomly and repeatedly.
 */

//-------------------------------------------------------------------------------------------------------

/* Control statements are the statements which after the flow of execution and provide better control to the program
 * on the flow of execution. They are useful to write better and complex program.
 *
 * The following control statements are available in Java:-
 * a. if....else statement
 * b. do....while loop
 * c. while loop
 * d. for loop.
 * e. for-each loop
 * g. switch statement
 * h. break statement
 * i. continue statement
 * j. return statement
 */

//-------------------------------------------------------------------------------------------------------

/* if....else Statement
 * This statement is used to perform a task depending on weather a  given condition is true or false.
 * here, task represents a single statement or a group of statements.
 * if(condition)
 *        statement1;
 *   [else statement2;]
 */

//-------------------------------------------------------------------------------------------------------

/* do....while Loop
 * The loop is used when there is a need to repeatedly execute a group of statements as long as a condition is true. If the
 * condition is false,the repetition will be stopped and the flow of execution comes out of do...while loop.
 * do{
 *     statements;
 *    }while(condition);
 */

//-------------------------------------------------------------------------------------------------------

/* while Loop
 * The functional of this loop is also similar to do..while loop. This loop repeats a group of statements as long as a condition
 * is true. Once the condition is false, the loop is terminated.
 * while(condition){
 *                   statements;
 *                 }
 */

//-------------------------------------------------------------------------------------------------------

/* for loop
 * The for loop is also same as do..while or while loop, but it is more compact syntactically. The for loop executes a group
 * of statements as long as condition is true.
 * for(initialization ; condition ; preceding operator){
 *                statements;
 *             }
 */

//-------------------------------------------------------------------------------------------------------

/* Nested for Loop
 * We can write a for loop within another for loop. Such loops are called nested loops.
 * for(int i = 1; i<=3; i++){
 *          statements1;  //these are executed 3 times
 *        for(int j; j<=4; j++){
 *           statements2;  //these are executed 12 times
 *       }
 *   }
 */

//-------------------------------------------------------------------------------------------------------

/* for-each Loop
 * This loop is specifically designed to handle the elements of a collection.Collection represents a group of elements.
 * For example, we can take an array as a collection or any class in java.util package can be considered as a collection.
 * The reason is that an array stores a group of elements like integer values or strings. Similarly, java.util package
 * classes are developed to handle a group of objects.
 * for(var : collection){
 *         statements;
 *    }
 */

//-------------------------------------------------------------------------------------------------------

/* switch Statement
 * When there are several options and we have to choose only one option from the available ones, we can use switch
 * statement. Depending on the selected option, a particular task can be performed.A task represents one more statements.
 * switch(variable)
 *              {
 *                case value1 : statements1;
 *                case value2 : statements2;
 *                case value3 : statements3;
 *                default     : default_statements;
 *     }
 * We cannot use all the data types along with the switch statement. We can use char,int,byte,short types only.
 * In the recent version of Java, it is permitted to use string data type inside a switch statement to decide the
 * course of action inside the switch block.
 */

//-------------------------------------------------------------------------------------------------------

/* break Statement
 * The break statement can be used in 3 ways:
 * a. break is used inside a loop to come out of it.
 * b. break is used inside the switch block to come out of the switch block.
 * c. break can be used in nested blocks to go to the end of a block. Nested blocks represent a block written within
 * another block.
 */

//-------------------------------------------------------------------------------------------------------

/* continue Statement
 * continue is used inside a loop to repeat the next iteration of the loop.When continue is executed, subsequent
 * statements in the loop are not executed and control of execution goes back to the next repetition of the loop.
 */

//-------------------------------------------------------------------------------------------------------

/* return Statement
 * return statement is used in a method to come out of it to the calling method. For example, we are calling a method by the name
 * myMethod() from the main() method.If return is used inside myMethod(),then the flow of execution comes out of it and goes back
 * to main().While going back from myMethod(), we can also return some value to main() method.For this purpose,return should be used
 * as follows:
 * a. return 1; //return 1 to calling  method
 * b. return x; //return x value
 * c. return (x+y);  //calculate x+y and return that value
 * d. return -5;  //return -5
 */