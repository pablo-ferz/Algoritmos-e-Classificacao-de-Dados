import java.util.Arrays;

public class Híbrida{
 
    //  O Quicksort é excelente para vetores grandes, mas tem muito
    //  custo de recursão e partições quando os subvetores ficam pequenos.

    //  Enquanto o Insertion Sort é muito rápido para vetores pequenos, 
    //  mas não escala bem para vetores grandes, por conta de ter O(n²).

    //  Então na pratica, o Quick Sort divide o vetor grande. E quando ele chega em um subvetor pequeno
    // (que no caso usei como n = 10), o Insertion Sort assume o controle e ordena aquele bloco mais rapido.

    private static int LIMITE = 10;

    public static void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        quick(arr, 0, arr.length - 1);
    }

    private static void quick(int[] arr, int baixo, int alto){
        if (alto - baixo + 1 <= LIMITE) {
            insertion(arr, baixo, alto);
            return;
        }

        if (baixo < alto) {
            int pi = particionar(arr, baixo, alto);
            quick(arr, baixo, pi - 1);
            quick(arr, pi + 1, alto);
        }
    }

    private static int particionar(int[] arr, int baixo, int alto){
        int pivo = arr[alto];
        int i = (baixo - 1);

        for (int j = baixo; j < alto; j++) {
            if (arr[j] <= pivo) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[alto];
        arr[alto] = temp;

        return i + 1;
    }

    private static void insertion(int[] arr, int inicio, int fim){
        for (int i = inicio + 1; i <= fim; i++) {
            int chave = arr[i];
            int j = i - 1;

            while (j >= inicio && arr[j] > chave) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = chave;
        }
    }

    public static void main(String[] args){
        int[] teste1 = {32, 25, 49, 3, 19, 80, 12, 11, 57, 61, 16, 1, 24, 7, 44, 17, 8, 5, 36, 15};
        System.out.println("--- Teste 1: Vetor em ordem aleatória ---");
        System.out.println("Antes:  " + Arrays.toString(teste1));
        sort(teste1);
        System.out.println("Depois: " + Arrays.toString(teste1) + "\n");

        int[] teste2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        System.out.println("--- Teste 2: Vetor em ordem crescente ---");
        System.out.println("Antes:  " + Arrays.toString(teste2));
        sort(teste2);
        System.out.println("Depois: " + Arrays.toString(teste2) + "\n");

        int[] teste3 = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("--- Teste 3: Vetor em ordem decrescente ---");
        System.out.println("Antes:  " + Arrays.toString(teste3));
        sort(teste3);
        System.out.println("Depois: " + Arrays.toString(teste3) + "\n"  );

        int[] teste4 = {5, 2, 9, 5, 2, 3, 5, 1, 0, 9, 2, 3, 1, 5, 0, 9, 2, 3, 1, 5};
        System.out.println("--- Teste 4: Vetor com valores duplicados ---");
        System.out.println("Antes:  " + Arrays.toString(teste4));
        sort(teste4);
        System.out.println("Depois: " + Arrays.toString(teste4) + "\n");
    }
}