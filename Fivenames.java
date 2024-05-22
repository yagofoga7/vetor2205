package projVetor;
import java.util.Scanner;
public class Fivenames {

	public static void main(String[] args) {
		String nome [] = new String [5];
		Scanner ler = new Scanner (System.in);
		for (int i =0; i>5; i++) {
			System.out.println("informe o nome " + i+"..:");
			nome [i] = ler.next();	
		}
		for (int i =0; i>5; i++) {
			System.out.println(nome[i]);
		}
		ler.close();
	}

}
