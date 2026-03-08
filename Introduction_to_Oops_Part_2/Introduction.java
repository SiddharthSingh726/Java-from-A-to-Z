/*
  1.What is "Object" in Java.
  Ans.An object has two main things:
    a.State(properties/data)
    b.Behaviour(actions/methods)
  Eg - Student have State = name and Behaviour = Studying

  2.Creation of Object(How to use a class in Java)
  Syntax for creating an object in Java.
     ClassName objectName = new ClassName()
  Eg - public class main(){
            public static void main (String [] args) {
            Car myCar = new Car(); // creating object

            myCar.color = "Red" // setting state
            myCar.speed = 100;

            myCar.drive(); // calling behaviour
          }
       }

   Output - Car is driving

   2.Constructors
   Ans.A constructor is a special method that runs automatically when an object is created.
       It is used to initialize object data.
   Important rules of Construction.
   a.Constucutor name =  same as class name
   b.No return type(not even void)
   c.Runns automatically when object is created.
 */