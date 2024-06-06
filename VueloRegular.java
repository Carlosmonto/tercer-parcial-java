class VueloRegular extends Vuelo {
    String diasHorarios;

    public VueloRegular(String origen, String destino, int plazas, String duracion, String aerolinea, String tipoAvion, String diasHorarios) {
        super(origen, destino, plazas, duracion, aerolinea, tipoAvion, "-");
        this.diasHorarios = diasHorarios;
    }
}