import java.util.Scanner;

public class CalculatorApplication {

	public static void main(String[] args) 
	{
		 CalculatorApplication obj=new CalculatorApplication();
		 Scanner sc = new Scanner(System.in);
         
         do
         {
        	 
             System.out.print("Choose an Operation(*,+,-,/,%):");
        	 String input=sc.nextLine();
        	 char ch=input.charAt(0);
             
              if(input.length()!=1)
             {
            	 System.out.println("Wrong Input Please try Again");
             }
             else
             {
            	 obj.chooseOperation(ch);
             }
             
             
             boolean exit = obj.exitProgram();
             
            
             
            if(exit)
            {
            	break;
            }
            
            
         }while(true);
         
         
         System.out.println("Thanks for using");
         
         
         
	}
	
	public boolean exitProgram()
	{
		int times=0;
        int retry=5;
        boolean exit=false;
        Scanner sc = new Scanner(System.in);
        
		 for(times=0;times < retry;times++)
         {
        	 System.out.print("Do you want to continue (y/n)?");
             String exitinput=sc.nextLine();
             char ch1=exitinput.charAt(0);
             
             if(exitinput.length()==1 && ch1 =='n')
             {
            	 return true;
//            	 exit=true;
//            	 break;
             } 
             else if(exitinput.length()==1 && ch1 =='y')
             {
            	 return false;
             } 
             else
             {
            	 System.out.println("Wrong input");

             }
         }
		 if(times>=retry)
         {
         	System.out.println("Maximum retry count exceeded! Exiting forcefully");
         	return true;
         }
		 return false;
	}
	
	public int getInteger()
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		return num;
		
	}

	public void chooseOperation(char ch)
	
	{
		switch(ch)
        {
        case '*':
         int num1=getInteger();
         int num2=getInteger();
       	 System.out.println("Multiply :"+ (num1*num2));
       	 break;
       	 
        case '+':
         int num3=getInteger();
         int num4=getInteger();
       	 System.out.println("Addition :"+ (num3+num4));
       	 break;
       	 
        case '-':
         int num5=getInteger();
         int num6=getInteger();
       	 System.out.println("Substraction :"+ (num5-num6));
       	 break;
       	 
        case '/':
         int num7=getInteger();
         int num8=getInteger();
         if(num8==0)
         {
        	 System.out.println("Divide by zero error");
        	 break;
         }
       	 System.out.println("Divison :"+ (num7/num8));
       	 break;
       	 
        case '%':
         int num9=getInteger();
         int num10=getInteger();
         if(num10==0)
         {
        	 System.out.println("Divide by zero error");
        	 break;
         }
       	 System.out.println("Module :"+ (num9%num10));
       	 break;
       	 
        default:
       	
       	System.out.println("Unknown Operation");
        }
	}
}
