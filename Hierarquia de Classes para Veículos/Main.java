public class Main{
    public static void main(String[] args){
        Veiculo veiculo = new Veiculo(5, 30,200);   
        Caminhao caminhao = new Caminhao(2,50,100,1000);
        OffRoad offRoad = new OffRoad(4, 40,150, 0.40);

        System.out.println("Veiculo: ");
        System.out.println(veiculo);

        System.out.println("\nCaminhao:");
        System.out.println(caminhao);

        System.out.println("\nOff Road:");
        System.out.println(offRoad);
    }
}
