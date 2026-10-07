# Modelado-y-aplicaci-n-Parcial-1
## Observaciones durante la implementación del UML

Durante el proceso de trasladar el diagrama de clases UML a código Java se encontraron algunos aspectos que necesitaron ser adaptados para poder realizar la implementación.

### 1. Uso de tipos enum

En el diagrama UML algunos atributos fueron definidos utilizando el tipo general enum. Al trasladarlos a Java fue necesario especificar el tipo concreto de cada enumeración.

Por ejemplo:

- tipoDeSalsa : enum se implementó como TipoDeSalsa.
- toppings : enum se implementó como Toppings.
- tamano : enum se implementó como Tamano.
- formaDePago : enum se implementó como FormaDePago.
- instrumentos : enum se implementó como Instrumentos.
- cargo : enum se implementó como Cargo.

Este cambio fue necesario porque Java requiere indicar explícitamente el tipo de enumeración utilizado por cada atributo.

### 2. Tipo Masa

En la clase Pizza, el UML establece el atributo tipoDeBase : Masa. Para conservar esta estructura fue necesario crear Masa como un tipo dentro del proyecto.

No se agregaron tipos específicos de masa debido a que estos no fueron definidos originalmente en el diagrama UML.

### 3. Arreglo estático de órdenes

El UML representa en la clase Cocina el manejo de órdenes pendientes con una capacidad de 5 elementos.

Al implementarlo en Java se utilizó un arreglo de tamaño fijo:

Orden[] ordenesPendientes = new Orden[5];

Esto permite cumplir con el requisito de almacenar un máximo de cinco órdenes pendientes en la cocina.

### 4. Sobrecarga del método para añadir ingredientes

El UML contiene dos versiones del método para añadir ingredientes en la clase Pizza. Esta sobrecarga se mantuvo en Java mediante:

- anadirIngredientes(Ingredientes ingrediente)
- anadirIngredientes(Ingredientes[] ingredientes)

De esta manera se puede añadir un solo ingrediente o un arreglo de ingredientes utilizando el mismo nombre de método.

### 5. Implementación de los métodos

El diagrama UML define principalmente la estructura de las clases y las firmas de sus métodos, pero no especifica toda su lógica interna.

Por esta razón, durante la implementación fue necesario agregar el comportamiento de los métodos. Por ejemplo, aceptarOrden() se utiliza para realizar la validación correspondiente a la orden.

### 6. Clase Main

La clase Main se utilizó únicamente como punto de ejecución y prueba del modelo. Su función es crear una orden y verificar si la pizza correspondiente cumple con la orden.

Las demás clases definidas en el UML se mantienen como parte de la estructura del sistema aunque no todas necesiten ser instanciadas directamente desde `Main`.

## Conclusión

No se realizaron cambios importantes en la estructura planteada originalmente en el diagrama UML. Los cambios encontrados durante el pase a código corresponden principalmente a adaptaciones necesarias para representar correctamente el modelo utilizando la sintaxis y los tipos de datos de Java.
