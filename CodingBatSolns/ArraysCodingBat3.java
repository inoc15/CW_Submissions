/*
* Coding Bat 3
* Authored by: Isabelle Inocencio
*/ 

//has23
public boolean has23(int[] nums) 
{
  if (nums[0]==2 || nums[1]==2)
  {
    return true;
  }
  else if (nums[0]==3 || nums[1]==3)
  {
    return true;
  }
  else
  {
    return false;
  }
}

//no23
public boolean no23(int[] nums) 
{
  if (nums[0]==2 || nums[1]==2)
  {
    return false;
  }
  else if (nums[0]==3 || nums[1]==3)
  {
    return false;
  }
  else
  {
    return true;
  }
}

//makeLast
public int[] makeLast(int[] nums) 
{
  int[] newArr = new int [(nums.length)*2];
  int i= 0;
  for (i=0; i<(newArr.length)-1; i++)
  {
    newArr[i]=0;
  }
  newArr[(newArr.length)-1]=nums[(nums.length)-1];
  return newArr;
}

//double23
public boolean double23(int[] nums) 
{
  if (nums.length==0)
  {
    return false;
  }
  else if (nums.length==1)
  {
    return false;
  }
  else 
  {
    if (nums[0]==2 && nums[1]==2)
    {
      return true;
    }
    else if (nums[0]==3 && nums[1]==3)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}

//fix23
public int[] fix23(int[] nums) 
{
  if (nums[0]==2 && nums[1]==3)
  {
    nums[1]=0;
    return nums;
  }
  else if (nums[1]==2 && nums[2]==3)
  {
    nums[2]=0;
    return nums;
  }
  else
  {
    return nums;
  }
}

//start1
public int start1(int[] a, int[] b) 
{
  int counter=0;
 if (a.length>0)
 {
    if (a[0]==1)
  {
    counter++;
  }
 }
 if (b.length>0)
 {
    if (b[0]==1)
  {
    counter++;
  }
 }
  return counter;
}

//biggerTwo
public int[] biggerTwo(int[] a, int[] b) 
{
  int aArr= a[0] + a[1];
  int bArr= b[0] + b[1];
  if (aArr>bArr)
  {
    return a;
  }
  else if (bArr>aArr)
  {
    return b;
  }
  else 
  {
    return a;
  }
}

//makeMiddle
public int[] makeMiddle(int[] nums) 
{
  int midNum = nums[(nums.length)/2-1];
  int midNum2 = nums[(nums.length)/2];
  int[] newArr = {midNum, midNum2};
  return newArr;
  

}

//plusTwo
public int[] plusTwo(int[] a, int[] b) 
{
  int[] newArr = new int [4];
  newArr[0]=a[0];
  newArr[1]=a[1];
  newArr[2]=b[0];
  newArr[3]=b[1];
  return newArr;
}

//swapEnds
public int[] swapEnds(int[] nums) 
{
  int temp = nums[0];
  nums[0]=nums[nums.length-1];
  nums[nums.length-1]=temp;
  return nums;
}

//midThree
public int[] midThree(int[] nums) 
{
  if (nums.length == 3)
  {
    return nums;
  }
  else
  {
    int[] newArr = new int [3];
    newArr[1] = nums[nums.length/2];
    newArr[0] = nums[(nums.length/2)-1];
    newArr[2] = nums[(nums.length/2)+1];
    return newArr;
  }

}


//maxTriple
public int maxTriple(int[] nums) 
{
  int larNum = nums[0];
  if (nums.length==3)
  {
    if (nums[0] <= nums[1])
    {
      larNum = nums[1];
    }
    else
    {
      return larNum;
    }
    if (nums[1]<= nums[2])
    {
      larNum = nums[2];
    }
  }
  else
  {
    if (nums[0] <= nums[nums.length/2])
    {
      larNum= nums[nums.length/2];
    }
    if (nums[nums.length/2] <= nums[nums.length-1])
    {
      larNum = nums[nums.length-1];
    }
  }
  return larNum;
}

//frontPiece
public int[] frontPiece(int[] nums) 
{
  if (nums.length==0)
  {
    return nums;
  }
  else if (nums.length==1)
  {
    return nums;
  }
  else if (nums.length==2)
  {
    return nums;
  }
  else
  {
    int[] newArr = {nums[0], nums[1]};
    return newArr;
  }
}

//unlucky1
public boolean unlucky1(int[] nums) 
{
  if(nums.length<2)
  {
    return false;
  }
  
  if (nums[1]==1)
  {
    if(nums[2]==3)
    {
      return true;
    }
    
  }
  
  if(nums[nums.length-2]==1)
  {
    if(nums[nums.length-1]==3)
    {
      return true;
    }
    
  }
  
  
  
  if (nums[0]==1)
  {
    if(nums[1]==3)
    {
      return true;
    }
    
  }
  
  
  return false;
}



//make2
public int[] make2(int[] a, int[] b) 
{
  int[] newArr = new int [2];
  if (a.length==2)
  {
    return a;
  }
  else if (a.length==0)
  {
    return b;
  }
  else if (a.length==3)
  {
    newArr[0] = a[0];
    newArr[1] = a[1];
    return newArr;
  }
  else
  {
    newArr[0] = a[0];
    newArr[1] = b[0];
    return newArr;
  }

}


//front11
public int[] front11(int[] a, int[] b) 
{
  int[] blankArr = new int [0];
  if (a.length==0 && b.length==0)
  {
    return blankArr;
  }
  else if (a.length==0 && b.length!=0)
  {
    int[] newArr = new int [1];
    newArr[0] = b[0];
    return newArr;
  }
  else if (b.length==0 && a.length!=0)
  {
    int[] newArr = new int [1];
    newArr[0] = a[0];
    return newArr;
  }
  else
  {
    int[] newArr = new int [2];
    newArr[0] = a[0];
    newArr[1] = b[0];
    return newArr;
  }

}
