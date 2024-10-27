import java.util.*;
class Demo{
	public final static void clearConsole() {  
     try { 
           final String os = System.getProperty("os.name");  
           if (os.contains("Windows")) { 
               new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
           } else { 
                System.out.print("\033[H\033[2J");  
                System.out.flush(); 
              } 
       } catch (final Exception e) { 
            e.printStackTrace(); 
            // Handle any exceptions. 
        } 
     }
	public static void main (String args[]){
		homePage();
	}
	public static void homePage(){
	Scanner input=new Scanner(System.in);	 	
     System.out.println("\t\t\t __   ______   ________  ________"); 
     System.out.println("\t\t\t|  \\ /      \\ |        \\|        \\");
     System.out.println("\t\t\t \\$$|  $$$$$$\\| $$$$$$$$ \\$$$$$$$$");
     System.out.println("\t\t\t|  \\| $$   \\$$| $$__       | $$");   
     System.out.println("\t\t\t| $$| $$      | $$  \\      | $$");   
     System.out.println("\t\t\t| $$| $$   __ | $$$$$      | $$");   
	 System.out.println("\t\t\t| $$| $$__/  \\| $$_____    | $$");   
	 System.out.println("\t\t\t| $$ \\$$    $$| $$     \\   | $$");   
	 System.out.println("\t\t\t \\$$  \\$$$$$$  \\$$$$$$$$    \\$$");   
	 System.out.println("");
	 System.out.println("");
                                  

	 System.out.println("  _______             __   __   _____              _         _____   _    _   _                   _______    ____    _____");  
	 System.out.println(" |__   __|     /\\     \\ \\ / /  / ____|     /\\     | |       / ____| | |  | | | |          /\\     |__   __|  / __ \\  |  __ \\"); 
	 System.out.println("    | |       /  \\     \\ V /  | |         /  \\    | |      | |      | |  | | | |         /  \\       | |    | |  | | | |__) |");
	 System.out.println("    | |      / /\\ \\     > <   | |        / /\\ \\   | |      | |      | |  | | | |        / /\\ \\      | |    | |  | | |  _  /"); 
	 System.out.println("    | |     / ____ \\   / . \\  | |____   / ____ \\  | |____  | |____  | |__| | | |____   / ____ \\     | |    | |__| | | | \\ \\"); 
	 System.out.println("    |_|    /_/    \\_\\ /_/ \\_\\  \\_____| /_/    \\_\\ |______|  \\_____|  \\____/  |______| /_/    \\_\\    |_|     \\____/  |_|  \\_\\");
	 System.out.println("");
	 System.out.println("");                                                                                                                            
	 System.out.println("================================================================================================================================");
	 System.out.println("");
	 System.out.println("");                                                                                                                            
	 System.out.println("\t\t[1] withholding Tax ");
	 System.out.println("\t\t[2] Payable Tax");                                  
	 System.out.println("\t\t[3] Income Tax");
	 System.out.println("\t\t[4] Social Security Levy (SSCL) Tax");                                  
	 System.out.println("\t\t[5] Leasing Payment");
	 System.out.println("\t\t[6] Exit");
	 System.out.println("");
	 System.out.println("");
	 
	 System.out.print("\t\tEnter an option to continue ->");
	 int option = input.nextInt();
     clearConsole();
      switch(option){
		    case 1:withholdingTax(); break;
		    case 2:PayableTax(); break;
		    case 3:IncomeTax(); break;
		    case 4:SocialSecurityLevySSCLtax(); break;
		    case 5:LeasingPaymentTax(); break;
		    default:System. exit (0); break;
		   }
      }
          public static void withholdingTax(){
		  Scanner input=new Scanner(System.in);
		  System.out.println("\t\t\t-------------------------------------------");
		  System.out.println("|\t\t\t\t withholding Tax\t\t\t\t|");
		  System.out.println("\t\t\t-------------------------------------------");
          System.out.println("\t\t[1] Rent Tax ");
	      System.out.println("\t\t[2] Bank Interest Tax");                                  
	      System.out.println("\t\t[3] Dividend Tax");
	      System.out.println("\t\t[4] Exit");    
		  
	       System.out.print("Enter an option to continue -> ");
	       int option = input.nextInt();	  
		  clearConsole();
		  switch(option){
			  case 1:RentTax(); break;
			  case 2:BankInterestTax();break;
			  case 3:DividendTax();break;
			  default: homePage();break;
			  }
	  }
		
