 Functional programming is a programming paradigm that treats computation as the evaluation of mathematical functions and avoids changing state and mutable data. It encourages the use of pure functions, immutability, and higher-order functions. While functional programming itself is not necessarily based on design patterns in the same way that object-oriented programming is, it does have some common approaches and techniques that are often used to solve certain problems. Let's explore some of these functional programming design patterns:

### Pure Functions:
Pure functions are the cornerstone of functional programming. They produce the same output for the same input and have no side effects, meaning they don't modify any external state. This makes them predictable and easier to reason about.

### Immutability:
Immutability involves avoiding changes to data once it's created. Instead of modifying existing data structures, functional programming prefers creating new data structures with the desired changes. Immutability helps in avoiding bugs and makes it easier to reason about code.

### Higher-Order Functions:
Higher-order functions are functions that take other functions as arguments or return functions as their results. They enable function composition and provide a powerful way to abstract over common patterns and behaviors.

### Function Composition:
Function composition is the act of combining two or more functions to create a new function. This technique allows you to break down complex problems into smaller, composable parts.

###Recursion:
Recursion is a technique where a function calls itself to solve smaller instances of the same problem. It's a fundamental concept in functional programming and is often used in place of looping constructs.

### Map, Filter, and Reduce:
These higher-order functions are commonly used in functional programming to manipulate collections of data.

	*Map: Transforms each element of a collection.
	*Filter: Selects elements from a collection based on a condition.
	*Reduce: Aggregates elements of a collection into a single value.
### Partial Application and Currying:
Partial application involves fixing a certain number of arguments to a function, creating a new function with fewer arguments. Currying is a technique where a function that takes multiple arguments is transformed into a series of functions, each taking a single argument. Both techniques allow for more flexible and reusable function compositions.

### Monads:
Monads are a concept from category theory, often used in functional programming to manage side effects in a pure functional way. They provide a structured approach to dealing with computations that involve impure actions.

### Tail Call Optimization:
Tail call optimization is a technique used to optimize recursive function calls, preventing stack overflow errors in certain cases.

These are some of the common patterns and techniques used in functional programming. It's important to note that the choice of patterns depends on the specific problem and the programming language being used. Many modern programming languages support functional programming features, making it easier to apply these patterns effectively.
