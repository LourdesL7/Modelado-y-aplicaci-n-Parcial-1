public class Orden {

    private String cliente;
    private float monto;
    private FormaDePago formaDePago;
    private Pizza pizza;
    private int nit;

    public Orden(String cliente, float monto, Pizza pizza,
                 int nit, FormaDePago formaDePago) {

        this.cliente = cliente;
        this.monto = monto;
        this.pizza = pizza;
        this.nit = nit;
        this.formaDePago = formaDePago;
    }

    public Orden(Pizza pizza) {
        this.pizza = pizza;
    }

    public Orden ordenPendiente(Pizza pizza, float monto, String cliente) {
        return new Orden(cliente, monto, pizza, 0, null);
    }

    public boolean aceptarOrden() {
        return pizza != null;
    }
}