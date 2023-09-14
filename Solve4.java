
import java.util.*;

import java.text.*;


public class Solve4 

{
         public static void main(String[] args) 
         
         
         {
               Scanner sc= new Scanner(System.in);

               System.out.println("Enter the number of students in cse");

               int cse=sc.nextInt();

               System.out.println("Enter the number of students in ece");

               int ece=sc.nextInt();

               System.out.println("Enter the number of students in mech");

               int mech=sc.nextInt();


               // setting the logic

               if(cse<0|| ece<0 || mech<0)
               {
                     System.out.println("Invalid Number");
               }

               else
               {

               


                if(cse==ece&&ece==mech&&cse==mech)
               {
                    System.out.println("All Stream got same placements");
               }


               else if(cse==ece&&cse>mech)
               {
                     System.out.println("Highest Placement");

                     System.out.println("CSE");

                     System.out.println("ECE");

               }
               
                
               else if(cse==mech&&cse>ece)

               {
                     System.out.println("Highest Placement");


                     System.out.println("CSE");

                     System.out.println("MECH");


               }


               else if(ece==mech&&ece>cse)

               {

                     System.out.println("Highest placements");

                     System.out.println("ECE");

                     System.out.println("MECH");
               }


               else if(cse>mech&&cse>ece)

               {
                     System.out.println("Highest Placement");

                     System.out.println("CSE");

               }


               else if(ece>mech)

               {
                     System.out.println("Highest Placement");

                     System.out.println("ECE");
               }

               else
               {
                     System.out.println("Highest Placement");

                     System.out.println("MECH");
               }



               



         }

         

                  }
}
