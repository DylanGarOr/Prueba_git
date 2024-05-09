public class Vendedor extends Empleado{
    private double Comision;
    private double Ventas;

    public Vendedor(String Nombre, String FechaDeNacimiento, Integer Edad, String Cargo, String Salario, Double Comision, Double Ventas){
        super(Nombre, FechaDeNacimiento, Edad, Cargo, Salario);
        this.Comision = Comision;
        this.Ventas = Ventas;
    }
    public double calcularSalario(){
        return Double.parseDouble(getSalario()) +  (Comision * Ventas);
    }
}
