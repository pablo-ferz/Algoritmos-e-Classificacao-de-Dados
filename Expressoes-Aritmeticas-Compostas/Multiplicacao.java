import java.util.List;
import java.util.ArrayList;

public class Multiplicacao extends Expressao{
    private List<Expressao> expressoes;
 
    public Multiplicacao(List<Expressao> expressoes){
        this.expressoes = new ArrayList<>(expressoes);
    }

    public void add(Expressao exprs){
        expressoes.add(exprs);
    }

    @Override
    public double avaliar() {
        if (expressoes.isEmpty()){
            return 0;
        }
        double resultado = 1;
        for(Expressao exprs : expressoes){
            resultado *= exprs.avaliar();
        }
        return resultado;
    }
}