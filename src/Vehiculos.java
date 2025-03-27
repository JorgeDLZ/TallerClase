public class Vehiculos {
    protected int tarifaPorHora;

    public Vehiculos() {
    }

    public Vehiculos(int tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    public int getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(int tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public String toString() {
        return "Vehiculos{" +
                "tarifaPorHora=" + tarifaPorHora +
                '}';
    }
    public int calcularTarifa(int horas) {
        return tarifaPorHora * horas;
    }
}
