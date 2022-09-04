package listasDeExercicios.lista3.ex08;

import java.util.Scanner;

public class PrincipalEmp {
    public static void main(String[] args) {
        Empregado e = new Empregado();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        e.setNome(nome);

        System.out.print("Salário bruto: ");
        double salarioBruto = entrada.nextDouble();
        e.setSalarioBruto(salarioBruto);

        System.out.print("Imposto: ");
        double imposto = entrada.nextDouble();
        e.setImposto(imposto);

        e.buscasSalarioLiquido();

        System.out.println("Qual a porcentagem para aumentar o salario? ");
        double porcentagem = entrada.nextDouble();
        e.aumentarSalario(porcentagem);
        entrada.close();
    }
}

