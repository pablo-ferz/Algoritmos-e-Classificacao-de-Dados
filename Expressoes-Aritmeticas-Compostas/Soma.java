import java.util.List;
import java.util.ArrayList;

public class Soma extends Expressao{
    private List<Expressao> expressoes;

    public Soma(List<Expressao> expressoes){
        this.expressoes = new ArrayList<>(expressoes);
    }

    public void add(Expressao exprs){
        expressoes.add(exprs);
    }

    @Override 
    public double avaliar(){
        double resultado = 0;
        for(Expressao exprs : expressoes){
            resultado += exprs.avaliar();
        }
        return resultado;
    }         
}