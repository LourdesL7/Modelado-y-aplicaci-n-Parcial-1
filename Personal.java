public class Personal {

    private String nombre;
    private int edad;
    private Cargo cargo;

    public Personal(String nombre, int edad, Cargo cargo) {
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = cargo;
    }

    public void tareaDelArea() {
        System.out.println("Realizando tarea del area: " + cargo);
    }
}