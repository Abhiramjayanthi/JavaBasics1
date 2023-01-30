package inputOutput;

public class studentsInfo {
    public static void main(String[] args) {
        int studentAge = 21;
        double studentGPA = 7.5;
        char studentFirstInitial = 'j';
        char studentLastInitial = 'm';
        boolean hasPerfectAttendence = true;
        String studentFirstName = "Jayanthi";
        String studentLastName = "Abhiram";
        //CharAt - Its a speacial operator which allows us to access the letters in string with indexes
        char StudentFirstInitial = studentFirstName.charAt(0);
        char StudentLastInitial = studentLastName.charAt(6);
        //Below are print statements
        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(hasPerfectAttendence);
        System.out.println(studentFirstName);
        System.out.println(studentLastName);
        System.out.println("Displaying using charAT operator=="+StudentFirstInitial);
        System.out.println("Displaying using charAT operator=="+StudentLastInitial);
        System.out.println("First name and last name of the student is"+" "+studentFirstName+" "+studentLastName+" "+"and his age is "+studentAge+" "+"and his GPA is "+studentGPA+" "+"and having perfect attendence"+hasPerfectAttendence);

    }
}
