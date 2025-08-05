import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner numeros = new Scanner(System.in);
        System.out.println("Informe um primeiro número: ");
        int num1 = numeros.nextInt();
        int num = 0;

        do {
            System.out.println("Digite um número qualquer: ");
            num = numeros.nextInt();

            if (num < num1) {
                continue;
            }

            if(num % num1 != 0) {
                break;
            }

            System.out.println("Número válido: " + num);
        } while (true);
    }
}

