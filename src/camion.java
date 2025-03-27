class Camion extends Vehiculos {
    protected Camion() {
        super(250);
    }

    public Camion(int tarifaPorHora) {
        super(tarifaPorHora);
    }

    @Override
    public String toString() {
        return "Camion{" +
                "tarifaPorHora=" + tarifaPorHora +
                '}';
    }

}