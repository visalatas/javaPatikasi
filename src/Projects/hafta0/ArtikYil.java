package Projects.hafta0;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        boolean isArtikYil = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Hesaplamak istediğiniz yılı giriniz: ");
        yil = input.nextInt();
        if ( yil % 100 == 0 && yil % 400 == 0) {
            isArtikYil = true;
        } else if(yil%4==0 && yil%100!=0)
            isArtikYil=true;
        else isArtikYil=false;



        if (isArtikYil == true) System.out.print(yil + ": Artık yıldır");
        else System.out.print(yil + ": Artık yıl değildir");

    }
}

