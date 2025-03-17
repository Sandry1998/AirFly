public class Empleado {

    //Definicon de los atributos
    String nombre;
    int Id;
    String departamento;
    static int contador=0;
    int contador0;

    //Métodos constructivos
    public Empleado(String nombre, int Id, String departamento) {
        this.nombre = nombre;
        this.Id = Id;
        this.departamento = departamento;
        this.contador0=++contador;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return Id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Contador -> " + contador0 +
                "\nNombre: " + nombre +
                "\nId: " + Id +
                "\nDepartamento: " + departamento;

    }
}
