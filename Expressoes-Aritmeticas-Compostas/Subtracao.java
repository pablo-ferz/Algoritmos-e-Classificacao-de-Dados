public class Subtracao extends Expressao{
    private Expressao esquerda;
    private Expressao direita;

    public Subtracao(Expressao esquerda, Expressao direita){
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public double avaliar() {
        return esquerda.avaliar() - direita.avaliar();
    }
}