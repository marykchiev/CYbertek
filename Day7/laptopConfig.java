package Day7;

import java.util.Scanner;

public class laptopConfig {
	public static void main(String[] args) {
	
		
		
			double screenSize, price = 0;
			String storageType, screenType, cpu, resolution;
			int memory, ram = 0;
			Scanner scan= new Scanner(System.in);
			
			System.out.println("Select screen size:");
			screenSize = scan.nextDouble();
			if(screenSize == 13.3) 
			{
				price=price+200;
			}
			else if (screenSize == 15.0)
			{
				price=price+300;
			}
			else if (screenSize == 17.3) 
			{
				price=price+400;
			}
			
			System.out.println("Select CPU size: ");
			cpu = scan.next();
			if(cpu.equals("i3")) 
			{
				price=price+150;
			}
			else if (cpu.equals("i5"))
			{
					price=price+250;
				}
			else if (cpu.equals("i7"))
				{
					price=price+350;				
				}
					
			System.out.println("Select RAM size");
			ram = scan.nextInt();
			price=price+((ram/4)*50);
			
			
			
			System.out.println("Select storage type:");
				storageType = scan.next();
		
			System.out.println("Enter memory size:");
		        memory=scan.nextInt();
		    if(storageType.equalsIgnoreCase("HDD")) 
		    {
			price=price+((memory/500)*50);
		    }
		    else if (storageType.equalsIgnoreCase("SSD"))
		    {
			price=price+((memory/500)*100);
		}
		      		
		    System.out.println("Enter screen resolution ");
		    resolution = scan.next(); 
		    if(resolution.equalsIgnoreCase("4k")) 
		    {
			price=price+200;
		    }
		    else if(resolution.equalsIgnoreCase("FULLHD"))
		    {
			price=price+100;
		}
		
			        
		    System.out.println("Laptop price is: " + price);		
			}
		
		}
			
