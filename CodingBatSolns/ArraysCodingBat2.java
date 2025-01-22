/*
*  rotateLeft3
*/
public int[] rotateLeft3(int[] nums) 
{
  int tempNum1 = nums[0];
  nums[0] = nums[1];
  nums[1] = nums[2];
  nums[2] = tempNum1;
  return nums;
}


/*
* reverse3
*/
public int[] reverse3(int[] nums) 
{
  int tempNum1 = nums[0];
  nums[0] = nums[2];
  nums[2] = tempNum1;
  return nums;
}


/*
* maxEnd3
*/
public int[] maxEnd3(int[] nums) 
{
  if (nums[0]==nums[2])
  {
    nums[1] = nums[2];
  }
  else if (nums[2]>nums[0])
  {
    nums[0]=nums[2];
    nums[1]=nums[2];
  }
  else if (nums[0]>nums[2])
  {
    nums[1]=nums[0];
    nums[2]=nums[0];
  }
  else
  {
    return nums;
  }
  return nums;
}


/*
* sum2
*/




/*
* middleWay
*/
public int[] middleWay(int[] a, int[] b) 
{
  int[] newArr = {a[1], b[1]};
  return newArr;
}


/*
* makeEnds
*/
public int[] makeEnds(int[] nums) 
{
  int[] newArr = {nums[0], nums[nums.length-1]};
  return newArr;
}





