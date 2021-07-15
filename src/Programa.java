import calculadora.Calculadora;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Livro livro = new Livro("Em busca do Sentido da vida", 250);

        System.out.println(livro);

        System.out.println("Digite o valor de A.: ");
        int a = scanner.nextInt();

        System.out.println("Digite o valor de B.: ");
        int b = scanner.nextInt();

        Calculadora calc = new Calculadora();

        System.out.println("Soma.: "+calc.somar(a,b));
        System.out.println("Subtração.: "+calc.subtrair(a,b));
        System.out.println("Multiplicação.: "+calc.multiplicar(a,b));
        System.out.println("Divisão.: "+calc.dividir(a,b));


    }

}

