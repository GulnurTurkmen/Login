package KullanıcıGirisi;
import java.util.Scanner;
public class KullanıcıGirisi {
public static void main(String[]args) {
	String userName,sifre,select;
	Scanner inp = new Scanner(System.in);
	System.out.print("kullanıcı adınız:");
	userName = inp.nextLine();
	System.out.print("şifreniz:");
	sifre = inp.nextLine();
	if(userName.equals("patika")&& sifre.equals("java123")){
		System.out.println("giriş yapın:");
	}
	else {
		System.out.println("Şifre yanlış, sıfırlamak istiyor musunuz? (Evet/Hayır)");
		select = inp.nextLine();
		if(select.equals("evet")) {
			String yeniSifre,eskiSifre;
		do {
			System.out.print("yeni şifrenizi girin:");
			yeniSifre = inp.nextLine();
			System.out.print("eski şifrenizi girin:");
			eskiSifre = inp.nextLine();
			if(yeniSifre.equals(eskiSifre)) {
				System.out.println("yeni şifre eski şifreyle aynı olamaz");
				
			}}
		while(yeniSifre.equals(eskiSifre));
		
		System.out.print("şifre oluşturuldu");
		
		}else{ 
			{System.out.print("giriş yapılamadı. tekrar deneyin.");
		}
		}
	}
}
}