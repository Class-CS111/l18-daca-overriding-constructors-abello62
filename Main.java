/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/
class Main 
{
  public static void main(String[] args) 
	{
      DACArecipient test = new DACArecipient();

      System.out.println("Test: " + test);
      //System.out.println("DACArecipient default");

      DACArecipient test2 = new DACArecipient("Alejandro", "Bello", "123-456-789", "US", 2415021, 2415021, 2415021, 'M');

      System.out.println("Test #2: " + test2);
  }
}