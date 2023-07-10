package Projects.hafta0;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int larger, smaller;
        int ebob=1, ekok=1;
        System.out.print("ilk sayıyı girin: ");
        int n1= scan.nextInt();
        System.out.print("ikinci sayıyı girin: ");
        int n2= scan.nextInt();

        //büyük sayı ve küçük sayıyı ayırt etmek için
        if(n1>n2){
            larger=n1;
            smaller=n2;
        }
        else {
            larger = n2;
            smaller=n1;
        }

        //Ebob bulan kod
        int i=1;
        while (i<=smaller){
            if(smaller%i==0 && larger%i==0)
                ebob=i;
            i++;

        }
        System.out.println("ebob: "+ebob);

        //ekok bulan kod
        int k=smaller;
        while (k<=(smaller*larger)){
            if(k%smaller==0&& k% larger==0) {
                ekok = k;
                break;
            }
            k++;

        }

        System.out.println("ekok: "+ekok);






    }
}
