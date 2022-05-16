import java.util.Scanner;
public class AssignmentZeller {
    static int zellerCongruence(int q, int m, int y) {
        /*
        Calculates the day of the week 
        input:
            q (int): day of the month
            m (int): month of the year
            y (int): year
            
        returns 
            integer indicating the day of the week
        */
        int h;
        int j = (y / 100);
        int k = y % 100;
        int e = ((26 * (m + 1)) / 10);
        h = (q + e + k + (k / 4) + (j / 4) + (5 * j)) % 7; 
        return h;
    }
    public static void main (String[] args){
        Scanner input = new Scanner(System.in); // Create scanner object
        System.out.println("Enter year: (e.g., 2020): ");
        int year = input.nextInt();
        System.out.println("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.println("Enter the day of the month: 1-31: ");
        int day = input.nextInt();
        input.close(); // Close scanner object
        int dayOfWeek = zellerCongruence(day, month, year);
        switch (dayOfWeek) {
            case 0:  System.out.println("That is Saturday"); break;
            case 1:  System.out.println("That is Sunday"); break;
            case 2:  System.out.println("That is Monday"); break;
            case 3:  System.out.println("That is Tuesday"); break;
            case 4:  System.out.println("That is Wednesday"); break;
            case 5:  System.out.println("That is Thursday"); break;
            case 6:  System.out.println("That is Friday"); break;
            
        }
        
       
    }
}