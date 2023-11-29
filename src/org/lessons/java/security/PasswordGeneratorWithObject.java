package org.lessons.java.security;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Scanner;

public class PasswordGeneratorWithObject {
        public static void main(String[] args) throws ParseException {
            //Open the Scanner
            Scanner myScanBro = new Scanner(System.in);

            //Con il Costruttore : (funziona)
            /*
            User user1 = new User("Alessandro", "Buono","Giallo","2000-11-10");
            user1.StampaUser();
            */


            //Con Input : (funziona)

            User user1 = new User();
            //Input user name
            System.out.print("Inserisci il tuo nome : ");
            user1.setName(myScanBro.next());

            //Input user surname
            System.out.print("Inserisci il tuo cognome : ");
            user1.setSurname(myScanBro.next());

            //Input user color
            System.out.print("Inserisci il tuo colore preferito : ");
            user1.setSurname(myScanBro.next());

            //Input user date
            System.out.print("Inserisci quando sei nato(yyyy-MM-dd) : ");
            String dataInputUser = myScanBro.next();
            SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
            Date passaggioDate = formatDate.parse(dataInputUser);
            user1.setBornDate(passaggioDate);

            user1.StampaUser();



            //Close the Scanner
            myScanBro.close();
        }
}
