public class Student {
    // Akande Victor EU210102-2535
    String firstname; 
    String lastname;
    String matricNumber;
    // Constructor Overload
    Student(String first, String last){
        this.firstname = first;
        this.lastname = last;
    }
    public Student(String first, String last, String mat){
        this.firstname = first;
        this.lastname = last;
        this.matricNumber = mat;
    }
    // Method Overload
    public String ReturnMatric(){
        return this.matricNumber;
    }
    public String ReturnMatric(int i){
        return (i + " " + this.matricNumber);
    }

    public static void main(String[] args){
        Student kamiye = new Student("Kamiye", "Owaduge", "EU200102-1111");
        System.out.println(kamiye.ReturnMatric());

        Student victor = new Student("Victor", "Akande");
        System.out.println(victor.ReturnMatric(3068));
    }
}
