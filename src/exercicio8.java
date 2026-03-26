import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variáveis
        int valor, dezena;

        //entrada de dados
        System.out.print("Informe um valor de três digitos (100 - 999): ");
        valor = sc.nextInt();
        dezena = valor % 100 / 10;
        System.out.println("dezena = " + dezena);

    }
}
