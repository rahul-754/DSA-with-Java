package oops;

public class getterandsetters {
    public static void main(String[] args) {
        pen p=new pen();
        p.setColor("blue");
        System.out.println(p.getcolor());
        p.setTip(5);
        System.out.println(p.getTip());
    }
}
class pen{
    private String color;
    private int tip;
    String getcolor(){
        return this.color;
    }
   void setColor(String newcolor){
    color=newcolor;
   }
    int gettip(){
    return tip;
   }
    void setTip(int newTip){
    tip=newTip;
   }
 String getColor() {
    return color;
}
public int getTip() {
    return tip;
}
}
