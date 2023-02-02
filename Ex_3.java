/* F to C */
/* Mya Moxley */
/* Ex_3 */

import java.util.Scanner;

public class Ex_3 {
   static Scanner input = new Scanner(System.in);
   public static void main(String[] args) {
   double f = collectInput();
   while (f > -460){
      double cell = celcius(f);
      display(cell);
      f = collectInput();


   }
   
   
   
}
   static double collectInput(){
      System.out.println("Please enter Temp in fahrenheit");
      double fahr = input.nextDouble();
      return fahr;

   }

   static double celcius(double a){
      double celcius = 9.0/5 * (a - 32);
      return celcius;
      
    
   }

   static void display(double c){
      System.out.println(c);
   }



   

   

}

