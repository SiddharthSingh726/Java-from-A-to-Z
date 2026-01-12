/*GOLDEN RULES — JAVA (FINAL + ACCESS MODIFIERS)
🔐 ACCESS MODIFIERS
private members are accessible only within the same class.
Private methods are not inherited and cannot be overridden.
protected members are accessible in the same package and in subclasses outside the package.
Default (no modifier) members are accessible only within the same package.
public members are accessible from anywhere
Top-level classes can be only public or default.
Inner classes can use all four access modifiers.

🔒 FINAL KEYWORD
A final variable cannot be reassigned.
A final instance variable has one constant copy per object.
A static final variable has one constant copy per class.
final controls mutability; static controls sharing.
A final method can be inherited but cannot be overridden.
A final class cannot be inherited.
Constructors cannot be final, static, or abstract.

⚙️ STATIC + OVERRIDING
Static methods are not overridden — they are hidden.
A static method cannot hide a final static method.
An instance method cannot be overridden by a static method.
A static method cannot be overridden by an instance method.

🧬 INHERITANCE & OVERRIDING
Overriding requires inheritance.
Private methods cannot be overridden because they are not inherited.
Method access level cannot be reduced during overriding.
Return type must be same or covariant in overriding.
Final methods cannot be overridden or hidden.

🏗️ CONSTRUCTORS
Every constructor implicitly calls super().
Superclass constructor must be accessible to subclass.
A subclass constructor cannot reduce the visibility of the superclass constructor it invokes.
Constructors are never inherited.

🧠 MEMORY & OBJECTS (BONUS)
Objects are created in heap memory.
References are stored in stack memory.
Class metadata and static members are stored in Method Area.
Reference variables store references, not objects.

🏆 ONE MASTER LINE (ULTIMATE RULE)
Access modifiers control visibility, final controls mutability/inheritance, static controls sharing, and overriding depends on inheritance + visibility.

*/