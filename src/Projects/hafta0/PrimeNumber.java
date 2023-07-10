package Projects.hafta0;

public class PrimeNumber {
    public static void main(String[] args) {
        //1 den 100 e kadar  olan asal sayıları ekrana yazdırır
        boolean prime=true;


        for (int i=2;i<=100;i++){
            prime=true;
            for(int k=2;k<i;k++){
                if(i%k==0){
                    prime=false;
                    break;
                }
            }
            if (prime==true){
                System.out.print(i+" ");
            }
        }
    }
}
