public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double taxa;

    public double salarioLiquido(){

        return salarioBruto - taxa;

    }

    public void  salarioFinal(double aumento ){

        salarioBruto+=salarioBruto*(aumento/100);

    }

    public String toString(){
        return nome+", $ "+String.format("%.2f",salarioLiquido());
    }





}