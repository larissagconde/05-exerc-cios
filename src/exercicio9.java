import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variáveis
        int valor;
        int unidade, dezena, centena;
        int valorInvertido;

        System.out.print("Informe um valor com 3 dígitos (100 - 999): ");
        valor = sc.nextInt();

        unidade = valor % 10;
        dezena = valor / 10 % 10;
        centena = valor / 100;
        valorInvertido = unidade * 100 + dezena * 10 + centena;

        System.out.println(unidade + "" + dezena + "" + centena);
        System.out.println(valorInvertido);


    }
}
