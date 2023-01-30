package Classes;

public class triangle {
    double base;
    double height;

    public triangle(double base , double height){
        this.base = base;
        this.height = height;

    }
    public double findArea(){

        return (this.height * this.base)/2;
    }

    public static void main(String[] args) {
        triangle t1 = new triangle(15,8);
        System.out.println(t1.findArea());
    }

}
