package oop.exercises;
import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name?");
        String nameInput = input.nextLine();

        System.out.println("Hello, " + nameInput + ", nice to meet you! ");
    }
}