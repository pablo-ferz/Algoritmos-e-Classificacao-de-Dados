public class Veiculo{
    private int passageiros;
    private double tanque;
    private double mpg;

    public Veiculo(int passageiros, double tanque, double mpg){
        this.passageiros = passageiros;
        this.tanque = tanque;
        this.mpg = mpg;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public double getTanque(){
        return tanque;
    }

    public void setTanque(double tanque){
        this.tanque = tanque;    
    }

    public double getMpg(){
        return mpg;
    }

    public void setMpg(double mpg){
        this.mpg = mpg;    
    }

    public String toString(){
        return "Passageiros: " + passageiros + ", Capacidade do tanque: " + tanque + ", Metros por galão: " + mpg; 
    }    
}