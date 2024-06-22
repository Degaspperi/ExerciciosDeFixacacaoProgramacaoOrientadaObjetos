//Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
//(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
//ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
//para o aluno obter o mínimo para ser aprovado (que é 60% da nota).


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner ler=new Scanner(System.in);
        Aluno estudante;
        estudante = new Aluno();

        System.out.println("Informe seu nome completo: ");
        estudante.nome = ler.nextLine();

        System.out.println("Informe a nota do primeiro trimestre (0-30)");
        estudante.nota1 = ler.nextDouble();

        System.out.println("Informe a nota do segundo trimestre (0-35)");
        estudante.nota2 = ler.nextDouble();

        System.out.println("Informe a nota do terceiro trimestre (0-35)");
        estudante.nota3 = ler.nextDouble();

        System.out.println("Nota final:"+estudante.notaFinal());
        System.out.println(estudante.recuperacao());




    }
}