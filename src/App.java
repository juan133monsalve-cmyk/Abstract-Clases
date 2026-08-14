public class App {
    public static void main(String[] args) throws Exception {
        Figura Triangulo = new Triangulo("Triangulo", 4 , 6 );
        Figura Cuadrado = new Cuadrado("Cuadradro", 7);
        Figura Circulo = new Circulo("Circulo", 3);
        Figura Trapceio = new Trapecio("Trapecio", 5, 3, 4);
        Triangulo.mostrarInfo(Triangulo);
        Cuadrado.mostrarInfo(Cuadrado);
        Circulo.mostrarInfo(Circulo);
        Trapceio.mostrarInfo(Trapceio);
    }
}
