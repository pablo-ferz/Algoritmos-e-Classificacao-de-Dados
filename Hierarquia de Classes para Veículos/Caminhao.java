public class Caminhao extends Veiculo{
    private double cargoCap;

    public Caminhao(int passageiros, double tanque, double mpg, double cargoCap){
        super(passageiros, tanque, mpg);
        this.cargoCap = cargoCap;
    }

    public double getCargoCap(){
        return cargoCap;
    }

    public void setCargoCap(double cargoCap){
        this.cargoCap = cargoCap;
    }

    public String toString(){
        return "Passageiros: " + getPassageiros() + ", Capacidade do tanque: " + getTanque() + ", Metros por galão: " + getMpg() + ", Capacidade de carga: " + cargoCap; 
    }
}
