import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int num;

        System.out.print("Enter a number=");
        num=input.nextInt();

        if(num%2==0){
            System.out.print("This is Even number");
        }
        else if(num==0){
            System.out.print("This is Even number");
        }
        else {
            System.out.print("This is Odd number");
        }
    }
}
