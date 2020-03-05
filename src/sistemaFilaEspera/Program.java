package sistemaFilaEspera;

import java.util.Scanner;

public class Program {
public static int idade;
public static String prioritaria;
public static String comum;
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Por favor digite sua idade");
idade = sc.nextInt();
if(idade>60 && idade<120) {
	System.out.println("Fila prioritaria");
} else {
	System.out.println("Fila comum");
}
sc.close();
	}

}
