package Classes;

public class studentProfile {
    String firstName;
    String lastName;
    double expectedYearToGraduate;
    double gpa;
    public studentProfile(String firstName,String lastName,double expectedYearToGraduate,double gpa){
        this.firstName=firstName;
        this.lastName=lastName;
        this.expectedYearToGraduate=expectedYearToGraduate;
        this.gpa=gpa;
    }
    public void incrementExpectedGraduationYear(){
        this.expectedYearToGraduate=this.expectedYearToGraduate+1;

    }
    public void display(){
        System.out.println(firstName+""+lastName+""+expectedYearToGraduate+""+gpa);
    }

    public static void main(String[] args) {
        studentProfile s1 = new studentProfile("abhiram","jayanthi",2022,7.2);
        s1.incrementExpectedGraduationYear();
        s1.display();
    }

}
