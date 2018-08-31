package modules;

import java.util.Scanner;

public class modulesss
	{
		public static void main(String[] args)
			{
			
				leapYearCalc();
			}

		private static void leapYearCalc()
			{
		
				while (true)
					{
						
						System.out.println("Pick a year and we'll see if it is a leap year");
						Scanner userInput = new Scanner (System.in);
						int userYear = userInput.nextInt();
						if (userYear % 100 == 0)
							
							{
								if (userYear % 400 == 0)
								
									{
										System.out.println("Leap YEar");
									}
								
								else
									{
										System.out.println("Not a Leap Year");
									}
					
					//ok but this is the last time
								//now we're at home
							}
				
	
					}
			}
		
	}
