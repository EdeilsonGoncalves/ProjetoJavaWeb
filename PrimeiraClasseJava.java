package JavaWeb;

import java.util.Locale;

public class PrimeiraClasseJava {

	/*Main é um método auto executável em Java*/
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);	
		
		/*Escreve texto no console com*/
		System.out.println("Meu primeiro programa em Java - do Curso Formação Java Web");
		
		System.out.println(""); 
		
		int idade;
		double salario, altura;
		char genero;
		String nome;
		
		idade = 30;
		salario = 5800.5;
		altura = 1.72;
		genero = 'F';
		nome = "Maria Silva";
				
		System.out.println("IDADE = " + idade);
		System.out.println("SALARIO = " + String.format("%.2f", salario));
		System.out.println("ALTURA = " + String.format("%.2f", altura));
		System.out.println("GENERO = " + genero);
		System.out.println("NOME = " + nome);
		System.out.println("");
		
		System.out.println("O candidato(a) tem o nome de "+ nome + ", sexo " + genero + ", ganha R$ " 
		+ String.format("%.2f", salario) + " e tem " + idade + " anos.");
		
		
		
		
	}
}
