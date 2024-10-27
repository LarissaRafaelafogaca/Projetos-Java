package Jogo;

import java.util.Scanner;

class Campeao {
    private String nome;
    private int vida;
    private int ataque;
    private int armadura;

    public Campeao(String nome, int vida, int ataque, int armadura) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.armadura = armadura;
    }

    public void takeDamage(int dano) {
        int danoRecebido = Math.max(1, dano - this.armadura); // Garante que pelo menos 1 de dano é tomado
        this.vida = Math.max(0, this.vida - danoRecebido); // Garante que a vida não fique negativa
    }

    public String status() {
        return this.vida > 0 ? this.nome + ": " + this.vida + " de vida" : this.nome + ": 0 de vida (morreu)";
    }

    public int getAtaque() {
        return this.ataque;
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }
}

