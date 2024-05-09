public class Empleado extends Persona implements Trabajador{
    private String Cargo;

    public  Empleado(String Nombre, String FechaDeNacimiento, Integer Edad){
        super(Nombre,Edad, FechaDeNacimiento);
    }

    @Override
    public void realizarTarea(){
        System.out.println("Realizando tarea laboral");
    }
}
