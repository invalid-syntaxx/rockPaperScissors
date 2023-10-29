package com.Day10;
import java.util.Scanner;
import java.util.Random;

public class rockPaperScissors {
    public static void main(String[] args) {

        int rock = 1;
        int paper = 2;
        int scissors = 3;

        Scanner sc = new Scanner(System.in);
        Random ra = new Random();

        System.out.println("1 = rock; 2 = paper; 3= scissors; ");

        System.out.println("Start!!" );

        int user = sc.nextInt();
        System.out.println("user: " + user);

        int comp = ra.nextInt(3) + 1 ;
        System.out.println("comp: " + comp);

        if (user == comp ) {
            System.out.println("Tie!!");
        }

          else if ((user == rock && comp == paper) ||
                (user == paper && comp == rock) ||
                        (user == scissors && comp == paper)) {
            System.out.println("You Win!!");
            }

          else{
            System.out.println("You Lose");
        }

    }
}