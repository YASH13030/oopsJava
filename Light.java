class Light
{
  public static void main (String args[])
  {
    
int ls;
    long days;
    long seconds;
    long distance;
     

      ls = 186000;
     
days = 590;		
      seconds = days * 24 * 60 * 60;	
      distance = ls * seconds;	
      System.out.print ("In " + days);
     
System.out.print (" days light will travel ");
     
System.out.println (distance + " miles.");
}
    
} 
