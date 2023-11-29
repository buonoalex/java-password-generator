package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        //Open the Scanner
        Scanner myScanBro = new Scanner(System.in);

        //Add variable
        String nameUser;
        String surnameUser;
        int yearsUser;
        int dayUser;
        int monthUser;

        //Input user year
        System.out.print("Inserisci l'anno in cui sei nato : ");
        yearsUser = myScanBro.nextInt();

        //Input user day
        System.out.print("Inserisci il giorno in cui sei nato : ");
        dayUser = myScanBro.nextInt();

        //Input user month
        System.out.print("Inserisci il mese in cui sei nato : ");
        monthUser = myScanBro.nextInt();

        //Input user month
        System.out.print("Inserisci il tuo nome : ");
        nameUser = myScanBro.nextLine();

        //Input user month
        System.out.print("Inserisci il tuo cognome : ");
        surnameUser = myScanBro.nextLine();

        //Generate the secure password






        //Close the Scanner
        myScanBro.close();

    }
}
