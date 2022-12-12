package polymorphism;
public class Rectangle extends shape {

    @Override
    public void computeArea(){
        super.getData();
        System.out.println("Area of Rectangle: "+x*y);

    }
}
