/*
*firstLast6: check if 6 is either the first or last number then return true, else return false
*/
public boolean firstLast6(int[] nums) 
{
  if (nums[0]==6||nums[nums.length-1]==6)
  {
    return true;
  }
  else
  {
    return false;
  }
}


/*
*Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
*/
public boolean sameFirstLast(int[] nums) 
{
  if (nums.length==0)
  {
    return false;
  }
  else
  {
    if (nums[0]==nums[nums.length-1])
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}


/*
* Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
*/
public int[] makePi() 
{
  int[]arPi={3, 1, 4};
  return arPi;
}


/*
* Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
*/
public boolean commonEnd(int[] a, int[] b) 
{
  if (a[0]==b[0]||a[a.length-1]==b[b.length-1])
  {
    return true;
  }
  else
  {
    return false;
  }
}


/*
* Given an array of ints length 3, return the sum of all the elements.
*/
public int sum3(int[] nums) 
{
  return nums[0]+nums[1]+nums[2];
}
