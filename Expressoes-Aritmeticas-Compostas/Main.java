import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        // expressão utilizada: ((10 + 20) × 5) - ((100 / 4) + 7)
        Expressao exprs = 
        new Subtracao(
                new Multiplicacao(new ArrayList<>(Arrays.asList(
                    new Soma(Arrays.asList(new Numero(10), new Numero(20))),
                    new Numero(5)
                ))),
                new Soma(Arrays.asList(
                    new Divisao(new Numero(100), new Numero(4)),
                    new Numero(7)
                ))
            );

        System.out.println("Resultado: " + exprs.avaliar());
    }
}