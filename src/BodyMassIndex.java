import java.util.Scanner;
public class BodyMassIndex {
    static double calcBMI(float height, float weight){
        return weight / (height * height);
    }
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in kilograms");
        float w = input.nextFloat();
        System.out.println("Enter your height in meters");
        float h = input.nextFloat();
        input.close();
        double BMI = calcBMI(h, w);
        if (BMI < 18.5) System.out.println("You are underweight");
        else if (BMI >= 18.5 || BMI < 25.0 ) System.out.println("You are Normal weight");
        else if (BMI >= 25.0 || BMI < 30.0 ) System.out.println("You are overweight");
        else if (BMI >= 30.0 ) System.out.println("You are Obese");
        System.out.println(Byte.TYPE);
    }
}
