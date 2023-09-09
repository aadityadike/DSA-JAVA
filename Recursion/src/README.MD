# REMEMBER THIS💡

Recursion problems actually follow a pattern of dividing problems into smaller pieces. So, when you encounter a problem,
think about how you can simplify it and break it down into smaller, more manageable parts. Recursion is all about
calling a function itself, ensuring that the returned value is correct, and understanding how to utilize the returned
value.
>     “What is the EASIEST POSSIBLE PROBLEM that requires no extra calculation?”

## STEPS TO SOLVE RECURSION PROBLEMS👇:

1. **Know what your function should do:** The first step to solve recursion problems, is to know what your function is
   supposed to do. This might seem obvious, but it’s an important step that gets glossed over. You need to think about
   what your function should do, not what it currently does.
2. **Pick a sub-problem and assume your function already works on it:** A sub problem is any problem that is smaller
   than
   your original problem.
3. **Take the answer to your sub-problem, and use it to solve for the original problem:** Think about How do we take the
   solution to our sub-problem, and use it to solve the original problem?
4. **You have already solved 99% of the problem. The remaining 1%? Base case:** Your function is calling itself, so it
   will probably run forever. That is why we need to add a base case to stop it.