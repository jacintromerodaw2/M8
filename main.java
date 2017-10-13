import java.util.ArrayList;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		
		Random aleatori = new Random ();
		int numero = 23;
		
		ArrayList<Integer> llista = new ArrayList<Integer>();
		
		for (int i=0; i <500000; i++ ) {
			
			
			
			llista.add(aleatori.nextInt(100000)) ;
			
		//	long inici = System.nanoTime();
		}
		
		System.out.println(llista.contains(numero));
	}

}
