import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("DELTA ");

        System.out.println("Podaj liczbe a: ");
        double liczbaa= myObj.nextDouble();
        while (liczbaa == 0){
            System.out.println("A nie moze byc rowny zero!");
            System.out.println("Podaj liczbe a: ");
            liczbaa= myObj.nextDouble();
        }
        System.out.println("Podaj liczbe b: ");
        double liczbab= myObj.nextDouble();

        System.out.println("Podaj liczbe c: ");
        double liczbac= myObj.nextDouble();

        double wynikdelty = Math.pow(liczbab, 2) - (4*liczbaa*liczbac);
        System.out.println("Wynik delty: " + wynikdelty);

        if (wynikdelty > 0){
            double miejscezer1 = ((-liczbab - Math.sqrt(wynikdelty)) / (2 * liczbaa));
            double miejscezer2 = ((-liczbab + Math.sqrt(wynikdelty)) / (2 * liczbaa));
            System.out.println("Pierwsze miejsce zerowe wynosi: " + miejscezer1);
            System.out.println("Drugie miejsce zerowe wynosi: " + miejscezer2);
        } if (wynikdelty == 0){
            double miejscezer0 = (-liczbab / 2 * liczbaa);
            System.out.println("Miejsce zerowe wynosi: " + miejscezer0);
        } if (wynikdelty < 0){
            System.out.println("Nie ma meijsc zerowych!");
        }
    }
}
