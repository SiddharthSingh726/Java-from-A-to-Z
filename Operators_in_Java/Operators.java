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