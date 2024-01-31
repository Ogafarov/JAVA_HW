import java.util.Random;
import java.util.Scanner;

public class Lesson3HomeWork {public static void main(String[] args){

    String s =  "Вход запрещен сегодня";
    System.out.println(s.replace("запрещен", "разрешен"));

    System.out.println("Enter your name ");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    System.out.println("Hallo" + name);
    System.out.println("Enter your surname");
    String surname = scanner.nextLine();
    System.out.println("Hallo" + surname);
    System.out.println("Enter your age");
    int age = scanner.nextInt();
    System.out.println("Hallo" + name + "Hallo" + surname + "your age is" + age);


    System.out.println("длинa окружности");
    double l = scanner.nextDouble();
//    System.out.println("длинa" + 2*3,14159* r);


















}
}
