public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.edad = 20;
        cliente.nombre = "Juan Carlos";
        cliente.telefono = "3241 43432342";
        cliente.credito = 1000;

        System.out.println("Edad: " + cliente.edad);
        System.out.println("Nombre: " + cliente.nombre);
        System.out.println("Telefono: " + cliente.telefono);
        System.out.println("Credito: " + cliente.credito);

        trabajador.edad = 31;
        trabajador.nombre = "Pepe";
        trabajador.telefono = "3567 8493849";
        trabajador.salario = 5000;

        System.out.println("Edad: " + trabajador.edad);
        System.out.println("Nombre: " + trabajador.nombre);
        System.out.println("Telefono: " + trabajador.telefono);
        System.out.println("Salario: " + trabajador.salario);

    }
}

class Persona{
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona{
    int credito;

}

class Trabajador extends Persona{
    int salario;
}
