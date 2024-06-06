Funcinamiento del programa.

Definición de Clases:

Aeropuerto:
Define los atributos y métodos de los aeropuertos.
Vuelo: Define los atributos y métodos generales para un vuelo.
VueloRegular: Hereda de Vuelo y añade atributos específicos para vuelos regulares (como la aerolínea, el tipo de avión y los horarios).
VueloCharter: Hereda de Vuelo y añade atributos específicos para vuelos chárter (como la aerolínea, el paquete de viaje y la fecha).
Compania: Define los atributos y métodos para las compañías aéreas, con métodos sobrescritos para equals y hashCode para evitar duplicados en un conjunto (Set).

Main:
Se crean listas (List) para almacenar objetos de tipo Aeropuerto y Vuelo.
Se crea un conjunto (Set) para almacenar objetos de tipo Compania para garantizar la unicidad.
Instanciación Directa de Objetos:
Se instancian objetos Aeropuerto con datos específicos y se añaden a la lista de aeropuertos.
Se instancian objetos VueloRegular y VueloCharter con datos específicos y se añaden a la lista de vuelos.
Las compañías se extraen de los vuelos y se añaden al conjunto de compañías.
Mostrar Vuelos de Salida:
Se itera sobre la lista de aeropuertos.
Para cada aeropuerto, se itera sobre la lista de vuelos.
Se muestran los vuelos cuyo origen coincide con el código del aeropuerto actual.
Mostrar Vuelos de Llegada:
Similar a la visualización de vuelos de salida, pero se filtran los vuelos cuyo destino coincide con el código del aeropuerto actual.
Detalle de Cada Sección
Definición de Clases:

Estas clases encapsulan los datos y comportamientos relacionados con aeropuertos, vuelos y compañías aéreas. La herencia se usa para especializar los tipos de vuelos (regulares y chárter).
Instanciación de Objetos:

Objetos Aeropuerto se crean con su código, nombre, ciudad, país y GMT (zona horaria).
Objetos VueloRegular y VueloCharter se crean con su origen, destino, duración, capacidad de pasajeros, aerolínea y otros atributos específicos.
Compañías aéreas se extraen de los vuelos y se añaden a un conjunto para evitar duplicados.
Mostrar Vuelos de Salida y Llegada:

Para cada aeropuerto, se muestra una lista de vuelos que salen de ese aeropuerto.
Para cada aeropuerto, se muestra una lista de vuelos que llegan a ese aeropuerto.
Esto se logra mediante la iteración y la comparación de códigos de aeropuerto con los atributos de origen y destino de los vuelos.