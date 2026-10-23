public enum TarifaBase {
    TARIFA_BASE(10000.0),
    ;

    private double tarifaInicial;

    TarifaBase(double tarifaInicial) {
        this.tarifaInicial = tarifaInicial;
    }

    public double getTarifaInicial() {
        return tarifaInicial;
    }
}
