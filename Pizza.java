public class Pizza {

    private Ingredientes[] ingredientes;
    private Masa tipoDeBase;
    private TipoDeSalsa tipoDeSalsa;
    private Toppings toppings;
    private Tamano tamano;

    public Pizza(Masa tipoDeBase, TipoDeSalsa tipoDeSalsa, Toppings toppings) {
        this.tipoDeBase = tipoDeBase;
        this.tipoDeSalsa = tipoDeSalsa;
        this.toppings = toppings;
        this.ingredientes = new Ingredientes[10];
    }

    public Pizza(Tamano tamano) {
        this.tamano = tamano;
        this.ingredientes = new Ingredientes[10];
    }

    // Sobrecarga 1
    public void anadirIngredientes(Ingredientes ingrediente) {
        for (int i = 0; i < ingredientes.length; i++) {
            if (ingredientes[i] == null) {
                ingredientes[i] = ingrediente;
                break;
            }
        }
    }

    // Sobrecarga 2
    public void anadirIngredientes(Ingredientes[] ingredientesNuevos) {
        for (Ingredientes ingrediente : ingredientesNuevos) {
            anadirIngredientes(ingrediente);
        }
    }
}