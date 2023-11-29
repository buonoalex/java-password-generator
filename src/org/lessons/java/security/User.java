package org.lessons.java.security;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {

    private String name;
    private String surname;
    private String favouriteColor;
    private Date bornDate;

    //Costruttore di Default
    public User(){

    }

    //Costruttore non default
    public User(String name,String surname,String favouriteColor, String bornDate)throws ParseException {
        this.name = name;
        this.surname = surname;
        this.favouriteColor = favouriteColor;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        this.bornDate = sdf.parse(bornDate);
    }

    //Metodo Stringa in somma valori date
    public int SumDate(Date dataNascita){

        SimpleDateFormat formatData = new SimpleDateFormat("yyyy-MM-dd");
        String dataTrasformata = formatData.format(dataNascita);

        String yearString = dataTrasformata.substring(0,4);
        String monthString = dataTrasformata.substring(5,7);
        String dayString = dataTrasformata.substring(8,10);

        int yearInt = Integer.parseInt(yearString);
        int monthInt = Integer.parseInt(monthString);
        int dayInt = Integer.parseInt(dayString);

        return yearInt+monthInt+dayInt;

    }
    //Metodo stampa Oggetto Password
    public void StampaUser(){
        System.out.println(this.name+"-"+this.surname+"-"+this.favouriteColor+"-"+SumDate(this.bornDate));
    }

    //Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFavouriteColor() {
        return favouriteColor;
    }

    public void setFavouriteColor(String favouriteColor) {
        this.favouriteColor = favouriteColor;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }
}