		public static void RentTax(){
		Scanner input=new Scanner(System.in);	
		  System.out.println("\t\t\t-------------------------------------------");
		  System.out.println("\t\t\t\t| Rent Tax|\t\t\t\t");
		  System.out.println("\t\t\t-------------------------------------------");
	      System.out.print("Enter your rent :");
	      int rent = input.nextInt();
	      clearConsole();	 
	      	 if(rent<=100000 & rent>0){
				 System.out.println("\t\tyou don't have to pay rent tax... ");
				 System.out.println("\t\t Do you want to calculate another rent tax(Y/N) : ");
				 String yn=input.next().toLowerCase();
				 clearConsole();
				      if(yn.equals("y")){
						  RentTax();
						  }else{
				             withholdingTax();
				          }
	      	 }else if(rent<0){
				 System.out.println("Invalid Input...");
				  System.out.println("\t\t Do you want to correct value again(Y/N) : ");
				  String yn1=input.next().toLowerCase();
				  clearConsole();
				      if(yn1.equals("y")){
						  RentTax();
						  }else{
				             withholdingTax();
				          }
			 }else if(rent>100000){
				 double renttax=(rent-100000)*10/100;
				  System.out.println("you have to pay rent tax: "+renttax);
				  System.out.print("\t\t Do you want to calculate another rent tax(Y/N) : ");
				  String yn2=input.next().toLowerCase();
				  clearConsole();
				      if(yn2.equals("y")){
						  RentTax();
						  }else{
				             withholdingTax();
				          }
		 } 
			 }
          public static void BankInterestTax(){
		  Scanner input=new Scanner(System.in);	
		  System.out.println("\t\t\t-------------------------------------------");
		  System.out.println("|\t\t\t\t Bank Interest Tax\t\t|");
		  System.out.println("\t\t\t-------------------------------------------");
	      System.out.print("Enter your bank interest per year :");
	      int  bankinterest = input.nextInt();
	          if( bankinterest<0){
				   System.out.println("Invalid Input...");
				  System.out.println("\t\t Do you want to correct value again(Y/N) : ");
				  String yn1=input.next().toLowerCase();
				  clearConsole();
				      if(yn1.equals("y")){
						  BankInterestTax();
						  }else{
				             withholdingTax();
				          }
				  }
                  double bankinterestTax=bankinterest*5/100;
                    System.out.println("\t\t you have to pay bank interest Tax per year:  "+bankinterestTax);
                    System.out.println("\t\t Do you want to calculate another bank interest tax per year(Y/N) : ");
				  String yn2=input.next().toLowerCase();
				  clearConsole();
				      if(yn2.equals("y")){
						  BankInterestTax();
						  }else{
				             withholdingTax();
				          }
      
          }
          
          public static void DividendTax(){
		Scanner input=new Scanner(System.in);	
		  System.out.println("\t\t\t-------------------------------------------");
		  System.out.println("|\t\t\t\t Dividend Tax|");
		  System.out.println("\t\t\t-------------------------------------------");
	      System.out.print("Enter your total dividend per year :");
	      int dividend = input.nextInt();
	      clearConsole();
            
            if(dividend<=100000 & dividend >0){
				 System.out.println("\t\tyou don't have to pay dividend tax... ");
				 System.out.print("\t\t Do you want to calculate another dividend tax(Y/N) : ");
				 String yn=input.next().toLowerCase();
				  
				      if(yn.equals("y")){
						DividendTax();
						  }else{
				             withholdingTax();
				          }
			}else if(dividend>100000){
				 double dividendtax=(dividend-100000)*14/100;
				  System.out.println("you have to pay dividend tax per year: "+dividendtax);
				  System.out.print("\t\t Do you want to calculate another dividend tax(Y/N) : ");
				  String yn2=input.next().toLowerCase();
				   
				      if(yn2.equals("y")){
						  DividendTax();
						  }else{
				             withholdingTax();
				          }
		      } 
       
       
           }
           
