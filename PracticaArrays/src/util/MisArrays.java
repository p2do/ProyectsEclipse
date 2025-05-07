package util;

public abstract class MisArrays {

	
	public float mediaNotas(float[] array) {
		float contador=0;
		for (int i = 1; i < array.length; i++) {
			contador+=array[i];
		}
		return (contador/array.length);
	}
	
	public float medianaNotas(float[] array) {
		
		for (int i = 0; i < array.length-1; i++) {
			
			for (int j = 0; j < array.length-1; j++) {
				if (array[i]>array[j+1]) {
					
					float temporal=array[i];
					array[i]=array[i+1];
					array[i+1]=temporal;
					
				}
			}
		}
		
		for
		return ()
	}
}
