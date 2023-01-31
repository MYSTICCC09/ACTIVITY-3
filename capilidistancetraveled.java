// THIRD PROGRAMMING EXERCISE //
// SUBMITTED BY: ANDREI N. CAPILI (BSCPE 1-1 - PUP BC)
// DISTANCE TRAVELED (DISTANCE CALCULATOR)

package javafundamentals;

	import java.util.Scanner;
	import java.util.InputMismatchException;
	
	public class capilidistancetraveled {

	    public static void main(String[]args){

	        int hours;
	        int hourCounter = 0;
	        int speed = 0;
	        int unit;
	        Scanner input = new Scanner(System.in);
	        
	        System.out.println("Hello there!, I am designed to to calculate the distance traveled. I am pleased to be your assistant for today!");
	        ;
	        
	        Scanner input1 = new Scanner(System.in);
	        System.out.print("Hi! What's your name?: ");
	        String userName = input1.nextLine();
	        introText(userName);

	     
	        
	        System.out.println("Type 1 for metric or 2 for english units");
	        unit = input1.nextInt();

	        try{

	            if(unit == 1){
	                System.out.println("Enter the speed of the vehicle in kilometers per hour (kp/h)");
	                speed = input1.nextInt();
	            }else if(unit == 2){
	                System.out.println("Enter the speed of the vehicle in miles per hour (mp/h)");
	                speed = input1.nextInt();
	            }else{
	                System.out.println("You have entered an invalid input. Please rerun the program");
	                System.exit(0);
	            }
	          
	            System.out.println("Enter the number of hours the vehicle has traveled");
	            hours = input1.nextInt();
	            input1.close();
	    
	            System.out.println();
	    
	            
	            System.out.println("Time Spent                  Distance Traveled");
	            System.out.println("_____________________________________________");
	            
	            if(unit == 1){
	                for(int loop = 1; loop < hours+1; loop ++){       
	                    if(hourCounter == 1){
	                        hourCounter++;
	                        System.out.println(hourCounter + " Hour" + "                              " + (hourCounter*speed) + " Kilometers");    
	                    }else{
	                        hourCounter++;
	                        System.out.println(hourCounter + " Hours" + "                             " + (hourCounter*speed) + " Kilometers");
	                    }
	                    
	                }
	            }
	            else{

	                for(int loop = 1; loop < hours+1; loop ++){       
	                    if(loop == 1){
	                        hourCounter++;
	                        System.out.println(hourCounter + " Hour" + "                               " + (hourCounter*speed) + " Miles");    
	                    }else{
	                        hourCounter++;
	                        System.out.println(hourCounter + " Hours" + "                             " + (hourCounter*speed) + " Miles");
	                    }
	                    
	                }
	            }
	            
	        }catch(InputMismatchException e){
	            System.out.println("Invalid input. Please rerun the program");
	        }

	    }

		private static void introText(String userName) {
			// TODO Auto-generated method stub
			
		}
	    
	}