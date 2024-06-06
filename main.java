import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        List<Aeropuerto> aeropuertos = new ArrayList<>();
        List<Vuelo> vuelos = new ArrayList<>();
        List<Compania> companias = new ArrayList<>();

        // Cargando aeropuertos
        aeropuertos.add(new Aeropuerto("BCN01", "Barcelona - El Prat", "Barcelona", "España", 1));
        aeropuertos.add(new Aeropuerto("MAD01", "Madrid - Barajas", "Madrid", "España", 1));
        aeropuertos.add(new Aeropuerto("PAR01", "Paris - Orly", "Paris", "Francia", 1));
        aeropuertos.add(new Aeropuerto("LON01", "London - Heathrow", "Londres", "Gran Bretaña", 0));
        aeropuertos.add(new Aeropuerto("SPA01", "Sao Paulo - Guarulhos", "Sao Paulo", "Brasil", -3));

        // Cargando vuelos regulares
        vuelos.add(new VueloRegular("BCN01", "MAD01", 150, "01:00", "Iberia", "Airbus", "L-15:00 X-15:00 V-15:00 D-15:00"));
        vuelos.add(new VueloRegular("MAD01", "BCN01", 150, "01:00", "Iberia", "Airbus", "L-18:00 J-20:00 S-20:00"));
        vuelos.add(new VueloRegular("BCN01", "LON01", 180, "01:05", "British Air", "Boeing", "L-10:00 J-10:00"));
        vuelos.add(new VueloRegular("LON01", "BCN01", 180, "01:05", "British Air", "Boeing", "L-15:00 J-15:00"));
        vuelos.add(new VueloRegular("BCN01", "LON01", 120, "01:10", "Ryan Air", "Airbus", "L-10:00 J-10:00"));
        vuelos.add(new VueloRegular("LON01", "BCN01", 120, "01:10", "Ryan Air", "Airbus", "J-15:10 J-15:10"));
        vuelos.add(new VueloRegular("LON01", "SPA01", 200, "07:00", "British Air", "Boeing", "X-09:45 J-09:45 S-09:45"));
        vuelos.add(new VueloRegular("SPA01", "MAD01", 200, "07:00", "British Air", "Boeing", "X-20:25 J-20:25 S-20:25"));

        // Cargando vuelos charter
        vuelos.add(new VueloCharter("BCN01", "MAD01", 150, "01:00", "Spanair", "Airbus", "Viajes Condor", "2009-01-15 20:30"));
        vuelos.add(new VueloCharter("MAD01", "BCN01", 150, "01:00", "Iberia", "Airbus", "Viajes Condor", "2009-01-22 20:30"));
        vuelos.add(new VueloCharter("BCN01", "LON01", 180, "01:00", "British Air", "Boeing", "Viaje Ilusion", "2009-02-22 20:30"));
        vuelos.add(new VueloCharter("LON01", "BCN01", 180, "01:00", "British Air", "Boeing", "Viaje Ilusion", "2009-03-05 15:19"));
        vuelos.add(new VueloCharter("BCN01", "LON01", 120, "01:00", "Ryan Air", "Airbus", "TravelPlan", "2009-01-25 15:18"));
        vuelos.add(new VueloCharter("SPA01", "MAD01", 120, "01:00", "Ryan Air", "Airbus", "TravelPlan", "2009-01-31 22:20"));

        // Cargando compañías
        companias.add(new Compania("Iberia"));
        companias.add(new Compania("British Air"));
        companias.add(new Compania("Ryan Air"));
        companias.add(new Compania("Spanair"));
        companias.add(new Compania("Viajes Condor"));
        companias.add(new Compania("Viaje Ilusion"));
        companias.add(new Compania("TravelPlan"));

        for (Aeropuerto aeropuerto : aeropuertos) {
            System.out.println("\nVuelos de salida desde " + aeropuerto.nombre + ":");
            for (Vuelo vuelo : vuelos) {
                if (vuelo.origen.equals(aeropuerto.codigo)) {
                    System.out.println("  Vuelo a " + vuelo.destino + " con " + vuelo.aerolinea + " (Tipo: " + vuelo.getClass().getSimpleName() + ")");
                    System.out.println("    Plazas: " + vuelo.plazas);
                    System.out.println("    Duración: " + vuelo.duracion);
                    System.out.println("    Tipo de avión: " + vuelo.tipoAvion);
                    if (vuelo instanceof VueloRegular) {
                        VueloRegular vr = (VueloRegular) vuelo;
                        System.out.println("    Días y horarios: " + vr.diasHorarios);
                    } else if (vuelo instanceof VueloCharter) {
                        VueloCharter vc = (VueloCharter) vuelo;
                        System.out.println("    Información adicional: " + vc.infoAdicional);
                        System.out.println("    Fecha y hora: " + vc.fechaHora);
                    }
                }
            }
        }

        for (Aeropuerto aeropuerto : aeropuertos) {
            System.out.println("\nVuelos de llegada a " + aeropuerto.nombre + ":");
            for (Vuelo vuelo : vuelos) {
                if (vuelo.destino.equals(aeropuerto.codigo)) {
                    System.out.println("  Vuelo desde " + vuelo.origen + " con " + vuelo.aerolinea + " (Tipo: " + vuelo.getClass().getSimpleName() + ")");
                    System.out.println("    Plazas: " + vuelo.plazas);
                    System.out.println("    Duración: " + vuelo.duracion);
                    System.out.println("    Tipo de avión: " + vuelo.tipoAvion);
                    if (vuelo instanceof VueloRegular) {
                        VueloRegular vr = (VueloRegular) vuelo;
                        System.out.println("    Días y horarios: " + vr.diasHorarios);
                    } else if (vuelo instanceof VueloCharter) {
                        VueloCharter vc = (VueloCharter) vuelo;
                        System.out.println("    Información adicional: " + vc.infoAdicional);
                        System.out.println("    Fecha y hora: " + vc.fechaHora);
                    }
                }
            }
        }
    }
}