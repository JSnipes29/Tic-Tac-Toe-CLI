public class Function
{
  public static boolean tryParseInt(String number)
  {
    try
    {
      int x = Integer.parseInt(number);
      return true;
    
    }
    catch(Exception e)
    {
      return false;
      
      
    }
    
    
  }
  
  
  
}