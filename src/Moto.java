public class Moto extends Vehiculos{
    protected Moto() {
        super(110);
    }

    public Moto(int tarifaPorHora) {
        super(tarifaPorHora);
    }

    @Override
    public String toString() {
        return "Moto{" +
                "tarifaPorHora=" + tarifaPorHora +
                '}';
    }

}
