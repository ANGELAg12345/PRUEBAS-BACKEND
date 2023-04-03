
class Persona{

    private String Nombre;
    private String Apellido;
    private int Edad;
    private String Direccion;

    public Persona(String Nombre, String Apellido, int Edad, String Direccion){
         this.Nombre = Nombre;
         this.Apellido = Apellido;
         this.Edad = Edad;
         this.Direccion = Direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
    
}

