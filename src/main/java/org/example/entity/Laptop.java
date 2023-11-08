package org.example.entity;

public class Laptop extends Bilgisayar{
    public Laptop(String klavye, String mouse, String kulaklik, String haporlor) {
        super(klavye, mouse, kulaklik, haporlor);
    }

    public String ram;

    public String anakart;

    public String islemci;

    public String ekranKarti;

    public Laptop(){

        this.ram = "4 GB ";
        this.anakart = "msi a-520m pro";
        this.islemci = "intel i7-10700";
        this.ekranKarti = "Geforce GTX-3050";

    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram='" + ram + '\'' +
                ", anakart='" + anakart + '\'' +
                ", islemci='" + islemci + '\'' +
                ", ekranKarti='" + ekranKarti + '\'' +
                ", klavye='" + klavye + '\'' +
                ", mouse='" + mouse + '\'' +
                ", kulaklik='" + kulaklik + '\'' +
                ", hoparlor='" + hoparlor + '\'' +
                '}';
    }
}
