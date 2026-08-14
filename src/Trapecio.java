public class Trapecio extends Figura{
    private int baseMayor, baseMenor, altura;


    public Trapecio(String tipo ,int baseMayor,int baseMenor,int altura){
        super(tipo);
        this.baseMayor=baseMayor;
        this.baseMenor=baseMenor;
        this.altura=altura;
    }
    public int getAltura() {
        return altura;
    }

    public int getBaseMayor() {
        return baseMayor;
    }

    public int getBaseMenor() {
        return baseMenor;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBaseMayor(int baseMayor) {
        this.baseMayor = baseMayor;
    }

    public void setBaseMenor(int baseMenor) {
        this.baseMenor = baseMenor;
    }
    @Override
    public double area(){
        return ((double)(((this.baseMayor + this.baseMenor) * this.altura) / 2));

    }
}


