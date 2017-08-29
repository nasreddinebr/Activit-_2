package projet1;

import java.util.Scanner;

public class project1 {

	public static void main(String[] args) {
		char reponse = ' ';
		double result, temperatur;
		String x1, x2;
		
		Scanner sc = new Scanner(System.in);
		
		// On affiche le titre de l'aplication
		System.out.println("CONVERTISSEUR DEGRES CELSUIS ET DEGRES FAHRENHEIT");
		System.out.println("-------------------------------------------------");
		
		do{
			do{
				// On demande a l'utilisateur de choisire une conversion
				System.out.println("Choisissez le mode de conversion : \n1- Convertisseur Celsuis => Fahrenheit \n2- Convertisseur Fahrenheit => Celsuis");
				reponse = sc.nextLine().charAt(0);
				
				if(reponse != '1' && reponse != '2')
					System.out.println("Mode inconnu, veuillez réitérer votre choix.");
				
			}while(reponse != '1' && reponse != '2');
			
			// On demande a l'utilisateur d'entrer la temperature a convertir est on calcule le resultat
			System.out.println("Entrer la température à convertir :");
			temperatur = sc.nextFloat();
				
			if(reponse == '1'){
				result = ((9.0/5.0) * temperatur) + 32.0;
				x1 = " °C";
				x2 = " °F";
			}else {
				result = ((temperatur - 32) * 5) / 9;
				x1 = " °F";
				x2 = " °C";
			}
				
			// On affiche le resultat
			System.out.println(temperatur + x1 + " correspond à : " + arrondi(result, 2) + x2);
			
			sc.nextLine();
			
			// On demande à l'utilisteur si il veut refaire une autre conversion
			do{
				System.out.println("Souhaitez-vous convertir une autre température ? (O/N)");
				reponse = sc.nextLine().charAt(0);
			}while(reponse != 'O' && reponse != 'N');
			
		}while(reponse == 'O');
		
		// Fin du programme
		System.out.println("Au revoir !");	
	}
	
	public static double arrondi(double A, int B) {
		  return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	}
}