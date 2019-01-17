import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {

    	float a,b ,res;
        char choice, ch;
        Scanner scanner = new Scanner(System.in);
        do{
        System.out.print("1. add two numbers\n");
        System.out.print("2. exit\n\n");
        System.out.print("Enter your choice");

        choice=scanner.next().charAt(0);
        switch(choice)
        {
            case '1' : System.out.print("Enter two Number: ");//Adding
                        a=scan.nextFloat();
                        b=scan.nextFloat();
                        res= a+b;
                        System.out.print("Result ="+res);
                        break;
            case '2' :  System.exit(0);//Exiting
                       break;
            default : System.out.print("Invalid Choice");
            break;
        }
    System.out.print("\n---------------------\n");
    }while(choice!=2);
}
}
