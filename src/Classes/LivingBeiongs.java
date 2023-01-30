package Classes;
class humans{
    String Intelligent;
    String Imagination;
    String Humanbody;
    public void Char(){
        System.out.println("Humans can are"+Intelligent+"Humans have "+Imagination
        +Humanbody+"having 2 hands and 2 legs");
    }
}
public class LivingBeiongs {
    public static void main(String[] args) {
        humans Humans = new humans();
        Humans.Intelligent = "Intelligent";
        Humans.Imagination="Imagination";
        Humans.Humanbody = "Humanbody";
        Humans.Char();
    }
}
