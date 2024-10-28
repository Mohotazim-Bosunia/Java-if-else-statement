import java.util.Scanner;

public class PossetiveNegetive {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int num;

        System.out.print("Enter your number=");
        num=input.nextInt();


        if(num>0){
            System.out.print("Number is Posetive");
        }
        else if (num<0) {
            System.out.print("Number is Negative");
        }
        else
        {
            System.out.print("Number is 0");
        }
    }
}
