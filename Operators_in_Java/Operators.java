// Java all Operators

/* Arithmetic Operators
 * These operators are used to perform fundamental arithmetic operations like addition, substraction,etc.
 * There are 5 arithmetic operators in Java.
 *
 * Taking a=13 and b=5.
 *
 *    Operators                 Meaning                  Example               Result
 *        +                 Addition Operator              a+b                   18
 *        -                 Substraction Operator          a-b                   8
 *        *                 Multiplication Operator        a*b                   65
 *        /                 Division Operator              a/b                   2.6
 *        %                 Modulus Operator               a%b                   3
 */

//-------------------------------------------------------------------------------------------------------

/* Unary Operator
 * Unary operator act on only one operand.
 * There are three kinds of unary operators :-
 * a. Unary minus operator (-)
 * b. Increment operator (++)
 * c. Decrement operator (--)
 */

//-------------------------------------------------------------------------------------------------------

/* Unary minus operator (-)
 * This operator is used to negate a given value. Negation means converting a negative value into positive and vise versa.
 * For example :-
 * int x = 5;
 * System.out.println(-x);  it will display -5.
 * System.out.println(-(-x)); it will display 5.
 */

//-------------------------------------------------------------------------------------------------------

/* Increment Operator
 * This operator increases the value of a variable by 1.
 * For example :-
 * int x = 1;
 * ++x will make x = 2
 * x++ now x = 3
 */

//-------------------------------------------------------------------------------------------------------

/* Finding thr difference between pre- and post- increment of x.
 * int x = 1                                             int x = 1
 * System.out.println(x);                                System.out.println(x);
 * System.out.println(++x);                              System.out.println(x++);
 * System.out.println(x);                                System.out.println(x);
 *
 * OUTPUT                                                OUTPUT
 * 1                                                        1
 * 2                                                        1
 * 2                                                        2
 */

//-------------------------------------------------------------------------------------------------------

/* Decrement operator
 * This operator is used to decrease the value of a variable by 1.
 *
 * There are two types:
 * 1. Prefix decrement (--x): Decrements first, then uses the value.
 * 2. Postfix decrement (x--): Uses the value first, then decrements.
 *
 * For example:
 * int x = 1;
 * --x;   // Now x becomes 0 (decrement happens immediately)
 * x--;   // Now x becomes -1 (value is used first, then decremented)
 */

//-------------------------------------------------------------------------------------------------------

/* Assignment Operator
 * This operator is used to store some value into a variable. its is used in 3 Ways
 *
 * It is used to store the value into a variable, for example int  x = 5;
 * It is used to store the value of a variable into another variable.
 * For example :- int x = y; // here the value of y is stored into x.
 * It is used to store the value of an expression into a variable.
 * For example :- int x = y+z-4 //here the expression y+z-4 is evaluated and its result is stored into x.
 */

//-------------------------------------------------------------------------------------------------------

/* Compact Notation
 *Sometimes we may have to use same variable at both the sides of the operator. In such cases, we can eliminate
 * repetition of the variable and use compact notation or shortcut notation.
 *
 *  Expanded notation                      Compact notation                     Name of operator
 *  x = x + 10                                 x += 10                          += is called addition assignment operator
 *  sal = sal * 10.5                           sal *= 10.5                      *= is called multiplication assignment operator
 *  value = value-discount                     value -= discount                -= is called substraction assignment operator
 *  p = p / 1000                               p / = 1000                       /= is called division assignment operator
 *  num = num % 5.5                            num %= 5.5                       %= is called modulus assignment operator
 */

//-------------------------------------------------------------------------------------------------------

/* Relation Operator
 * These operators are used for the purpose of comparing.
 * For example :- to know which one is bigger or whether two quantities are equal or not.
 * Relational operators are of 6 types:-
 * > greater than operator
 * >= greater than or equal to
 * < less than operator
 * <= less than or equal to
 * == equal to operator
 * ! not equal to operator
 */

//-------------------------------------------------------------------------------------------------------

/* Logical Operator
 * Logical operators are used to construct compound conditions. A compound condition is a combination of several simple conditions.
 * Logical operators are of three types :-
 *
 * a. && and operator
 * b. || or operator
 * c. ! not operator
 */

//-------------------------------------------------------------------------------------------------------

/*Boolean Operator
 * These operators act on boolean variables and produce boolean type result. the following 3 are :-
 * a. & boolean and operator
 * b. | boolean or operator
 * c. boolean not operator

 * Boolean & operators return true if both the variables are true. boolean | operator returns true if any one
 * of the variable is true. Boolean ! operator converts true to false and vice versa.
 */

//-------------------------------------------------------------------------------------------------------

