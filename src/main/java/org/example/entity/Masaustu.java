package org.example.entity;

public class Masaustu extends Bilgisayar {



    public String ram;

    public String anakart;

    public String islemci;

    public String ekranKarti;



    public Masaustu(){

            this.ram = "8 GB ";
            this.anakart = "msi pro 610hm";
            this.islemci = "intel i5-10950";
            this.ekranKarti = "Geforce GTX-3060";


    }

    @Override
    public String toString() {
        return "Masaustu{" +
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
