import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Ingredientes ingrediente1 =
                new Ingredientes(2, "Marca A", new Date());

        Ingredientes ingrediente2 =
                new Ingredientes(1, "Marca B", new Date());


        Masa masa = new Masa();

        Pizza pizza = new Pizza(
                masa,
                TipoDeSalsa.NORMAL,
                Toppings.PEPPERONI
        );


        pizza.anadirIngredientes(ingrediente1);

        Ingredientes[] listaIngredientes = {
                ingrediente1,
                ingrediente2
        };

        pizza.anadirIngredientes(listaIngredientes);


        Orden orden = new Orden(
                "Juan",
                75.50f,
                pizza,
                123456,
                FormaDePago.EFECTIVO
        );


        if (orden.aceptarOrden()) {
            System.out.println("Orden aceptada");
        } else {
            System.out.println("Orden rechazada");
        }


        Personal cocinero = new Personal(
                "Carlos",
                25,
                Cargo.COCINERO
        );

        cocinero.tareaDelArea();


        Ingredientes[] ingredientesCocina = {
                ingrediente1,
                ingrediente2
        };


        Cocina cocina = new Cocina(
                Instrumentos.HORNO,
                cocinero,
                ingredientesCocina
        );


        Orden[] ordenesPendientes = new Orden[5];

        ordenesPendientes[0] = orden;

        cocina.espacio(ordenesPendientes);


        cocina.cocinar();


        cocina.limpiar();
    }
}