          public static void PayableTax(){
		  Scanner input=new Scanner(System.in);
		  System.out.println("\t\t\t-------------------------------------------");
		  System.out.println("|\t\t\t\t PAYABLE Tax|");
		  System.out.println("\t\t\t-------------------------------------------");
             System.out.print("Enter your employee payment per month :");
	         double salary = input.nextDouble();
	         double tax=0;
              if(salary<=100000 &  salary >0){
				 System.out.println("\t\tyou don't have to pay payable tax... ");
				 System.out.print("\t\t Do you want to calculate another payable tax(Y/N) : ");
				 String yn=input.next().toLowerCase();
				  
				      if(yn.equals("y")){
						  PayableTax();
						  }else{
				             homePage();
				          }
		       
			  }else if(salary<=141667){
				 tax=(salary-100000)*6/100;
			  }else if(salary<=183333){
				 tax=(41667*6/100)+((salary-141667)*12/100);
			  }else if(salary<=225000){
				 tax=(41667*6/100)+(41667*12/100)+((salary-183333)*18/100);
			  }else if(salary<=266667){
				 tax=(41667*6/100)+(41667*12/100)+(41667*18/100)+((salary-225000)*24/100); 
			  }else if(salary<=308333){
				 tax=(41667*6/100)+(41667*12/100)+(41667*18/100)+(41667*24/100)+((salary-266667)*30/100);
			  }else{
				tax=(41667*6/100)+(41667*12/100)+(41667*18/100)+(41667*24/100)+(41667*30/100)+((salary-308333)*36/100);
			}
			 System.out.println("\t\t you have to pay payable tax per month :"+Math.round(tax));
				 System.out.print("\t\t Do you want to calculate another payable tax(Y/N) : ");
				 String yn1=input.next().toLowerCase();
				  
				      if(yn1.equals("y")){
						  PayableTax();
						  }else{
				             homePage();
				          }
				 
				}
				
				   public static void IncomeTax(){
		           Scanner input=new Scanner(System.in);
		           System.out.println("\t\t\t-------------------------------------------");
		           System.out.println("|\t\t\t\t Income Tax|");
		           System.out.println("\t\t\t-------------------------------------------");
              
                   System.out.print("Enter your total income per year :");
	               double income = input.nextDouble();
	               double tax=0;
                   if(income<=1200000 &  income >0){
				   System.out.println("\t\tyou don't have to income tax... ");
				   System.out.print("\t\t Do you want to calculate another Income tax(Y/N) : ");
				   String yn=input.next().toLowerCase();
				  
				          if(yn.equals("y")){
						  IncomeTax();
						  }else{
				             homePage();
				          }
                   }else if(income<=1700000){
				   tax=(income-1200000)*6/100;
			       }else if(income<=2200000){
				   tax=(500000*6/100)+((income-1700000)*12/100);
			       }else if(income<=2700000){
				   tax=(500000*6/100)+(500000*12/100)+((income-2200000)*18/100);
			       }else if(income<=3200000){
				   tax=(500000*6/100)+(500000*12/100)+(500000*18/100)+((income-2700000)*24/100); 
			       }else if(income<=3700000){
				    tax=(500000*6/100)+(500000*12/100)+(500000*18/100)+(500000*24/100)+((income-3200000)*30/100);
			       }else{
				   tax=(500000*6/100)+(500000*12/100)+(500000*18/100)+(500000*24/100)+(500000*30/100)+((income-3700000)*36/100);
			        }
			        System.out.println("\t\t you have to pay Income per year :"+Math.round(tax));
				    System.out.print("\t\t Do you want to calculate another Income Tax(Y/N) : ");
				    String yn1=input.next().toLowerCase();
				  
				      if(yn1.equals("y")){
						   IncomeTax();
						  }else{
				             homePage();
				          }
				 
				   }
       
                public static void SocialSecurityLevySSCLtax(){
		          Scanner input=new Scanner(System.in);
		          System.out.println("\t\t\t-------------------------------------------");
		          System.out.println("|\t\t\t\t Social Security Levy(SSCL)Tax|");
		          System.out.println("\t\t\t-------------------------------------------");
                   
                   System.out.print("Enter value of Good or Service :");
	               double goodsvalue = input.nextDouble();
			       double saletax=goodsvalue*2.5/100;
			       double valueaftersaletax=goodsvalue+saletax;
			       double vat=valueaftersaletax*15/100;
			       double SSCL=saletax+vat;
			                
							 if(goodsvalue>0){
									System.out.println("You have to pay SSCL tax: "+SSCL);
									}
					System.out.print("\t\t Do you want to calculate another SSCL Tax(Y/N) : ");
				    String yn1=input.next().toLowerCase();
				  
				      if(yn1.equals("y")){
						   SocialSecurityLevySSCLtax(); 
						  }else{
				             homePage();
				          }
				 
				   }
			 	   
		  public static void LeasingPaymentTax(){
		  Scanner input=new Scanner(System.in);
		  System.out.println("\t\t\t-------------------------------------------");
		  System.out.println("|\t\t\t\t Leasing Payment|");
		  System.out.println("\t\t\t-------------------------------------------");
          System.out.println("\t\t[1] Calculate Monthly Installment ");
	      System.out.println("\t\t[2] Search Leasing Category");                                  
	      System.out.println("\t\t[3] Find Leasing Amount");
	      System.out.println("\t\t[4] Exit");    
		  
		   System.out.print("Enter an option to continue -> ");
	       int option = input.nextInt();	  
		  clearConsole();
		  switch(option){
			  case 1:CalculateMonthlyInstallment();break;
			  case 2:searchLeasing();break;
			  case 3:findLeasingAmount();break;
			  default:System. exit (0); break;
	  }
}
				 
