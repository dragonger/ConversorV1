package conversor.Conversor;

import java.io.ObjectInputStream;
import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor do salario: ");
	int salario = Integer.parseInt((teclado.nextLine()));
        System.out.print("Digite o valor do dolar: ");
    float dolar = Float.parseFloat(teclado.nextLine());
    float conversão = salario* dolar;
        System.out.printf("Salario em real é de %.2f \n ",conversão);
        System.out.println("Tudo bem gift hub?");
    }
}
