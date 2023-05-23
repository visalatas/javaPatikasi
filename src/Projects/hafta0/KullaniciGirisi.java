package Projects.hafta0;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String id = "admin", permapass = "admin123", userName, password, password1;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = input.next();
        System.out.print("şifrenizi giriniz: ");
        password = input.next();

        if ((userName.equals(id)) && (password.equals(permapass))) {
            System.out.print("Giriş Başarılı.");
        } else {
            System.out.print("Kullanıcı adı veya şifre yanlış. Şifre değitirmek ister misiniz? evet ya da hayır yazınız.");
            String status;
            status = input.next();
            if (status.equals("hayır")) {
                System.out.print("Tekrar deneyiniz.");
            } else if (status.equals("evet")) {
                System.out.print("lütfen yeni bir şifre oluşturun.");
                password1 = input.next();
                if (password1.equals(permapass)) {
                    System.out.print("Şifre eski şifreniz ile aynı lütfen tekrar deneyin.");
                } else {
                    System.out.println("Şifre değiştirildi");
                    password = password1;
                }
                System.out.println(password);

            } else {
                System.out.print("evet ya da hayır demediniz. Tekrar deneyiniz.");
            }
        }
    }
}
