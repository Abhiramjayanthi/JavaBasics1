package Classes;
public class diffTypesOfVariables {
    //instance variable and these are nothing but non static variable
    int i=10;
    static int z=20;
    void printName(){
        //local variable
        //you can only access this a inside this method and you cannot access outside
        String a;
        a="abhi";
        System.out.println(a);
    }
    public static void main(String[] args) {
        //local variable object creation
        diffTypesOfVariables myname = new diffTypesOfVariables();
        myname.printName();

        //instance variable object creation
        diffTypesOfVariables num = new diffTypesOfVariables();
        System.out.println(num.i);

        //static variable for this no need to create a object
        System.out.println(z);



    }
}
