package Act3GIT_EliasWassit;
import java.util.*;
public class principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        // Generar y mostrar 30 números aleatorios
        System.out.println("Generando 30 números aleatorios entre 0 y 9:");
        for (int i = 0; i < 30; i++) {
            System.out.println((i + 1) + ": " + rand.nextInt(10));
        }

        // Solicitar datos del usuario
        System.out.println("\nDame dos números (el primero menor que el segundo):");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();

        System.out.println("Dame un tercer número:");
        int numero3 = scan.nextInt();

        System.out.println("Indica el incremento:");
        int incremento = scan.nextInt();

        // Mostrar los números en el rango con incremento
        for (int i = numero1; i <= numero2; i += incremento) {
            System.out.println("Número: " + i);
            if (i == numero3) System.out.println("¡Número especial: " + numero3 + "!");
        }
        
        scan.close();
        
	}
}