        public static void CalculateMonthlyInstallment( ) {
        Scanner input = new Scanner(System.in);

         System.out.print("\t\tEnter lease amount: ");
        double leaseAmount = input.nextDouble();
        System.out.print("\t\tEnter annual interest rate: ");
        double annualInt = input.nextDouble();
        System.out.print("\t\tEnter number of years: ");
        int year = input.nextInt();

        if (year > 5) {
            System.out.println("Invalid Input... Enter the correct value again...");
            System.out.print("Do you want to try again? (y/n): ");
            String yn1 = input.next().toLowerCase();

            if (yn1.equals("y")) {
                CalculateMonthlyInstallment(); // Recursive call to retry
            } else {
                LeasingPaymentTax();
            }
            return; // Stop further execution
        }

        double numberOfMonths = year * 12;
        double i = annualInt / 100 / 12;
        double monthlyInstallment = leaseAmount * i / (1 - (1 / Math.pow(1 + i, numberOfMonths)));

        System.out.println("\t\tYour monthly installment: " + String.format("%.2f", monthlyInstallment));
        LeasingPaymentTax();
    }
            
       public static void searchLeasing() {
        Scanner input = new Scanner(System.in);

        System.out.println("\t\t\t\t\t\t+----------------------------------------------------------------------------------+");
        System.out.println("\t\t\t\t\t\t|\t\t\t\t Search Leasing Category\t\t           |");
        System.out.println("\t\t\t\t\t\t+----------------------------------------------------------------------------------+");

        System.out.print("\t\t\t\t\t\t Enter Lease Amount \t\t : ");
        double leaseAmount = input.nextDouble();
        System.out.print("\t\t\t\t\t\t Enter Annual Interest Rate \t : ");
        double annualInt = input.nextDouble();

        if (leaseAmount > 0 && annualInt > 0) {
            double monthlyInstallment;
            for (int year = 3; year <= 5; year++) {
                double numberOfMonths = year * 12;
                double i = annualInt / 100 / 12;
                monthlyInstallment = leaseAmount * i / (1 - (1 / Math.pow(1 + i, numberOfMonths)));
                System.out.println("\t\t\t\t\t\t Your Monthly Installment for " + year + " Year leasing Plan \t : " + String.format("%.2f", monthlyInstallment));
            }

            System.out.print("\t\t\t\t\t\t\t Do you want to Search Another Leasing Category (Y/N) : ");
            char anotherSearch = input.next().charAt(0);
            if (anotherSearch == 'Y' || anotherSearch == 'y') {
                clearConsole();
                searchLeasing();
            } else {
                clearConsole();
                LeasingPaymentTax();
            }
        } else {
            System.out.println("\t\t\t\t\t\t\t\t Invalid Input");
            searchLeasing();
        }
    }
        public static void findLeasingAmount() {
        Scanner input = new Scanner(System.in);

        System.out.print("\t\t\t\t\t\t Enter the Monthly Lease Payment Amount you can afford \t : ");
        double affordAmount = input.nextDouble();
        System.out.print("\t\t\t\t\t\t Enter number of Year \t\t : ");
        int year = input.nextInt();
        System.out.print("\t\t\t\t\t\t Enter Annual Interest Rate \t : ");
        double annualInt = input.nextDouble();

        if (affordAmount > 0 && year <= 5 && annualInt > 0) {
            double numberOfMonths = year * 12;
            double i = annualInt / 100 / 12;
            double leaseAmount = affordAmount / i * (1 - (1 / Math.pow(1 + i, numberOfMonths)));

            System.out.println("\t\t\t\t\t\t Your Lease Amount: " + String.format("%.2f", leaseAmount));

            System.out.print("\t\t\t\t\t\t Do you want to Search Another Lease Amount (Y/N) : ");
            char anotherSearch = input.next().charAt(0);
            if (anotherSearch == 'Y' || anotherSearch == 'y') {
                clearConsole();
                findLeasingAmount();
            } else {
                clearConsole();
                LeasingPaymentTax();
            }
        } else {
            System.out.println("\t\t\t\t\t\t Invalid Input");
            findLeasingAmount();
        }
    }
    }
    
    
	   
		  
	       
	         
	          
			    
			     
                                  
                                            
