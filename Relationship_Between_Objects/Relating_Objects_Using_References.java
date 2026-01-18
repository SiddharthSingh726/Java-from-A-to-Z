/* It is possible to create objects for different classes and establish relationship between them. When the objects are related
   it is possible to access and use members of one object in another object. This becomes an advantage when an object should start
   processing data where another object has left. It is also helpful to pass data from one object to another object and from there
   to another object in a chained form.

   There are three ways to relate objects in Java.
   1.Using references
   2.Using inner class concept
   3.Using inheritance

   1.Relating objects using References.
   Let us create two classes,One and Two Suppose we want to access the members of class Two, in class One, we should relate their objects
   For this just declare the reference variable of class Two as an instance variable in class one.

   class One{
               Two t;  //t is a reference of class Two
            }

    Now this reference variable 't' can be used to refer to all the members of class Two from class One. For example, to call class Two's
    display() method, we can write:-

    t.display();

    And to access class Two instance variable 'y', unless it is private, we can write as:-
    t.y;

    For better understanding please see Program_1.

 */