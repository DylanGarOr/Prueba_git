public class Estudiante extends Persona implements Trabajador{

    private  String Grado;

    public Estudiante(String Nombre, Integer Edad, String FechaDeNacimiento, String Grado){
        super (Nombre, Edad, FechaDeNacimiento);
        this.Grado = Grado;
    }
    @Override
    public String toString(){
        return "Nombre: " + obtenerNombre() + " Edad: " + obtenerEdad() + " Fecha de nacimiento: " + obtenerFechaDeNacimiento() + " Grado: " + Grado;
    }

    @Override
    public void realizarTarea(){
        System.out.println("realizando tarea escolar de grado " + Grado);
    }
}
