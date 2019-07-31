package application;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

					SimpleDateFormat sdf1 = new SimpleDateFormat ("dd/MM/yyyy");
					Date x1 = new Date();
					
					System.out.println(sdf1.format(x1));
					
			}

		

	

}
