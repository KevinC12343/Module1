import java.util.Scanner;

public class main {
public static void main(String[] args) {
    Scanner info = new Scanner(System.in);

    System.out.println("Please Enter your First name: ");
    String first = info.nextLine();


    System.out.println("Please enter your last name: ");
    String last = info.nextLine();


    Scanner age = new Scanner(System.in);
    System.out.println("Please enter your age (as an integer): ");
    int ageinfo = age.nextInt();
    String ageword = "hi";


    if (ageinfo >= 18){
    ageword = "you are an adult, with repsoncibilities";
    }
    else{
    ageword= "you are not an adult, enjoy this time while you can!";
    }
    System.out.println("Hello there " + first + ", " + last + ". You are " + ageinfo + " Years old"+ " and " + ageword);
}
}