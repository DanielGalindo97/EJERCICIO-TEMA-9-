# EJERCICIO-TEMA-9-
public class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

public class Cliente extends Persona {
    private double credito;

    public Cliente(int edad, String nombre, String telefono, double credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

public class Trabajador extends Persona {
    private double salario;

    public Trabajador(int edad, String nombre, String telefono, double salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(30, "Juan", "555-1234", 1000.0);
        System.out.println("Cliente:");
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Crédito: " + cliente.getCredito());

        Trabajador trabajador = new Trabajador(40, "María", "555-5678", 2000.0);
        System.out.println("\nTrabajador:");
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Teléfono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());
    }
}
