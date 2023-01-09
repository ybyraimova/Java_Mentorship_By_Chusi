package classWork.oop.inheritance;

public class Feline extends Animal {
    String specie;
    String habitat;

    public Feline(int age){
        super(true, "Feline", age);

    }

    public Feline(String type){
        super(true, "Feline", 4);

    }

    public void meow(){

    }

    public void play(){
        System.out.println(specie + "which is " + age  + " years old is playing" );
    }

    public static void main(String[] args) {
        Feline feline1 = new Feline(4);
        feline1.type = "white";

    }
}
