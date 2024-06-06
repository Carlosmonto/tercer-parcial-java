class Vuelo {
    String origen;
    String destino;
    int plazas;
    String duracion;
    String aerolinea;
    String tipoAvion;
    String infoAdicional;

    public Vuelo(String origen, String destino, int plazas, String duracion, String aerolinea, String tipoAvion, String infoAdicional) {
        this.origen = origen;
        this.destino = destino;
        this.plazas = plazas;
        this.duracion = duracion;
        this.aerolinea = aerolinea;
        this.tipoAvion = tipoAvion;
        this.infoAdicional = infoAdicional;
    }
}