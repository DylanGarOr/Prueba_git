public class Estudiante extends Persona{

    private  String Grado;

    public Estudiante(String Nombre, Integer Edad, String FechaDeNacimiento, String Grado){
        super (Nombre, Edad, FechaDeNacimiento);
        this.Grado = Grado;
    }
}
