
import java.util.*;

import java.text.DecimalFormat;


public class Solve6 
{
       
    public static void main(String[] args) 
    
    {

       int nooftickets;

       double total = 0, cost;

       String ref,co,circle;


       Scanner sc = new Scanner(System.in);

       System.out.println("Enter  The Number Of Ticket ");


       nooftickets=sc.nextInt();

       if(nooftickets<5 || nooftickets>40)
       {
              System.out.println("Minimum n of tickets is 5  and maximum no of tickets are 40");

              System.exit(0);

       }

       System.out.println("Do you want refreshment ?? ");

       ref = sc.next();

       System.out.println("Do you want to use coupon code  ?? ");

       co= sc.next();

       System.out.println("Enter the circle ");

       circle =sc.next();


       if(circle.charAt(0)=='k') 
       
              cost= 75*nooftickets;

              else if(circle.charAt(0)=='q')
              {
                     cost=150*nooftickets;

              }

              else
              {
                     System.out.println("Invalid Input");

                     return;
              }


              total= cost;

              if(nooftickets>20)

              cost= cost-((0.1)*cost);

              total=cost;

              if(ref.charAt(0)=='y')

              total = cost-((0.02)*cost);

              if(ref.charAt(0)=='y')

              total+= ((50)*nooftickets);

              System.out.println("Total Ticket Cost" + " " + total);

    }

}



