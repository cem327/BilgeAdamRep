import java.util.Scanner;

public class Odev3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hangi ayda doğduğunuzu giriniz : ");
        int ay = sc.nextInt();

        System.out.println("Hangi gün doğdunğunuzu giriniz : ");
        int gun = sc.nextInt();

        switch(ay) {

            case 1:
                if (gun >= 22 && gun <= 31) System.out.println("Kova burcusunuz.");

                else if (gun < 22 && gun > 0) System.out.println("Oğlak burcusunuz");

                else System.out.println("Gecerli bir gun girmediniz.");

                break;

            case 2:
                if (gun >= 20 && gun <= 31) System.out.println("Balık burcusunuz.");

                else if (gun < 20 && gun > 0) System.out.println("Kova burcusunuz");

                else System.out.println("Gecerli bir gun girmediniz.");

                break;

            case 3:
                if (gun >= 21 && gun <= 31) System.out.println("Koç burcusunuz.");

                else if (gun < 22 && gun > 0) System.out.println("Balık burcusunuz");

                else System.out.println("Gecerli bir gun girmediniz.");

                break;

            case 4:
                if (gun >= 21 && gun <= 31) System.out.println("Boğa burcusunuz.");

                else if (gun < 21 && gun > 0) System.out.println("Koç burcusunuz");

                else System.out.println("Gecerli bir gun girmediniz.");

                break;

            case 5:
                if (gun >= 21 && gun <= 31) System.out.println("İkizler burcusunuz.");

                else if (gun < 21 && gun > 0) System.out.println("Boğa burcusunuz");

                else System.out.println("Gecerli bir gun girmediniz.");

                break;

            case 6:
                if (gun >= 22 && gun <= 31) System.out.println("Yengeç burcusunuz.");

                else if (gun < 22 && gun > 0) System.out.println("İkizler burcusunuz.");

                else System.out.println("Gecerli bir gun girmediniz.");

                break;

            case 7:
                if (gun >= 23 && gun <= 31) System.out.println("Aslan burcusunuz.");

                else if (gun < 23 && gun > 0) System.out.println("Yengeç burcusunuz.");

                else System.out.println("Gecerli bir gun girmediniz.");

                break;

            case 8:
                if (gun >= 23 && gun <= 31) System.out.println("Başak burcusunuz.");

                else if (gun < 23 && gun > 0) System.out.println("Aslan burcusunuz.");

                else System.out.println("Gecerli bir gun girmediniz.");

                break;

            case 9:
                if (gun >= 23 && gun <= 31) System.out.println("Terazi burcusunuz.");

                else if (gun < 23 && gun > 0) System.out.println("Başak burcusunuz.");

                else System.out.println("Gecerli bir gun girmediniz.");

                break;

            case 10:
                if (gun >= 23 && gun <= 31) System.out.println("Akrep burcusunuz.");

                else if (gun < 23 && gun > 0) System.out.println("Terazi burcusunuz.");

                else System.out.println("Gecerli bir gun girmediniz.");

                break;

            case 11:
                if (gun >= 22 && gun <= 31) System.out.println("Yay burcusunuz.");

                else if (gun < 22 && gun > 0) System.out.println("Akrep burcusunuz.");

                else System.out.println("Gecerli bir gun girmediniz.");

                break;

            case 12:
                if (gun >= 22 && gun <= 31) System.out.println("Oğlak burcusunuz.");

                else if (gun < 22 && gun > 0) System.out.println("Yay burcusunuz.");

                else System.out.println("Gecerli bir gun girmediniz.");

                break;

            default:

                System.out.println("Geçerli bir ay girmediniz.");

                break;


        }



    }
}
