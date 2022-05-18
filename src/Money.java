import java.text.DecimalFormat;
import java.util.Scanner;

public class Money {
    public static int[] findAmount(float value, int[] arr){
        /*
        Recursive function to find each coin
        Input:
            value (float): Cents value
            int[]: Integer array with 5 zeros for each coin

        Returns array with number of occurence for each coin
        */
        if (value >= 0.5f && value < 1.0f){
            arr[0] ++;
            float remainder = value - 0.5f;
            return findAmount(remainder, arr);
        }
        else if (value >= 0.25 && value < 0.5){
            arr[1] ++;
            float remainder = value - 0.25f;
            return findAmount(remainder, arr);
        }
        else if (value >= 0.1 && value < 0.25){
            arr[2] ++;
            float remainder = value - 0.1f;
            return findAmount(remainder, arr);
        }
        else if (value >= 0.05 && value < 0.1){
            arr[3] ++;
            float remainder = value - 0.05f;
            return findAmount(remainder, arr);
        }
        else if (value >= 0.00 && value < 0.05){
            arr[4] ++;
            float remainder = value - 0.01f;
            return findAmount(remainder, arr);
        }
        else {
            return arr;
        } 
    }
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); // Start scanner object
        System.out.println("Enter amount in dollars");
        float amount = myObj.nextFloat();
        myObj.close(); // Close scanner object
        // Process user input
        double round = Math.floor(amount);
        DecimalFormat df = new DecimalFormat("#.##");
        float cents = Float.parseFloat(df.format(amount - round));
        int[] intArray = {0, 0, 0, 0, 0};
        int [] result = findAmount(cents, intArray);
        System.out.println("You have");
        System.out.println();
        // Print result
        System.out.println(round + " Dollar(s)");
        for (int i = 0; i < result.length; i++){
            if (result[i] != 0){
                switch (i){
                    case 0: System.out.println(result[i] + " 50 Cent(s)"); break;
                    case 1: System.out.println(result[i] + " Quater(s)"); break;
                    case 2: System.out.println(result[i] + " Dime(s)"); break;
                    case 3: System.out.println(result[i] + " Nickel"); break;
                    case 4: System.out.println(result[i] + " Cent(s)"); break;
                }
            } 
        } 
    }
    
}
