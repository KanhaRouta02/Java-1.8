About the Course 📚
================

✅ Why Java 8 ?
----------------

• Most popular and widely accepted language in the world.

• Java creators wanted to introduce the Functional features such as:

     • Lambdas

     • Streams

     • Optional and etc.,

• Technological advancements with the mobile/laptops/systems.

• New Java 8 features simplify the concurrency operations.

✅Functional Programming: ❓
-------------------------
• Embraces creating Immutable objects.

• More concise and readable code.

• Using functions/methods as first class citizens.

Example:

     Function<String,String> addSomeString = (name) -> name.toUpperCase().concat("default");

• Write code using Declarative approach.

 ✅Imperative vs Declarative Programming
  =====================================

👉Imperative Style of Programming
-------------------------------

• Focuses on how to perform the operations.

• Embraces Object mutability.

• This style of programming lists the step by step of instructions on how to achieve an objective.

• We write the code on what needs to be done in each step.

• Imperative style is used with classic Object Oriented Programming.

👉Declarative Style of Programming
--------------------------------

• Focuses on what is the result you want.

• Embraces Object immutability.

• Analogous to SQL (Structured Query Languague).

• Use the functions that are already part of the library to achieve an objective.

• Functional Programming uses the concept of declarative programming.

➡️Imperative vs Declarative Programming
--------------------------------------

                                 Example 1
                     Sum of 100 numbers from 0 to 100

                      /* Imperative Style of Programming - How style of programming */
                       int sum = 0;
                       for (int i = 1; i <= 100; i++) {
                       sum += i;
                       }
                       System.out.println("Imperative Style of Programming : " + sum); // 5050

                       /* Declarative Style of Programming - What style of programming */
                       int sum1 = IntStream.rangeClosed(0, 100)
                       .sum();
                       System.out.println("Declarative Style of Programming : " + sum1); //5050

What is Lambda Expression❓
-------------------------

• Lambda is equivalent to a function (method) without a name.

• Lambda’s are also referred as Anonymous functions.

          • Method parameters
          • Method Body
          • Return Type
• Lambdas are not tied to any class like a regular method.

• Lambda can also be assigned to variable and passed around.

➡️Syntax of the Lambda Expression
-------------------------------

  Lambda Expression: 

                  ![image](https://github.com/user-attachments/assets/410243b3-db3e-40c1-91b7-bdba0f0836ec)

 ✅Usages of Lambda
 ------------------

 • Lambda is mainly used to implement Functional Interfaces(SAM).
 
               @FunctionalInterface
               public interface Comparator<T> {
                int compare(T o1, T o2);
               }
               @FunctionalInterface
               public interface Runnable {
                public abstract void run();
               }

✅Lambda in Practice ( Things to keep in Mind)
-------------------------------------------

( ) -> Single Statement or Expression; // curly braces are not needed.

( )-> { <Multiple Statements> }; // curly braces are needed for multiple statements.

➡️Lambdas vs Legacy Java(until Java7)
-----------------------------------

Legacy:

     Runnable runnable = new Runnable() {
      @Override
      public void run() {
      System.out.println("Inside Runnable 1");
      }
     };

Java 8:

     Runnable runnableLambda = () -> {System.out.println("Inside Runnable
     2");};     

✅Functional Interfaces
------------------------

• Exists since Java 1.0 

Definition:

• A Functional Interface(SAM) is an interface that has exactly one abstract
method. 

@FunctionalInterface:

• This annotation is introduced as part of the JDK 1.8.

• Optional annotation to signify an interface as Functional Interface.

✅New Functional Interfaces in Java8
------------------------------------

     • Consumer
     • Predicate
     • Function
     • Supplier
     • Consumer – BiConsumer
     • Predicate - BiPredicate
     • Function – BiFunction, UnaryOperator, BinaryOperator
     • Consumer – IntConsumer, DoubleConsumer, LongConsumer
     • Predicate – IntPredicate, BiPredicate, LongPredicate
     • Function – IntFunction, DoubleFunction, LongFunction,IntToDoubleFunction,
                  IntoLongFunction,DoubletoIntFunction,
                  DoubletoLongFunction,LongtoIntFunction,
                  LongtoDoubleFunction,ToIntFunction,
                  ToDoubleFunction,ToLongFunction
     • Supplier – IntSupplier, LongSupplier, DoubleSupplier, BooleanSupplier
     
✅Method Reference
--------------------

• Introduced as part of Java 8 and its purpose is to simplify the implementation Functional Interfaces.

• Shortcut for writing the Lambda Expressions.

• Refer a method in a class.

➡️Syntax of Method Reference
-----------------------------

      ClassName::instance-methodName
      ClassName::static-methodName
      Instance::methodName

 Where to use Method Reference ❓
 -------------------------------

 • Lambda expressions referring to a method directly.
   
   Using Lambda: 
   
       Function<String,String> toUpperCaseLambda = (s)->s.toUpperCase(); 

   Using Method Reference:

      Function<String,String> toUpperCaseMethodRefernce = String::toUpperCase;
    
 Where Method Reference is not Applicable ❓ 
 ------------------------------------------

 Example: 

     Predicate<Student> predicateUsingLambda = (s) -> s.getGradeLevel()>=3;

✅Constructor Reference  
-----------------------

• Introduced as part of Java 1.8

Syntax:

    Classname::new

Example: 

    Supplier<Student> studentSupplier = Student::new; 

Invalid: 

    Student student = Student::new; // compilation issue

    
    

