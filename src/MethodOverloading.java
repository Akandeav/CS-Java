public class MethodOverloading {
    int w, h;
    public static int add(int a, int b){
        return a + b;
    }
    public static int add (int a, int b, int c){
        return a + b + c;
    }
    public MethodOverloading(int weight, int height){
        this.w = weight;
        this.h = height;

    }
    MethodOverloading(double weight, double height){
        this.h = (int)height;
        this.w = (int)weight;
    }

    public static void main(String[] args){
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));

    }
}
