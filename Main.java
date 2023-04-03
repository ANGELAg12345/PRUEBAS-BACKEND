public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Alessandra", "Ferri", 37, "Av en algun lugar");
        Empleado empleado = new Empleado("Charles", "Simonyi", 45, "Ave 55 n 45-23", null);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad());

        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Apellido: " + empleado.getApellido());
        System.out.println("Edad: " + empleado.getEdad());
        System.out.println("Horas trabajadas: " + empleado.getHorasTrabajadas());

    }

}
