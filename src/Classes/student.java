package Classes;
//parameterized constructor
public class student {
    int id;
    double age;
    String name;
    student(int i , double a , String n){
        this.id=i;
        this.age=a;
        this.name=n;
    }
    void display(){
        System.out.println(id+" "+age+" "+name);
    }
    public static void main(String[] args) {
        student s1 = new student(8,21,"abhi");
        s1.display();
    }
}
