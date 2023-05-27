package Projects.hafta0;

import java.util.Scanner;

public class BurcHesabi {
    public static void main(String[] args) {
        int month , day;
        String burc= "";
        Boolean isError=false;
        Scanner input=new Scanner(System.in);

        System.out.print("Kaçıncı ayda doğdunuz: ");
        month= input.nextInt();

        System.out.print(month+". Ayının kaçıncı gününde doğdunuz: ");
        day= input.nextInt();

        if (month>=1 && month<=12){
            if(month==1){
                if(day>=1 && day<=31){
                    if(day>=1 && day<=21){
                        burc= "Oğlak";

                    }
                    else
                        burc="kova";
                }
                else isError= true;

            }
            if(month==2){
                if(day>=1 && day<=30){
                    if(day>=1 && day<=19){
                        burc= "kova";
                    }
                    else
                        burc="balık";
                }
                else isError= true;

            }
            if(month==3){
                if(day>=1 && day<=31){
                    if(day>=1 && day<=20){
                        burc="Balık";
                    }
                    else
                        burc="Koç";

                }
                else isError= true;

            }
            if(month==4){
                if(day>=1 && day<=30){
                    if(day>=1 && day<=20){
                        burc="Koç";
                    }
                    else
                        burc="Boğa";

                }
                else isError= true;

            }
            if(month==5){
                if(day>=1 && day<=31){
                    if(day>=1 && day<=21){
                       burc="Boğa";
                    }
                    else
                        burc="ikzler";

                }
                else isError= true;

            }
            if(month==6){
                if(day>=1 && day<=30){
                    if(day>=1 && day<=22){
                        burc="ikizler";
                    }
                    else
                        burc="yengeç";

                }
                else isError= true;

            }
            if(month==7){
                if(day>=1 && day<=31){
                    if(day>=1 && day<=22){
                        burc="Yengeç";
                    }
                    else
                        burc="Aslan";

                }
                else isError= true;

            }
            if(month==8){
                if(day>=1 && day<=31){
                    if(day>=1 && day<=22){
                        burc="Aslan";
                    }
                    else
                        burc="Başak";

                }
                else isError= true;

            }
            if(month==9){
                if(day>=1 && day<=30){
                    if(day>=1 && day<=22){
                        burc="Başak";
                    }
                    else
                        burc="terazi";

                }
                else isError= true;

            }
            if(month==10){
                if(day>=1 && day<=31){
                    if(day>=1 && day<=21){
                        burc="Terazi";
                    }
                    else
                        burc="Akrep";

                }
                else isError= true;

            }
            if(month==11){
                if(day>=1 && day<=30){
                    if(day>=1 && day<=21){
                        burc="Akrep";
                    }
                    else
                        burc="Yay";

                }
                else isError= true;

            }
            if(month==12){
                if(day>=1 && day<=31){
                    if(day>=1 && day<=21){
                        burc="Yay";
                    }
                    else
                        burc="Oğlak";

                }
                else isError= true;

            }

        }
        else
            isError= true;

    if (isError)
        System.out.print("Hatalı Giriş Yaptınız.");
    else
        System.out.print("Burcunuz: "+ burc);
    }

}
