import java.util.Date;

public class Ingredientes {

    private int cantidad;
    private String marca;
    private Date fechaDeVencimiento;

    public Ingredientes(int cantidad, String marca, Date fechaDeVencimiento) {
        this.cantidad = cantidad;
        this.marca = marca;
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public boolean tirarIngrediente() {
        Date hoy = new Date();

        if (fechaDeVencimiento.before(hoy)) {
            return true;
        }

        return false;
    }
}