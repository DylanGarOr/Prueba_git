public class Rectangulo extends FiguraGeometrica {

    private double Ancho;
    private double Longitud;

    public Rectangulo(String Nombre, String Color, double Ancho, double Longitud) {
        super(Nombre, Color);
        this.Ancho = Ancho;
        this.Longitud = Longitud;
    }

    public double calcularArea() {
        return Ancho * Longitud;
    }

    public double calcularPerimetro() {
        return 2 * (Ancho + Longitud);
    }
}

