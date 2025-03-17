import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
     /**
     * La aerolínea AirFly necesita un sistema básico para gestionar su personal y flota de aviones. Se requiere desarrollar una aplicación en Java que contemple lo siguiente:
     * 1. Gestión de Personal
     * Implementar una clase Empleado con atributos como nombre, ID y departamento.
     * Crear objetos de tipo Empleado con diferentes datos y mostrarlos en pantalla.
     * 2. Gestión de Flota de Aviones
     * Implementar una clase Avión con atributos como matrícula, modelo y capacidad de pasajeros.
     * Crear objetos de tipo Avión con diferentes datos y mostrarlos en pantalla.
     * 3. Programa Principal (Main)
     * En la clase Main, instanciar al menos tres empleados y dos aviones.
     * Mostrar en pantalla la información de cada objeto utilizando System.out.println()
     **/

     Empleado emple1 = new Empleado("Carlos",78923812,"Controlador Aereo");
     Empleado emple2 = new Empleado("Francisco",89564895,"Piloto");
     Empleado emple3 = new Empleado("Joseph",87654321,"Personal de Seguridad");
     Empleado emple4= new Empleado("Claudia",24554321,"Ingeniero de vuelo");
     System.out.println("Nombre: "+emple1.getNombre());
     System.out.println("Nombre: "+emple1.getId());
     System.out.println("Nombre: "+emple1.getDepartamento());
     System.out.println(emple1.toString());
     System.out.println(emple2.toString());
     System.out.println(emple3.toString());
     System.out.println(emple4.toString());
     emple1.setNombre("Carlos");
     emple1.setDepartamento("Controlador Aereo");
     emple1.setId(78923812);

     Aviones avion1= new Aviones("Aviones Militares","FG-W2T",200);
     Aviones avion2= new Aviones("Aviones Ala Rotatoria","CG-601",175);
     Aviones avion3= new Aviones("Aviones De Carga","SLP-98",468);
     System.out.println("Modelo : "+avion1.getModelo());
     System.out.println("Matricula : "+avion1.getMatricula());
     System.out.println("Capacidad : "+avion1.getCapacidad());
     System.out.println(avion1.toString());
     System.out.println(avion2.toString());
     System.out.println(avion3.toString());
     avion2.setMatricula("CG-601");
     avion2.setModelo("Aviones Ala Rotatoria");
     avion2.setCapacidad(175);






}
}