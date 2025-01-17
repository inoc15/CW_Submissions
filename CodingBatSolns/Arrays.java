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
