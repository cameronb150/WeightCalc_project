import java.util.Scanner;

public class PeopleWeights {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      final int NUM_ELEMENTS = 5;

      int i;



      double [] userNums = new double[NUM_ELEMENTS];

      for (i=0; i < NUM_ELEMENTS; ++i){
         System.out.println("Enter weight "+ (i +1) +  ":" );
         userNums[i] = scnr.nextDouble();


      }
      System.out.print("");
      System.out.print("You entered: ");
      System.out.print("");


      for(i =0; i < NUM_ELEMENTS; ++i){
         System.out.print(userNums[i] + " ");
      }
      System.out.println("");

      double totalWeight = 0.0;

      for(i=0; i < NUM_ELEMENTS; ++i){
         totalWeight += userNums[i];
      }
      System.out.println("");
      System.out.println("Total weight: "+ totalWeight);

      double averageWeight = 0.0;
      averageWeight = totalWeight / NUM_ELEMENTS;
      System.out.println("Average weight: "+ averageWeight);

      double maxWeight = userNums[0];

      for (i=0; i < NUM_ELEMENTS; ++i){
         if(userNums[i] > maxWeight){
            maxWeight = userNums[i];
         }
      }
      System.out.println("Max weight: " + maxWeight);
      return;


   }
}

