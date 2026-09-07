public class OffRoad extends Veiculo{
    private double alturaSolo;

    public OffRoad(int passageiros, double tanque, double mpg, double alturaSolo){
        super(passageiros, tanque, mpg);
        this.alturaSolo = alturaSolo;
    }

    public double getAlturaSolo(){
        return alturaSolo;
    }

    public void setAlturaSolo(double alturaSolo){
        this.alturaSolo = alturaSolo;
    }

    public String toString(){
        return "Passageiros: " + getPassageiros() + ", Capacidade do tanque: " + getTanque() + ", Metros por galão: " + getMpg() + ", Altura em relação ao solo: " + alturaSolo; 
    }
}