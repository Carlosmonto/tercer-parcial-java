class VueloCharter extends Vuelo {
    String fechaHora;

    public VueloCharter(String origen, String destino, int plazas, String duracion, String aerolinea, String tipoAvion, String infoAdicional, String fechaHora) {
        super(origen, destino, plazas, duracion, aerolinea, tipoAvion, infoAdicional);
        this.fechaHora = fechaHora;
    }
}