package Projects.hafta0;

import java.util.Scanner;

public class EtkinlikOnerisi {
    public static void main(String[] args) {
        int heat;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen hava sıcaklığını giriniz: ");
        heat= input.nextInt();

        if (heat<5){
            System.out.print("Kayak yapmak bu zamanda harika olurdu!");
        }else if (heat>5 && heat<25){
            if (heat<=15){
                System.out.println("Sinema harika olabilir, Bak bakalım yeni filmler gelmiş mi?");
            }
            if (heat>=15)
                System.out.println("Piknik yapabilirsin.");
        }
        else
            System.out.print("Yüzmek çok serinletici olurdu.");
    }
}
