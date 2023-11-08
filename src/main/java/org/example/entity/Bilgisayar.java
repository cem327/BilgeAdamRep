package org.example.entity;

public class Bilgisayar {

    public String klavye;

    public String mouse;

    public String kulaklik;

    public String hoparlor;

    public Bilgisayar(String klavye, String mouse, String kulaklik, String haporlor){

        this.klavye = klavye;
        this.mouse = mouse;
        this.kulaklik= kulaklik;
        this.hoparlor= haporlor;
    }

    public Bilgisayar(){
        this.klavye = "Logitech G30";
        this.mouse = "Microsoft soft white";
        this.kulaklik = "Logitech g430";
        this.hoparlor = "Corsair 5.1";

    }

}
