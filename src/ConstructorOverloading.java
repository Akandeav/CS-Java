public class ConstructorOverloading {
    //SAKA MICHELLE 
    // Eu200102-2156
    static int mymethod(int x, int y){
    return x + y ;
}
    static double mymethod(double x, double y){
       return x + y ;
  }
   public ConstructorOverloading(int x, int y){
       System.out.println( "This is  for 1:" + x + "This is for 2:" + y);
   }
   public ConstructorOverloading(double x, double y){
       System.out.println("for 1:" + x + "for 2 :" + y);
   }
     public static void main(String[] args){
         System.out.println(mymethod(5,6));
          System.out.println(mymethod(5.0,6.0));
          ConstructorOverloading over = new ConstructorOverloading(1, 2);

     }
}
