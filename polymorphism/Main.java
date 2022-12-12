package polymorphism;
import java.util.Scanner;

public class Main {
    public void intro()
    {
        System.out.println("Enter choice\r");
        System.out.println("1.Rectangle\r");
        System.out.println("2.Circle\r");
        System.out.println("3.Exit\r");
        System.out.println("================================");
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.intro();
        shape s;
        shape c;
        Scanner input=new Scanner(System.in);
        int selection = input.nextInt();

        while (selection<3)
        {
            switch(selection){
                case 1:
                     s=new Rectangle();
                     s.computeArea();
                     main.intro();
                     break;

                case 2:
                    c = new Circle();
                    c.computeArea();
                    main.intro();
                    break;

                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("INVALID INPUT!\n");
                    main.intro();

            }
            selection = input.nextInt(); // add this
        }


            //Rectangle rectangle = new Rectangle();
//        rectangle.getData();
//        rectangle.computeArea();
//        Circle circle = new Circle();
//        circle.getData();
//        circle.computeArea();
    }
}