package Projects.hafta0;

import java.util.Scanner;

public class SiralamaAlgoritmasi {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen sıralamak istediğiniz ilk sayıyı giriniz: ");
        a=input.nextInt();
        System.out.print("Lütfen sıralamak istediğiniz ilk sayıyı giriniz: ");
        b= input.nextInt();
        System.out.print("Lütfen sıralamak istediğiniz ilk sayıyı giriniz: ");
        c= input.nextInt();

        if(a<b && a<c){
            System.out.println(a);
            if(b<c){
                System.out.println(b);
                System.out.println(c);
            }
            else{
                System.out.println(c);
                System.out.println(b);

            }
        }
        else if(b<a && b<c) {
            System.out.println(b);
            if (a<c){
                System.out.println(a);
                System.out.println(c);
            }
            else{
                System.out.println(c);
                System.out.println(a);

            }
        }
        else if(c<a && c<b) {
            System.out.println(c);
            if (a<b){
                System.out.println(a);
                System.out.println(b);
            }
            else{
                System.out.println(b);
                System.out.println(a);

            }
        }
    }
}
