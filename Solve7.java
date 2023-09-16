import java.util.*;

import java.text.DecimalFormat;

/**
 * Solve7
 */
public class Solve7

{

      public static void main(String[] args)
      
      {
       
             Scanner sc= new Scanner (System.in);

             System.out.println("Enter a Number");

             int n= sc.nextInt();

             int sum=0, r;

             int temp= n;

             if(n>-1)
             {

              while(n>0)
              {
                     r=n%10;

                     sum= (sum*10)+r;

                     n=n/10;


              }

              if(temp==sum)
              System.out.println("Palindrome Number");

              else
              System.out.println("Not A Palindrome Number");

             }

             else{
              System.out.println("Invalid Input");
             }

      }
       
}