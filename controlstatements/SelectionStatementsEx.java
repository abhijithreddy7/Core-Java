package controlstatements;
import java.util.Scanner;
public class SelectionStatementsEx {
	    public static void main(String[] args) {
	        Scanner keyboard = new Scanner(System.in);
	        int age;

	        System.out.println("Welcome to the Pub and Grille.");

	        System.out.println("Please enter your age");
	        age = keyboard.nextInt();

	        if(age>=21){
	            System.out.println("Here, have a beer!");
	        }
	        else if(age >= 16){
	            System.out.println("Here, have a coke!");
	            System.out.println("At least you can drive!");
	        }
	        else{
	            System.out.println("Here, have a coke!");
	        }
	        System.out.println( "Thanks for coming to the Pub and Grille.");

	    }
	}