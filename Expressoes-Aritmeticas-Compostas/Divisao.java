public class Divisao extends Expressao{
    private Expressao esquerda;
    private Expressao direita;

    public Divisao(Expressao esquerda, Expressao direita){
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public double avaliar() {
        return esquerda.avaliar() / direita.avaliar();
    }
}