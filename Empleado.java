
public class Empleado implements Trabajador {

    private String Nombre;
    private String Apellido;
    private int Edad;
    private String Direccion;
    private double SalarioBase;
    private int horasTrabajadas;

    public Empleado(String Nombre, String Apellido, int Edad, String Direccion, Double SalarioBase) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Direccion = Direccion;
        this.SalarioBase = SalarioBase;

    }
    // * punto 7*/

    @Override
    public double CalcularSalario() {
        return SalarioBase * horasTrabajadas;
    }

    @Override
    public void ImprimirHorario() {
        System.out.println("Horario laborado" + this.Nombre + " " + this.Apellido + " " + this.Edad + " "
                + this.Direccion + " " + this.SalarioBase + " : Lunes a viernes de 9am  5 PM");
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getNombre() {
        return null;
    }

    public String getApellido() {
        return null;
    }

    public String getEdad() {
        return null;
    }

    public String getHorasTrabajadas() {
        return null;
    }
}