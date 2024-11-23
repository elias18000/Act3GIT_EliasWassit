package Act3GIT_EliasWassit;
import java.util.*;
public class principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		for (int i = 0; i < 20; i++) {
			int numero = rand.nextInt(10);
			System.out.println((i + 1 ) + ": " + numero);
		}
		System.out.println("Dame dos numeros y te dre los numeros que hay en medio contando de 7 en 7: ");
		int numero1 = Integer.parseInt(scan.next());
		int numero2 = Integer.parseInt(scan.next());
		System.out.println("dame un tercer numero");
		int numero3 = Integer.parseInt(scan.next());
	
		for (int i = numero1; i <= numero2; i += 7) {
			System.out.println("numero: " + i);
		}
		if(numero3 >= numero1 && numero3 <= numero2 ) {
		System.out.println("numero3: " + numero3 );
		}
	}
}
