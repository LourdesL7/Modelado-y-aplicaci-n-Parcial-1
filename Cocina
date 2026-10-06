public class Cocina {

    private Instrumentos instrumentos;
    private Personal personal;
    private Ingredientes[] ingredientes;

    // Arreglo estatico con capacidad maxima de 5 ordenes
    private Orden[] ordenesPendientes = new Orden[5];

    public Cocina(Instrumentos instrumentos,
                  Personal personal,
                  Ingredientes[] ingredientes) {

        this.instrumentos = instrumentos;
        this.personal = personal;
        this.ingredientes = ingredientes;
    }

    public Orden[] espacio(Orden[] ordenesPendientes) {
        return ordenesPendientes;
    }

    public void limpiar() {
        System.out.println("Limpiando cocina...");
    }

    public void cocinar() {
        System.out.println("Cocinando pizza...");
    }
}