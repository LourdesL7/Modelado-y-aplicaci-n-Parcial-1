public class Main {

    public static void main(String[] args) {

        Masa masa = new Masa();

        Pizza pizza = new Pizza(
                masa,
                TipoDeSalsa.NORMAL,
                Toppings.PEPPERONI
        );

        Orden orden = new Orden(
                "Juan",
                75.50f,
                pizza,
                123456,
                FormaDePago.EFECTIVO
        );

        if (orden.aceptarOrden()) {
            System.out.println("La pizza cumple con la orden.");
        } else {
            System.out.println("La pizza no cumple con la orden.");
        }
    }
}