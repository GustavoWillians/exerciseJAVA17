package application;

import java.util.Locale;
import java.util.Scanner;

import entities.student;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		student student = new student();
		
		System.out.println("Qual o seu nome?:");
		String name = sc.nextLine();
		
		System.out.println("Insira suas tres notas abaixo: ");
		
		student.notaum = sc.nextDouble();
		student.notadois = sc.nextDouble();
		student.notatres = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.notafinal());
		
		if (student.notafinal() < 60.00) {
			System.out.println("REPROVADO");
			System.out.printf("Você precisa de %.2f pontos", student.pass());
		}
		else {
			System.out.printf("Você passou com %.2f pontos, parabens!", student.notafinal());
		}
		
		
	}

}
