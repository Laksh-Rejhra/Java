import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int totalmarks = 500;
        Scanner sc = new Scanner (System.in);
        // Math
        System.out.println("Enter Math marks ");
        int math = sc.nextInt();
        // English
        System.out.println("Enter English marks ");
        int eng = sc.nextInt();
        // science
        System.out.println("Enter Science marks ");
        int sci = sc.nextInt();
        // history
        System.out.println("Enter History marks ");
        int his = sc.nextInt();
        // java
        System.out.println("Enter Java marks ");
        int java = sc.nextInt();

        int sum = math + eng + sci + his + java;

        System.out.println("Total marks is ");
        System.out.println(sum);

        int per = (sum * 100)/totalmarks;

        System.out.println("percentage is ");
        System.out.println(per);


    }
}
