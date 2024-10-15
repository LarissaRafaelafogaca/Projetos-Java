package projeto01;
import java.util.Scanner;

public class CalculadoraImposto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Renda anual com salário: ");
        double salarioAnual = scanner.nextDouble();

        System.out.print("Renda anual com prestação de serviço: ");
        double prestacaoServicos = scanner.nextDouble();

        System.out.print("Renda anual com ganho de capital: ");
        double ganhoCapital = scanner.nextDouble();

        System.out.print("Gastos médicos: ");
        double gastosMedicos = scanner.nextDouble();

        System.out.print("Gastos educacionais: ");
        double gastosEducacionais = scanner.nextDouble();

        // Cálculo dos impostos
        double impostoSalario = calcularImpostoSalario(salarioAnual);
        double impostoServicos = prestacaoServicos * 0.15;
        double impostoGanhoCapital = ganhoCapital * 0.20;

        // Cálculo das deduções
        double totalImpostoBruto = impostoSalario + impostoServicos + impostoGanhoCapital;
        double dedutivel = calcularDeducao(gastosMedicos, gastosEducacionais, totalImpostoBruto * 0.30);

        double impostoDevido = totalImpostoBruto - dedutivel;

        // Exibir o relatório
        System.out.println("\n### RELATÓRIO DE IMPOSTO DE RENDA ###");
        System.out.println("* CONSOLIDADO DE RENDA:");
        System.out.printf("Imposto sobre salário: %.2f\n", impostoSalario);
        System.out.printf("Imposto sobre serviços: %.2f\n", impostoServicos);
        System.out.printf("Imposto sobre ganho de capital: %.2f\n", impostoGanhoCapital);
        System.out.println("\n* DEDUÇÕES:");
        System.out.printf("Máximo dedutível: %.2f\n", totalImpostoBruto * 0.30);
        System.out.printf("Gastos dedutíveis: %.2f\n", dedutivel);
        System.out.println("\n* RESUMO:");
        System.out.printf("Imposto bruto total: %.2f\n", totalImpostoBruto);
        System.out.printf("Abatimento: %.2f\n", dedutivel);
        System.out.printf("Imposto devido: %.2f\n", impostoDevido);
        scanner.close();
    }

    public static double calcularImpostoSalario(double salarioAnual) {
        double salarioMensal = salarioAnual / 12;
        if (salarioMensal < 3000) {
            return 0;
        } else if (salarioMensal < 5000) {
            return salarioAnual * 0.10;
        } else {
            return salarioAnual * 0.20;
        }
    }

    public static double calcularDeducao(double gastosMedicos, double gastosEducacionais, double maxDedutivel) {
        double totalGastos = gastosMedicos + gastosEducacionais;
        return Math.min(totalGastos, maxDedutivel);
    }
}