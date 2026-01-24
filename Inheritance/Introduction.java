/* Deriving new classes from existing classes such that the new classes acquire all the features of existing classes is called
   Inheritance.

   Inheritance is a concept where new classes can be produced from the existing classes. The newly created class acquires all the
   features of the existing class from where it is derived.

   A child class object can access parent class non-private members.

   Child classes can access parent class public and protected members, but not private members.

   Parent constructor is ALWAYS called before child constructor.

   Method Overriding.
   a. If a method have same name,same parameters and same return type.
   b. Method call depends on the object type, not the reference type.

   RULES of Method Overriding
   1.Method name must be same
   2.Parameters must be same
   3.Return type must be same or covariant
   4.Access level cannot be reduced
   5.Happens only in inheritance
   6.Only instance methods can be overridden
   7.Overriding works only for non-static, non-final, non-private methods.

   Super Keyword.
   1.Super refers to the parent class object part inside the child object.
   2.Use super to call the parent class version of an overridden method.

   super() → constructor only
   super.method() → method access

   super() can be used ONLY inside a constructor, and
   it must be the FIRST statement of that constructor.

   Access level cannot be reduced
   private, final, static methods cannot be overridden
   Return type must be same or covariant
   Only instance methods are overridden
   Method call depends on object type

   In method overriding, access level can be increased but never decreased.
   private < default < protected < public

   Final Keyword.
   1.A final class cannot be extended.
   2.Final method cannot be overridden
   3.A final variable cannot be reassigned.
   4.Final method can be inherited but not override.
   5.Final static methods cannot be overridden or hidden.

   FINAL GOLDEN RULES (LOCK THIS)
   1.final class → no inheritance
   2.final method → no overriding
   3.final variable → no reassignment
   4.Final methods are inherited but frozen
   5.final + static → no hiding
 */