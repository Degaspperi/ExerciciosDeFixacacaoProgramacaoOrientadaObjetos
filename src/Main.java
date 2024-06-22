//Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
//seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
//salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
//afetado pela porcentagem) e mostrar novamente os dados do funcionário.

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Funcionario funcionario;
        funcionario = new Funcionario();


        System.out.println("Informe seu nome: ");
        funcionario.nome = ler.nextLine();

        System.out.println("Informe seu salário bruto: ");
        funcionario.salarioBruto = ler.nextDouble();

        System.out.println("Informe a taxa de imposto: ");
        funcionario.taxa = ler.nextDouble();

        System.out.println("Funcionário: "+funcionario.nome+", $"+funcionario.salarioLiquido());

        System.out.println("Informe a porcentagem de aumento: ");
        double aumento = ler.nextDouble();
        funcionario.salarioFinal(aumento);

        System.out.println("Dados atualizados: "+funcionario);





    }
}