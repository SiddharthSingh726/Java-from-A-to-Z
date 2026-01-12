/* 1. A constructor is similar to a method that is used to initialize the instance variables. The sole purpose of a constructor is
      to initialize the instance variables. A constructor has the following characteristics:

   2. The constructor name and class name  should be same. And the constructor name should end with a pair of simple braces.

   3. A constructor may have or may not have parameters. Parameters are variables to receive data from outside into the constructor. If a
      constructor has 1 or more parameters, it is called 'parameterized constructor'.

   4. A constructor does not return any value not even 'void', if a method does not return any value we write void before the method nam.
      That means the method is returning 'void' which means 'nothing'. But in case of a constructor, we should not even write 'void' before the constructor.

   5. A constructor is automatically called at the time of creating an object. While creating an object, if nothing is passed to object
      the default constructor is called and executed. If some values are passed to the object, then the parameterized constructor is called.
      Person Raju = new Person(); ----> here default constructor is called.
      Person Raju = new Person("Raju", 22); ----> here parameterized constructor will receive "Raju" and 22.

   6. A constructor is called and executed only once per object. This means when we create an object, the constructor is called. When
      we create second object, again the constructor is called second time.

 */