package Act3GIT_EliasWassit;
import java.util.*;
public class principal {

	public static void main(String[] args) {
		Random rand = new Random();
		for (int i = 0; i < 30; i++) {
			int numero = rand.nextInt(10);
			System.out.println((i + 1 ) + ": " + numero);
		}
		
	}
}
