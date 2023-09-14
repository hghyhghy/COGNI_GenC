

import java.util.*;

import java.text.*;


public class Solve1 

{

       public static void main(String[] args) 
       
       {
         
              DecimalFormat df= new DecimalFormat("0.00");

              Scanner sc= new Scanner(System.in);

              System.out.println("Enter the Quantity of diesel in the tank");


              int ltt= sc.nextInt();

              double lt= (ltt*1.00);

              if(ltt<1)
              {
                     System.out.println("Invalid NUmber");

                     System.exit(0);
              }


              System.out.println("Enter the distance to be covered until the tank goes dry");

              int dff= sc.nextInt();

              double df1=(dff*1.00);


              if(dff<1)
              {
                     System.out.println("Invalid Number");

                     System.exit(0);

              }


              double hundered=((lt/df1)*100);

              System.out.println("litre/Kilometer");

              System.out.println(df.format(hundered));


              double hundered1= (df1*0.6214);

              double hundered2= (lt*0.2642);


              double mg= (hundered1/hundered2);

              System.out.println("miles/gallon");

              System.out.println(df.format(mg));

       }

}
