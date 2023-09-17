

/**
 * Solve10
 */
public class Solve10
 {

       // java program to find a lcm of two number using recursuion 


       static int  gcd(int a, int b)
       {
             if(a==0)
             return b;

             return gcd(b%a,a);
       }


       static int lcm(int a,int b)
       {
              
              return (a/gcd(a,b))*b;
       }
     
       public static void main(String[] args) 
       
       {
            int a= 15;
            
            int b=20;

            System.out.println("The LCM of the number is " + " " +  lcm(a, b));
       }
       
}