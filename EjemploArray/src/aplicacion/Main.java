package aplicacion;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		int []array= {1,1,2,4,1,5,2,5,6,4};
		int mayor=array[0];
		for (int i = 1; i < array.length; i++) {
			if (mayor<array[i]) {
				mayor=array[i];
			} else {
				
			}
		}
		System.out.println(mayor);
	}
}
