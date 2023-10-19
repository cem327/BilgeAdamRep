import java.util.Scanner;
import java.util.Scanner;

public class Donguler_Odev {



        public static void main(String[] args) {

            System.out.print("Bir sayı giriniz : ");

            Scanner scn = new Scanner(System.in);

            int sayi = scn.nextInt();
            int sayac = 0;

            do{
                System.out.println(sayi % 10);


                sayi = sayi / 10;
                sayac++;
            }

            while (sayi > 0);

            System.out.println("Sayınız "+ sayac + " basamaklıdır.");

        }
    }




