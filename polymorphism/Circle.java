package polymorphism;
import java.util.Scanner;

public class Circle extends shape{
    private int radius;

//    Circle(int radius){
//        System.out.println("I'm Rectangle!");
//        double area = 3.14*radius*radius;
//        System.out.println("Area of Circle is: "+area);
//    }
    private void greeting()
    {
        System.out.println("I'm Private ... ");
    }


    private void getData1(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        radius=sc.nextInt();
    }

    @Override
    public void computeArea(){
        this.getData1();
        double area = 3.14*radius*radius;
        System.out.println("Area of Circle is: "+area);
    }
}