/* Bitwise Operator
 * There are 7 bitwise operators in Java. These act on individual bot (0 and 1) of the operands.
 * They act on only integer data types, i.e. byte,short,long and int.
 *
 * There are 7 bitwise operators.
 * a. Bitwise Complement operator (~)
 * This operator gives the complement from a given from of a given number.This operator symbol is ~, which is
 * pronounced as tilde. There is one shortcut formula for this ==> ~x = -(x+1).
 *
 * b. Bitwise and operator (&)
 * This operator performs and operation on the individual bits of the numbers. The symbol for this operator is &,
 * which is called ampersand.
 * It follows a truth table.
 *            X          Y               x&y
 *            0          0                0       (Here whenever 0 comes the output will be 0).
 *            0          1                0
 *            1          0                0
 *            1          1                1
 *
 * c. Bitwise or operator (|)
 * This operator performs or operation on the bits of the numbers. The symbol is |, which is called pipe symbol.
 * It follows a truth table.
 *            X          Y               x&y
 *            0          0                0        (Here whenever 1 comes the output will be 1).
 *            0          1                1
 *            1          0                1
 *            1          1                1
 *
 * d. Bitwise xor operator (^)
 * This operator performs exclusive or (xor) operation on the bits of the numbers. The symbol is ^, which is called
 * cap, carat, or circumflex symbol.
 * It follows a truth table.
 *            X          Y               x&y
 *            0          0                0          (Here whenever the same X and Y comes the output will be 0).
 *            0          1                1
 *            1          0                1
 *            1          1                0
 *
 * e. Bitwise Left Shift Operator (<<).
 * This operator shifts the bits of the number towards left a specified number of positions.The symbol for this operator
 * is <<, read as double less than. If we write x<<n, then the meaning is to shift the bits towards left n position.
 *
 * f. Bitwise Right Shift Operator (>>).
 * This operator shifts the bits of the number towards right a specified number of positions.The symbol for this operator
 * is >>, read as double greater than. If we write x>>n, then the meaning is to shift the bits towards right n position.
 * It also preserves the Sign bit, which is left most bit. Sign bit represents the sign of the number.Sign bit 0
 * represents a positive number and 1 represents a negative number. So, after performing >> operation on a positive
 * number, we get a positive value in the result also. If right shift is done on a negative number, again we get a negative
 * value only.
 *
 * g. Bitwise Zero Fill Right Shift operator (>>>)
 * This operator also shifts the bits of the number towards right a specified right number of positions. But, it stores
 * 0 in the sign bit. The symbol for this operator is >>>, read as triple greater than. since, it always fills 0 in the
 * sign bit, it is called zer fill right shift operator. If we apply >>> on a positive
 * number, it gives same output as that of >>. But in case of negative numbers, the output will be the positive, since
 * the sign bit is replaced by a 0.
 */

//-------------------------------------------------------------------------------------------------------

/* Ternary Operator or Conditional Operator (?:).
 * This operator is called ternary operator because it acts on 3 variables.The other name of this operator is conditional
 * operator, since it represents a conditional statement. Two symbols are used for this operator ? and :
 * Its syntax is variable = expression1 ? expression2 : expression 3;
 * This means thar first of all, expression1 is evaluated. If it is true, then expression2 value is stored into the variable.
 * If expression1 is false, then expression3 value is stored into the variable.
 *
 * if(expression1 is true)
 *     variable = expression1;
 *  else variable = expression3;
 */

//-------------------------------------------------------------------------------------------------------

/* Member Operator (.)
 * Member operator is also called dot operator since its symbol is a . (dot or period). This operator tells about member
 * of a package or a class. It is used in three ways:-
 *
 * a. We know a package contains classes. We can use . operator to refer to the class of a package.
 *    package.classname;
 *    java.io.BufferedReader
 *
 * b. We know that each class contains variables orr methods. To refer to the variables of a class, we can use this operator.
 *    classname.variablename;
 *    objectname.variablename;
 *
 * c. We know that a class also contains methods. Using dot operator, we can refer to the methods of a class.
 *    classname.methodname;
 *    objectname.methodname;
 */

//-------------------------------------------------------------------------------------------------------

/* instanceof Operator.
 * This operator is used to test if an object belongs to a class or not. Note that the word instance means object.
 * This operator can also be used to check if an object belongs to an interface or not.
 * booleans variable = object instanceof class;
 * boolean variable = object instanceof interface;
 */

//-------------------------------------------------------------------------------------------------------

/* new Operator.
 * new operator is often used to create objects to classes. We know that objects are created on heap memory by JVM,
 * dynamically (at runtime).
 * classname obj = new classname():
 * Employee emp = new Employee(); // emp is the object of the Employee class.
 */

//-------------------------------------------------------------------------------------------------------

/* Cast operator.
 * Cast operator is used to convert one datatype into another datatype. This operator can be used by writing datatype
 * inside simple braces.
 * int y = (int)x; //here, x datatype is converted into int type and then stored into y.
 */

//-------------------------------------------------------------------------------------------------------

/* Priority of Operators.
 * When several operators are used in a statement, it is important to know which operator will execute first and which will
 * come next. To determine that, certain rules of operator precedence are follewd:
 * First, the contents inside the braces: () and [] will be executed.
 * Next, ++ and --,
 * Next, *,/,and % will execute.
 * + and - will come next.
 * Relational operators are executed next.
 * Boolean and bitwise operators.
 * Logical operators will come afterwards.
 * Then ternary operator.
 * Assignment operator are executed at the last
 */





