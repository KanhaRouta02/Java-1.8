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

![image](https://github.com/user-attachments/assets/35c21dff-6ece-40f8-87e7-592c9847bc0a)

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

➡️Lambdas and Local Variables
------------------------------

What is a Local variable ❓

• Any variable that is declared inside a method is called a local variable. 

• Lambdas have some restrictions on using local variables 👉 

        • Not allowed to use the same the local variable name as lambda parameters or inside the lambda body.
        
        • Not allowed re-assign a value to a local variable.

• No restrictions on instance variables.

Local Variables – Not Allowed
----------------------------

   ➡️Repeated Variable Name :

• Variable i is declared in the same scope and used as a parameter in Lambda.

• You cannot use the same variable as a lambda parameter or inside the lambda body.

   Same Variable as Input 👉 :

        int i=0; //Repeated varibale name not allowed
        Consumer<Integer> c1 = (i) -> {
        System.out.println(i+value);
        };

  Same Variable as Lambda parameter 👉 :

       int i=0;
       Consumer<Integer> c1 = (i) -> { //Repeated variable name not allowed
       System.out.println(i+value); 
       };
    
  Same Variable in Lambda Body 👉 :

      int i=0;
      Consumer<Integer> c1 = (a) -> {
      int i=0; //Repeated variable name not allowed
      System.out.println(i+value);
      };
• Not allowed to modify the value inside the lamda

     int value =4;
     Consumer<Integer> c1 = (a) -> {
         value=6; //reassigning not allowed
         System.out.println(i+value);
     };

✅ Effectively Final   
---------------------

• Lambda’s are allowed to use local variables but not allowed to modify it even though they are not declared final. This concept is called 

  Effectively Final.

• Not allowed to modify the value inside the lamda

         int value =4; Consumer<Integer> c1 = (a) -> {
         value=6; //reassigning not allowed 
         System.out.println(i+value);
         };
         
• Prior to Java 8 , any variable that’s used inside the anonymous class should be declared final.  

Advantages of Effectively Final :
---------------------------------

• Easy to perform concurrency operations.

• Promotes Functional Programming and demotes the Imperative style programming.

✅ Introduction to Streams API:
-------------------------------

• Introduced as part of Java8.

• Main purpose is to perform some Operation on Collections.

• Parallel operations are easy to perform with Streams API without having to spawn a multiple threads.

• Streams API can be also used with arrays or any kind of I/O.

What is a Stream ❓
-------------------

• Stream is a sequence of elements which can be created out of a collections such as List or Arrays or any kind of I/O resources and etc., 

     List<String> names = Arrays.asList("adam","dan","jenny");
     names.stream(); // creates a stream

 • Stream operations can be performed either sequentially or parallel. 

       names.parallelStream(); // creates a parallel stream

How Stream API Works ❓  
----------------------

![image](https://github.com/user-attachments/assets/43fcfad0-e4e3-44e0-97ee-b4ffa50c782a)

➡️Stream API : map()
---------------------

• map : Convert(transform) one type to another.

• Don’t get confused this with Map Collection. 

![image](https://github.com/user-attachments/assets/edcd1d74-f782-42cc-ac32-932d2d123f9e)

➡️Stream API : flatMap()
-------------------------

• flatMap : Converts(Transforms) one type to another as like map() method.

• Used in the context of Stream where each element in the stream represents multiple elements.

Example:

• Each Stream element represents multiple elements.

     • Stream<List>
     • Steam<Arrays>

➡️Stream API – distinct() , count() and sorted()
------------------------------------------------

• distinct – Returns a stream with unique elements.

• count – Returns a long with the total no of elements in the Stream.

• sorted - Sort the elements in the stream.

➡️Stream API – filter()
-------------------------

• filter – filters the elements in the stream.

Input to the filter is a Predicate Functional Interface.

➡️Streams API - reduce()
------------------------

• reduce – This is a terminal operation. Used to reduce the contents of a stream to a single value.

• It takes two parameters as an input.

     • First parameters – default or initial value
     • Second Parameter – BinaryOperator<T>

➡️Stream API : Max/Min using reduce()
--------------------------------------

• max -> Maximum(largest) element in the stream.

• min -> Minimum(smallest) element in the stream.

➡️Stream API : limit() and skip() 
----------------------------------

• These two function helps to create a sub-stream.

• limit(n) – limits the “n” numbers of elements to be processed in the stream.

• skip(n) – skips the “n” number of elements from the stream.

➡️Streams API : anyMatch(), allMatch(), noneMatch()
---------------------------------------------------

• All these functions takes in a predicate as an input and returns a Boolean as an output.

• anyMatch()- Returns true if any one of the element matches the predicate, otherwise false.

• allMatch() - Returns true if all the element in the stream matches the predicate, otherwise false.

• noneMatch() – Just opposite to allMatch(). Returns true if none of the element in the stream matches the predicate, otherwise false.

➡️Streams API : findFirst() and findAny()
-----------------------------------------

• Used to find an element in the stream.

• Both the functions returns the result of type Optional.

• findFirst() – Returns first element in the stream.

• findAny() – Returns the first encountered element in the stream.


