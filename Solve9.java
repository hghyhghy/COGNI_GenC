
import java.util.*;




public class Solve9 
{

       public static void main(String[] args)
       
       {
              
             Scanner sc= new Scanner(System.in) ;


             System.out.println("Enter The Car Number ");

             int sum=0;


             int carnum= sc.nextInt();


             if(carnum<0||carnum>9999)

             {
              System.out.println("Invalid Car Number ");


             }

             else
             {

              while(carnum!=0)

              {
                   int l= carnum%10;

                    sum= sum+l;

                   carnum=carnum/10;
                     

              }

              if(sum%3 ==0 || sum%5==0 || sum%7==0)
              {
                     System.out.println("This is your Lucky number ");
              }

              else 
              {
                     System.out.println("This is not your lucky number ");
              }



             }



       }

}
