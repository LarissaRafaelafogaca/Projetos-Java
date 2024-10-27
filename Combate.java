package Jogo;

import java.util.Scanner;

public class Combate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos dados do primeiro campeão
        System.out.println("Digite os dados do primeiro campeão:");
        System.out.print("Nome: ");
        String nome1 = scanner.nextLine();
        System.out.print("Vida inicial: ");
        int vida1 = scanner.nextInt();
        System.out.print("Ataque: ");
        int ataque1 = scanner.nextInt();
        System.out.print("Armadura: ");
        int armadura1 = scanner.nextInt();
        scanner.nextLine(); // Consumir a linha pendente

        Campeao campeao1 = new Campeao(nome1, vida1, ataque1, armadura1);

        // Entrada dos dados do segundo campeão
        System.out.println("Digite os dados do segundo campeão:");
        System.out.print("Nome: ");
        String nome2 = scanner.nextLine();
        System.out.print("Vida inicial: ");
        int vida2 = scanner.nextInt();
        System.out.print("Ataque: ");
        int ataque2 = scanner.nextInt();
        System.out.print("Armadura: ");
        int armadura2 = scanner.nextInt();

        Campeao campeao2 = new Campeao(nome2, vida2, ataque2, armadura2);

        // Definir o número de turnos
        System.out.print("Quantos turnos você deseja executar? ");
        int turnos = scanner.nextInt();

        for (int i = 1; i <= turnos; i++) {
            if (!campeao1.estaVivo() || !campeao2.estaVivo()) {
                break;
            }

            System.out.println("\nResultado do turno " + i + ":");

            // Ataque simultâneo dos campeões
            campeao1.takeDamage(campeao2.getAtaque());
            campeao2.takeDamage(campeao1.getAtaque());

            // Exibir o status dos campeões
            System.out.println(campeao1.status());
            System.out.println(campeao2.status());
        }

        System.out.println("\n### FIM DO COMBATE ###");
        scanner.close();
    }
}
