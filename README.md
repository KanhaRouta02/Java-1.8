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

➡️Imperative vs Declarative Programming
-------------------------------------

                               Example 2
                     Removing duplicates from a list of integers
                     


