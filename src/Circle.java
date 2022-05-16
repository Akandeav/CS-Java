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
      // Nested loops
      int i = 1;
      int j = 1;
      int k = 1;
      if (i > k){
          if (j > k ){
              System.out.println("i and j are greater than k");
          }
      }
      else {
          System.out.println("i is less than or equal to k");
      }
      // Nested loops ends
    }
}