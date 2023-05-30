package Projects.hafta0;

import java.util.Scanner;

public class UcVeDordeBolunenSayiOrt {
    public static void main(String[] args) {
        int x , sum=0,count=0;
        Scanner inp=new Scanner(System.in);

        System.out.print("Lütfen sayi giriniz: ");
        x= inp.nextInt();

        for(int i=0; i<x; i++){
            if(i%3==0 && i%4==0){
                sum +=i;
                count++;
                System.out.println(i+",");
            }
        }
        System.out.println(sum/count);
        

    }
}
