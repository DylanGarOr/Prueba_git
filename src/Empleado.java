public class Empleado extends Persona implements Trabajador{
    private String Cargo;
    private String Salario;

    public  Empleado(String Nombre, String FechaDeNacimiento, Integer Edad, String Cargo, String Salario){
        super(Nombre,Edad, FechaDeNacimiento);
        this.Cargo = Cargo;
        this.Salario = Salario;
    }
    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getSalario() {
        return Salario;
    }

    public void setSalario(String Salario) {
        this.Salario = Salario;
    }

    @Override
    public void realizarTarea(){
        System.out.println("Realizando tarea laboral");
    }
}
