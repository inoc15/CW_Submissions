/*
* Coding Bat recursion 1
* Authored by: isabelle Inocencio
*/

//recursion 1: factorial 
public int factorial(int n) 
{
  if (n<1)
  {
    return 1;
  }
  else
  {
    return n * factorial(n-1);
  }
}

//recursion 1: bunnyEars
public int bunnyEars(int bunnies) 
{
  if (bunnies==0)
  {
    return 0;
  }
  else 
  {
    return 2 + bunnyEars(bunnies-1);
  }
}


//recursion 1: Fibonacci Sequence 
public int fibonacci(int n) 
{
  if (n==1)
  {
    return 1;
  }
  if ( n==0)
  {
    return 0;
  }
  else
  {
    return fibonacci(n-2)+fibonacci(n-1);
  }
}

