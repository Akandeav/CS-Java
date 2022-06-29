import java.util.Scanner;
// AKANDE VICTOR ADEOLA
public class CircleProblems {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What do you want to calculate: area or circumference or sector");
        String formula = in.nextLine();
        switch(formula){
            case "area":{
                System.out.println("Enter radius");
                double rad = in.nextDouble();
                Circle circle = new Circle(rad);
                System.out.println("Area of circle is: " + circle.getArea() );
                break;
            }
            case "circumference":{
                System.out.println("Enter radius");
                double rad = in.nextDouble();
                Circle circle = new Circle(rad);
                System.out.println("Circumference of circle is: " + circle.getCircumference() );
                break;
            }
            case "sector":{
                System.out.println("Enter radius");
                double rad = in.nextDouble();
                System.out.println("Enter degree");
                double deg = in.nextDouble();
                Circle circle = new Circle(rad, deg);
                System.out.println("Area of sector is: " + circle.getSector() );
                break;
            }
            default:{
                System.out.println("This operation is not allowed");
            }
        }
        in.close();

    }
}
