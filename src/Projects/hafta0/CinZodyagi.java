package Projects.hafta0;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int dogumYili, artik;
        String hayvan="";

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen doğum yılınızı giriniz: ");
        dogumYili= input.nextInt();

        artik= dogumYili % 12;

        switch (artik){
            case 0:
                hayvan= "Maymun";
                break;
            case 1:
                hayvan="Horoz";
                break;
            case 2:
                hayvan= "Köpek";
                break;
            case 3:
                hayvan="Domuz";
                break;
            case 4:
                hayvan= "Fare";
                break;
            case 5:
                hayvan="Öküz";
                break;
            case 6:
                hayvan= "Kaplan";
                break;
            case 7:
                hayvan="Tavşan";
                break;
            case 8:
                hayvan= "Ejderha";
                break;
            case 9:
                hayvan="Yılan";
                break;
            case 10:
                hayvan="At";
                break;
            case 11:
                hayvan= "Koyun";
                break;
        }
        System.out.print("Çin Zodayağı hesabına göre hayvan burcunuz : "+hayvan);
    }
}
