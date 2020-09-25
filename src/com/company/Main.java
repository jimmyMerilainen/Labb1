package com.company;
import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        char choice;

        do {
            System.out.println("Vad vill du göra?");
            System.out.println("1: Addera två tal");
            System.out.println("2: Räkna bokstäver i en sträng");
            System.out.println("3: Spegelvänd en sträng");
            System.out.println("4: Summera alla tal i en sträng");
            System.out.println("e: Avsluta");
            choice = s.next().charAt(0);

            if (choice == '1') {

                int sum = add();
                System.out.println("Summan är: " +sum);
                System.out.println("");

            }
            else if (choice == '2') {

                count();

            }
            else if (choice == '3') {

                mirror();
            }
            else if (choice == '4') {

                int result = 0;
                boolean bool = true;
                s.nextLine();

                do {
                    System.out.println("Skriv in alla tal i en och samma sträng");
                    String tal = s.nextLine();

                    for(int i=0; i<tal.length();i++) {
                        if (isDigit(tal.charAt(i))) {
                            char c = tal.charAt(i);
                            result += Integer.parseInt(String.valueOf(c));
                            bool = false;
                        }
                        else if (!isDigit(tal.charAt(i))) {
                            System.out.println("Du får bara använda siffror");
                            bool = true;
                            result = 0;
                            break;
                        }
                    }

                }while (bool);
                System.out.println("Summan är: " + result);
                System.out.println("");

            }

        }while (choice != 'e');
        System.out.println("Hej då");

    }
    static int add() {

        System.out.print("Skriv in det första talet:");
        int num1 = s.nextInt();
        System.out.print("Skriv in det andra talet:");
        int num2 = s.nextInt();
        int sum = num1 + num2;
        return sum;

    }
    static void count() {

        int count = 0;

        System.out.print("Ange ordet du vill leta i: ");
        s.nextLine();
        String word = s.nextLine();
        System.out.print("Ange bokstaven du vill leta efter: ");
        char c = s.nextLine().charAt(0);
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                count++;
            }
        }
        System.out.println("Det finns "+ count +" "+ c + " i ordet " + word);
        System.out.println("");

    }
    static void mirror() {

        System.out.print("Ge mig ett ord: ");
        s.nextLine();
        String word = s.nextLine();
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        System.out.println("Det spegelvända ordet: "+reverse);
        System.out.println("");
    }
    public static boolean isDigit(char c) {
        return Character.isDigit(c);

    }

}
