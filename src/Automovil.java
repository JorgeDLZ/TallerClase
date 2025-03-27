public class Automovil extends Vehiculos{
    protected Automovil() {
        super(160);
    }

    public Automovil(int tarifaPorHora) {
        super(tarifaPorHora);
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "tarifaPorHora=" + tarifaPorHora +
                '}';
    }

}
