import java.util.*;

import java.text.*;

/**
 * Solve2
 */
public class Solve2
 {

       public static void main(String[] args) 
       
       
       {
              
             Scanner sc= new Scanner(System.in);


        System.out.println("Enter the number of pizzas you bought");

             int pizza= sc.nextInt();


        System.out.println("Enter the number of puffs you bought");     


        int puff= sc.nextInt();


        System.out.println("Enter the number of colddrink you bought ");


        int colddrink=sc.nextInt();


        int pizzas= Math.abs (pizza)*100;

        int puffs = Math.abs(puff)*20;

        int colddrinks= Math.abs(colddrink)*10;



        System.out.println("Your Bill Details ");


        System.out.println("NUmber of pizza" + " " + pizza);

                System.out.println("NUmber of puff" + " " + puff);

                        System.out.println("NUmber of colddrink" + " " + colddrink);

                        int total_price;


                   total_price= pizzas+puffs+colddrinks;
                   
               System.out.println("Your Total Price is " + " " + total_price);    

               System.out.println("Enjoy Your Show!! ");

       } 

}