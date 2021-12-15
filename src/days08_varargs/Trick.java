package days08_varargs;

public class Trick {
	
	public static void main(String[] args) {

		
		
        int[]arr= {17,23,6,34};
        System.out.println("array toplami: "+ arrTopla(arr));
        System.out.println("varargs toplami: "+varargsTopla(23,6,54,56,77,3));
        System.out.println(varargsTopla(arr));
		
		//varargs arrays gibi davrandigi icin herhangi bir array parametre olarak alabilir
	}

	//array elemanlari toplayan metod
	private static int arrTopla(int[] arr) {
		int topla = 0;
		for (int a : arr) {

			topla += a;
		}
		return topla;
	}
	//varargs elemanlari toplayan metod
	private static int varargsTopla(int... i) {
		int toplam = 0;
		for (int a : i) {
			toplam += a;

		}
		return toplam;
	}

}
