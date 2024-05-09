public class Circulo extends FiguraGeometrica{

    private double Radio;

    public Circulo(String Nombre, String Color, double Radio) {
        super(Nombre, Color);
        this.Radio = Radio;
    }

    public double calcularArea() {
        return Radio * Radio * 3.14159;
    }

    public double calcularPerimetro() {
        return 2 * Radio * 3.14159;
    }
}
