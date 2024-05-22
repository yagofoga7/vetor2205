package projVetor;

import java.util.Scanner;

public class Vet{

	public static void main(String[] args) {
	   
		int a[]= new int[5];
		
		Scanner ler = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.println("Digite um valor:");
			a[i]= ler.nextInt();
		}
		
        for(int j=0; j<5; j++) {
        	System.out.println(a[j]);
        }
        
        ler.close();
	}
	

}
