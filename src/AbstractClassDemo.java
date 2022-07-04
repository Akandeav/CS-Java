//parent class
abstract class Animal
{
  //concrete method
  public void show1()
  {
    System.out.println("Concrete method of parent class Class");
  }
  //abstract method
  abstract public void show2();
  }
//child class
class Dog extends Animal
{
  // Must Override this method while extending the parent class
  public void show2()
  {
    System.out.println("Overriding abstract method of parent class");
  }
  //Overriding concrete method is not compulsory
  public void show1()
  {
    System.out.println("Overriding concrete method of parent class");
  }
}
public class AbstractClassDemo
{
  public static void main(String[] args)
  {
    Dog obj = new Dog();
    obj.show2();
    obj.show1();
  }
}