/*
* Coding Bat recursion 1
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


