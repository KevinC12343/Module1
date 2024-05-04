import java.util.Scanner;

public class main {
public static void main(String[] args) {
    //Scanner for the first and last name
    Scanner info = new Scanner(System.in);
//prompts user for first name
    System.out.println("Please Enter your First name: ");
    String first = info.nextLine();
//prompts user for last name
    System.out.println("Please enter your last name: ");
    String last = info.nextLine();

// Scanner for the age
    Scanner age = new Scanner(System.in);
    System.out.println("Please enter your age (as an integer): ");
    int ageinfo = age.nextInt();
    String ageword = "hi";

//if-else loop for determining if there over the age of 18 or not
    if (ageinfo >= 18){
    ageword = "you are an adult, with repsoncibilities";
    }
    else{
    ageword= "you are not an adult, enjoy this time while you can!";
    }
    //terminal output adding spaces, commas, periods, and variables and strings to output the final message
    System.out.println("Hello there " + first + ", " + last + ". You are " + ageinfo + " Years old"+ " and " + ageword);
}
}