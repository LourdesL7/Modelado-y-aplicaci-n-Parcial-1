import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Jack Pizza Chef");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 10));

        // Panel del formulario
        JPanel campos = new JPanel(new GridLayout(7, 2, 5, 5));
        campos.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JTextField cliente = new JTextField();

        JComboBox<TipoDeSalsa> salsaPedido =
                new JComboBox<>(TipoDeSalsa.values());

        JComboBox<Toppings> toppingPedido =
                new JComboBox<>(Toppings.values());

        JComboBox<TipoDeSalsa> salsaPreparada =
                new JComboBox<>(TipoDeSalsa.values());

        JComboBox<Toppings> toppingPreparado =
                new JComboBox<>(Toppings.values());

        JComboBox<FormaDePago> formaPago =
                new JComboBox<>(FormaDePago.values());

        JTextField nit = new JTextField();


        // Agregar componentes
        campos.add(new JLabel("Cliente:"));
        campos.add(cliente);

        campos.add(new JLabel("Salsa pedida:"));
        campos.add(salsaPedido);

        campos.add(new JLabel("Topping pedido:"));
        campos.add(toppingPedido);

        campos.add(new JLabel("Salsa preparada:"));
        campos.add(salsaPreparada);

        campos.add(new JLabel("Topping preparado:"));
        campos.add(toppingPreparado);

        campos.add(new JLabel("Forma de pago:"));
        campos.add(formaPago);

        campos.add(new JLabel("NIT:"));
        campos.add(nit);


        JButton verificar = new JButton("Verificar orden");

        JTextArea resultado = new JTextArea(5, 30);
        resultado.setEditable(false);


        verificar.addActionListener(e -> {

            String nombreCliente = cliente.getText();

            TipoDeSalsa salsaSolicitada =
                    (TipoDeSalsa) salsaPedido.getSelectedItem();

            Toppings toppingSolicitado =
                    (Toppings) toppingPedido.getSelectedItem();

            TipoDeSalsa salsaPizza =
                    (TipoDeSalsa) salsaPreparada.getSelectedItem();

            Toppings toppingPizza =
                    (Toppings) toppingPreparado.getSelectedItem();

            FormaDePago pago =
                    (FormaDePago) formaPago.getSelectedItem();

            try {

                int numeroNit = Integer.parseInt(nit.getText());

                Masa masa = new Masa();

                // Pizza que pidió el cliente
                Pizza pizzaPedida = new Pizza(
                        masa,
                        salsaSolicitada,
                        toppingSolicitado
                );

                // Crear la orden
                Orden orden = new Orden(
                        nombreCliente,
                        75.50f,
                        pizzaPedida,
                        numeroNit,
                        pago
                );

                // Pizza que fue preparada
                Pizza pizzaPreparada = new Pizza(
                        masa,
                        salsaPizza,
                        toppingPizza
                );


                // Verificar si coincide con el pedido
                if (salsaSolicitada == salsaPizza
                        && toppingSolicitado == toppingPizza) {

                    resultado.setText(
                            "ORDEN CORRECTA\n"
                            + "Cliente: " + nombreCliente
                            + "\nSalsa: " + salsaPizza
                            + "\nTopping: " + toppingPizza
                            + "\nForma de pago: " + pago
                    );

                } else {

                    resultado.setText(
                            "ORDEN INCORRECTA\n"
                            + "La pizza preparada no coincide "
                            + "con el pedido."
                    );
                }

            } catch (NumberFormatException ex) {

                resultado.setText(
                        "Error: el NIT debe ser un numero."
                );
            }
        });


        frame.add(campos, BorderLayout.NORTH);
        frame.add(verificar, BorderLayout.CENTER);
        frame.add(new JScrollPane(resultado), BorderLayout.SOUTH);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}