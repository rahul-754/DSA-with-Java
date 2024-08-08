package oops;
abstract class animal{
    String name;
    public animal(String name){
        this.name=name;
    }
    abstract void bark();
    abstract void cry();
    public String getName(String name){
        return name;
    }
}
class dog extends animal{
    public dog(String name){
        super(name);
    }
    public void bark(){
        System.out.println("The dog is barking");
    }
    public void cry(){
        System.out.println("The dog is crying ");
    }
}
public class abs {

    public static void main(String[] args) {
        dog d = new dog("Tony");
        d.bark();
        animal an = new animal();
        System.out.println( an.getName("Rahul"));
    }
}