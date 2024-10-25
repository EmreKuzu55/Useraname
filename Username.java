package notort;

import java.util.Scanner;

public class hacker {

	public static void main(String[] args) {
		

		int reset;
		String newpassString;
		
		String Username2, password2;
		Scanner input = new Scanner(System.in);
		System.out.print("Kullanıcı Adınızı Giriniz :");
		Username2=input.nextLine();		
		System.out.print("Şifrenizi Giriniz :");
        password2= input.nextLine();
        
        
if (Username2.equals("Emre")&& password2.equals("12345")) {
	System.out.println("Giriş Yaptınız !");
}else { 

	System.out.println("Bilgilerin Yanlış\nŞifreni sıfırlamak için 1'e Basınız ");
	reset = input.nextInt();

	System.out.print("Yeni Şifrenizi Giriniz :");
	input.nextLine();
	newpassString=input.nextLine();
	
	
	if (newpassString.equals(Username2)) {
		System.out.println("Şifre Oluşturulamadı lütfen başka şifre Giriniz");
	}else {
		System.out.println("Yeni Şifreniz oluşturuldu : "+ newpassString);
		
		
	}
}		       



		    
	}

}
