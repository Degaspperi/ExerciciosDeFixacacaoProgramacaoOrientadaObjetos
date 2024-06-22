public class Aluno {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;



    public double notaFinal(){
        return nota1+nota2+nota3;
    }

    public String recuperacao(){
        String decisao = "Passou";
         if (notaFinal()<60){
             double pontosFaltantes = 60-notaFinal();
             decisao = "Está de recuperação! Quantidade de pontos que faltaram: "+pontosFaltantes;

        }
         return decisao;
    }





}
