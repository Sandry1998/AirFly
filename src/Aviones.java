public class Aviones {
    //Definicion de los atributos de la clase
    String modelo;
    String matricula;
    int capacidad;

    //Métodos constructivos
    public Aviones(String modelo, String matricula, int capacidad) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Aviones-> " +
                "\nModelo: " + modelo +
                "\nMatricula: " + matricula +
                "\nCapacidad: " + capacidad;

    }
}
