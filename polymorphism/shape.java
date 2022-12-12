package polymorphism;
import java.util.Scanner;

abstract class shape {
    protected int x,y;
    public int phone = 12345;
    protected void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of X and Y");
        x=sc.nextInt();
        y=sc.nextInt();
    }

    public void displayData(){
        System.out.println("Value of X: "+x+"Value of Y: "+y);
    }
    abstract public void computeArea();
}
