public class Triangulo extends Figura{
    private int base;
    private int altura;

    public Triangulo(String tipo ,int base,int altura){
        super(tipo);
        this.base=base;
        this.altura=altura;
    }
    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }
    @Override
    public double area(){
        return ((double)(this.altura*this.base)/2);

    }
}
