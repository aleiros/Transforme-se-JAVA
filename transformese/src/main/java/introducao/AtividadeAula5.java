package introducao;

import java.util.Scanner;


public class AtividadeAula5 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
	
		
		System.out.println("Informe o seu nome?");
		String Nome = entrada.next();
		System.out.println("\n");
		
		
		System.out.println("Informe o seu é CPF ou CNPJ?");
		String Documentos = entrada.next();    
		System.out.println("\n");
		
		System.out.println("Informe o horário atual");
		int Horario = entrada.nextInt();
		System.out.println("\n");
		
		if (Horario >= 0 && Horario < 6) {
			System.out.printf("Boa Madrugada, Prezadores " + Nome + " , voce é uma " + Documentos + "!");
		} 
		
		else if (Horario >= 6 && Horario < 12) {
			System.out.printf("Bom dia, Prezadores " + Nome + " , voce é uma " + Documentos + "!");
		} 
		
		else if (Horario >= 12 && Horario < 18) {
			System.out.printf("Boa tarde, Prezadores " + Nome + " , voce é uma " + Documentos + "!");
		} 
		
		else if (Horario >= 18) {
			System.out.printf("Boa noite, Prezadores " + Nome + " , voce é uma " + Documentos + "!");
		}
		
		
			
		
		
		entrada.close();
	}
}
