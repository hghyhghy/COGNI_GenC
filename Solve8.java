
import java.util.*;

import java.text.DecimalFormat;


public class Solve8 

{
        public static void main(String[] args) 
        
        {
              Scanner sc = new Scanner(System.in);

              System.out.println("Enter the Salary");

              int salary= sc.nextInt();

              System.out.println("Enter the rating ");

              float rating = sc.nextFloat();


              if(salary<1||rating<1.0||rating>5.0)
              {
                     System.out.println("Invalid Input");
                      System.exit(0);

              }

              else if(rating>=1.0&&rating<=3.0)
              {
                     salary=salary+(int)(0.1*salary);

                     System.out.println("The salary is " + " " + salary ) ;
              }

              else if(rating>=3.1&&rating<=4.0)
              {

                     salary=salary+(int)(0.25*salary);

                     System.out.println("The salary is"  + " " + salary);

              }

              else 
              {
                     salary=salary+(int)(0.3*salary);
                     System.out.println("The salary is " + " " + salary);
              }
        }
}
