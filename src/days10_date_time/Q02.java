package days10_date_time;

import java.time.LocalDate;
import java.time.Month;

public class Q02 {

	public static void main(String[] args) {
		//to create a date of June 21, 2014?
		 /*
        A. new LocalDate(2014, 5, 21);//NEW anahtari kullanmaz
        B. new LocalDate(2014, 6, 21);
        C. LocalDate.of(2014, 5, 21);##
        D. LocalDate.of(2014, 6, 21);##
        F. LocalDate.of(2014, Month.JUNE, 21);####
      */
		LocalDate.of(2014, 6, 21);
		LocalDate date = LocalDate.of(2014, Month.JUNE, 21);//oc sorusu
		System.out.println(date );
	}

}
