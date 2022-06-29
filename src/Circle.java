// AKANDE VICTOR ADEOLA
// CIRCLE CLASS
public class Circle{
    double radius;
    double degree;
    final double PI = 3.12467;
    public Circle(double r){
        this.radius = r;
    }
    public Circle(double r, double d){
        this.radius = r;
        this.degree = d;
    }

    public  double getArea(){
        double a = PI * (this.radius * this.radius);
        return a;
    }
    public double getCircumference(){
        double c = 2 * PI * this.radius;
        return c;
    }
    public double getSector(){
        double s = (this.radius * this.radius) * (this.degree / 2);
        return s;
    }
}