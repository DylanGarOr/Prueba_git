public class Persona {
    private String Nombre;
    private Integer Edad;
    private String FechaDeNacimiento;

    public Persona(String Nombre, Integer Edad, String FechaDeNacimiento){
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.FechaDeNacimiento = FechaDeNacimiento;
    }

    public String obtenerNombre(){
        return Nombre;
    }
    public void establecerNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public Integer obtenerEdad(){
        return Edad;
    }
    public String obtenerFechaDeNacimiento(){
        return FechaDeNacimiento;
    }
    public  void establecerFechaDeNacimiento(String FechaDeNacimiento){
        this.FechaDeNacimiento = FechaDeNacimiento
    }
}
