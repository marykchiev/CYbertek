package Day7;

import java.util.Scanner;

public class Ansaer {
	  public static void main(String[] args) {
		    double price = 0;
				String storageType, screenType, cpu;
				int ram = 0 ;
				Scanner scan = new Scanner(System.in);
		    //WRITE YOUR CODE HERE

				double memorySize = 0;
				String screenReso;

				System.out.println("Select screen size:");
				screenType = scan.next();
				switch (screenType) {
				case "13.3":
					price += 200;
					break;
				case "15.0":
					price += 300;
					break;
				case "17.3":
					price += 400;
					break;
				}
				System.out.println("Select CPU type:");
				cpu = scan.next();
				cpu = cpu.toLowerCase();
				switch (cpu) {
				case "i3":
					price += 150;
					break;
				case "i5":
					price += 250;
					break;
				case "i7":
					price += 350;
					break;
				}
				System.out.println("Select RAM size:");
				ram = scan.nextInt();
				price += (ram / 4) * 50;

				System.out.println("Select storage type:");
				storageType = scan.next();
			   storageType = storageType.toUpperCase();

				System.out.println("Enter memory size:");
				memorySize = scan.nextDouble();
				
				switch (storageType) {
				case "HDD":
					price += (memorySize / 500) * 50;
					break;
				case "SSD":
					price += (memorySize / 500) * 100;
				}

				System.out.println("Enter screen resolution:");
				screenReso = scan.next();
				//screenReso = screenReso.toUpperCase();
//				switch (screenReso) {
//				case "FULLHDD":
//					price += 100;
//					break;
//				case "4K":
//					price += 200;
//					break;
//				}
				if(screenReso.equalsIgnoreCase("FULLHD"))
				    price = price+100;
				    else if (screenReso.equalsIgnoreCase("4K"))
				    price=price+200;

				System.out.println("Laptop price is: $"+price);
		  }
		}


