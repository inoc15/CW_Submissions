public String alarmClock(int day, boolean vacation) 
{
  if (vacation==true)
  {
    if (day==1||day==2||day==3||day==4||day==5)
    {
      return "10:00";
    }
    else if (day==0||day==6)
    {
      return "off";
    }
  }
  else if (vacation==false)
  {
    if (day==1||day==2||day==3||day==4||day==5)
    {
      return "7:00";
    }
    else if (day==0||day==6)
    {
      return "10:00";
    }
  }
  else
  {
    return "0";
  }
  
return "x";
  
}
