import java.util.Scanner;

public class exercício5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hora_aula, porcentagem, bruto, horas_trabalhadas, desconto, liquido;

        System.out.println("Digite o valor da hora-aula multiplicada: ");
        hora_aula = sc.nextDouble();
        System.out.println("Digite o valor de horas trabalhadas: ");
        horas_trabalhadas = sc.nextDouble();
        System.out.println("Porcentagem de desconto do INSS: ");
        porcentagem = sc.nextDouble();

        bruto = hora_aula * horas_trabalhadas;
        System.out.println("O valor do salário bruto é: " +bruto);
        desconto = bruto * porcentagem / 100;
        System.out.println("O valor do desconto será: " +porcentagem);
        liquido = bruto - desconto;
        System.out.println("O valor do salário líquido é R$ " + String.format("%.2f", liquido));


    }
}
