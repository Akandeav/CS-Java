public class Circle{
    public static void main(String[] args){
      final double PI = 3.14159;
      final int MINOR = 18;
      double area;
      double radius = 5.0;
      if (radius < 0){
          System.out.println("Incorrect Input");
      }
      else {
          area = radius * radius * 3.14159;
          System.out.println("Area is: " + area);
      }
    }
}