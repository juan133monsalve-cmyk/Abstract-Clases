public class App {
    public static void main(String[] args) throws Exception {
        Figura Triangulo = new Triangulo("Triangulo", 5 , 5 );
        Figura Cuadrado = new Cuadrado("Cuadradro", 5);
        Figura Circulo = new Circulo("Circulo", 2);
        Figura Trapceio = new Trapecio("Trapecio", 5, 3, 4);
        Triangulo.mostrarInfo(Triangulo);
        Cuadrado.mostrarInfo(Cuadrado);
        Circulo.mostrarInfo(Circulo);
        Trapceio.mostrarInfo(Trapceio);
    }
}
