public class FiguraGeometrica {
    private String Color;
    private String Nombre;

    public FiguraGeometrica(String Color, String Nombre){
        this.Color = Color;
        this.Nombre = Nombre;
    }
    public String obtenerColor(){
        return Color;
    }

    public void establecerColor(String Color) {
        this.Color = Color;
    }

    public String obtenerNombre(){
        return Nombre;
    }
    public void establecerNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
