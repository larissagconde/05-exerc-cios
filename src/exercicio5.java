import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioMinimo;
        double valorKwatt, conta;
        int qtdKwatt;

        System.out.print("Informe o valor do salário mínimo R$ ");
        salarioMinimo = sc.nextDouble();
        System.out.print("Informe a quantidade de quilowatt ");
        qtdKwatt = sc.nextInt();

        valorKwatt = salarioMinimo / 7 / 100;
        conta = qtdKwatt * valorKwatt;

        System.out.println("Valor da conta R$ " + conta);
        System.out.println("Valor do quilowatt R$ " + valorKwatt);
        System.out.println("Valor da conta com 10% de desconto R$ " + conta * 0.90);
    }
}
