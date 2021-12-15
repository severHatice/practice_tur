package days08_varargs;

public class ConcatVarargs {

	public static void main(String[] args) {
	//  verilen Stringleri birlestiren concat isimli bir method olusturunuz
        // input : "m", "e", "r", "v", "e";
        // output : merve
		
		
		// eger miktari belirlenmemisse varargs dusunmeliyiz
		
		
		concat("h","a","c");
		concat("hanim","basarili");
		
		    }

		    public static void concat(String... str) {
		        String yeniStr = "";//stringleri birlestirince yeni bir contaignera atiyoruz
		        for (String w : str) {//hep ayni isleme tutacagim icin for each
		            yeniStr = yeniStr.concat(w);//w deki elemanlari concat yap
		        }                           //w ye gelen h harfi  yeniStr ye yapistirildi

		        System.out.println(yeniStr);
		        System.out.println("yasasin");

		        
		    }}
