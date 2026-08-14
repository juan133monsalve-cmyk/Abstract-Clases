public abstract class Figura{
    private String tipo;

    public Figura (String tipo){
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract double area();

    public void mostrarInfo(Figura a){
        System.out.println("-------------------------------------------------");
        System.out.println("Tipo :  " + a.getTipo());
        System.out.println("Area : " + a.area());
    }
}