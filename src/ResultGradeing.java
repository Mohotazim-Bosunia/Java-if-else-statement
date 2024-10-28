import java.util.Scanner;

public class ResultGradeing {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int mark;

        System.out.print("Enter your mark:");
        mark=input.nextInt();

        if(mark>=80 && mark<=100){
            System.out.print("Your grade=A+");
        }
        else if(mark>=80 && mark<=100){
            System.out.print("Your grade=A+");
        }
        else if(mark>=75 && mark<=79){
            System.out.print("Your grade=A");
        }
        else if(mark>=70 && mark<=74){
            System.out.print("Your grade=A-");
        }
        else if(mark>=65 && mark<=69){
            System.out.print("Your grade=B+");
        }
        else if(mark>=60 && mark<=64){
            System.out.print("Your grade=B");
        }
        else if(mark>=55 && mark<=59){
            System.out.print("Your grade=C+");
        }
        else if(mark>=50 && mark<=54){
            System.out.print("Your grade=C");
        }
        else if(mark>=40 && mark<=44){
            System.out.print("Your grade=D");
        }

        else {
            System.out.print("Your grade=Fail");
        }
    }
}
