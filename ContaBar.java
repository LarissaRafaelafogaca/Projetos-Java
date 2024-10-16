package projeto02;

import java.util.Scanner;

public class ContaBar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Sexo (M/F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Quantidade de cervejas: ");
        int cervejas = scanner.nextInt();

        System.out.print("Quantidade de refrigerantes: ");
        int refrigerantes = scanner.nextInt();

        System.out.print("Quantidade de espetinhos: ");
        int espetinhos = scanner.nextInt();

       
        double consumo = calcularConsumo(cervejas, refrigerantes, espetinhos);
        double ingresso = (sexo == 'F') ? 8.0 : 10.0;
        double couvert = (consumo > 30) ? 0 : 4;

       
        double valorTotal = consumo + ingresso + couvert;

        
        System.out.println("\nRELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f\n", consumo);
        System.out.printf("Couvert = R$ %.2f\n", couvert);
        System.out.printf("Ingresso = R$ %.2f\n", ingresso);
        System.out.printf("Valor a pagar = R$ %.2f\n", valorTotal);
    }

    public static double calcularConsumo(int cervejas, int refrigerantes, int espetinhos) {
        double valorCervejas = cervejas * 5.0;
        double valorRefrigerantes = refrigerantes * 3.0;
        double valorEspetinhos = espetinhos * 7.0;
        return valorCervejas + valorRefrigerantes + valorEspetinhos;
    }
}
