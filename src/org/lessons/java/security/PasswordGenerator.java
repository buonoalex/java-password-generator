package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        //Open the Scanner
        Scanner myScanBro = new Scanner(System.in);

        //Add variable
        String nameUser;
        String surnameUser;
        String favouriteColorUser;
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

        //Input user name
        System.out.print("Inserisci il tuo nome : ");
        nameUser = myScanBro.next();

        //Input user surname
        System.out.print("Inserisci il tuo cognome : ");
        surnameUser = myScanBro.next();

        //Input user color
        System.out.print("Inserisci il tuo colore preferito : ");
        favouriteColorUser = myScanBro.next();

        //Sum year/month/day
        int sumOfDate = monthUser+dayUser+yearsUser;

        //Generate the secure password
        System.out.println("La tua super password è : "+nameUser+"-"+surnameUser+"-"+favouriteColorUser+"-"+sumOfDate);

        //Close the Scanner
        myScanBro.close();

    }
}
