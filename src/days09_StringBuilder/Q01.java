package days09_StringBuilder;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		
//bir cumleyi parametre olarak alip stringbuilder ile ters cevir ve palindrom olup olmadigini kontro et
	
		
		Scanner scan = new Scanner(System.in);//scan objesi
        System.out.println("bir metin giriniz");
        //String metin = scan.nextLine();
        //StringBuilder sB = new StringBuilder(metin);
        StringBuilder  sB=new StringBuilder(scan.nextLine());//StringBuilder sb objesi
        //sB.append(metin);
        
        StringBuilder  reverse=new StringBuilder(sB.reverse().toString());

       // //String tersMetin = sB.reverse().toString();//sb objesini aldim rverse methodunu kullanip stringe ceviridm

        if (reverse.equals(sB)) {
            System.out.println("girilen metin polindrome ifadedir : " + reverse);
        } else System.out.println("girilen metin polindrome ifade degildir : " + reverse);

	}

}
