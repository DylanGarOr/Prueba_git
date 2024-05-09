public class Gerente extends Empleado{
    private double Bono;

    public Gerente(String Nombre, String FechaDeNacimiento, Integer Edad, String Cargo, String Salario, Double Bono){
        super(Nombre, FechaDeNacimiento, Edad, Cargo, Salario);
        this.Bono = Bono;
    }

    @Override
    public double calcularSalario(){
        return Double.parseDouble(getSalario()) +  Bono;
    }
}
