class Estacionamiento {
    protected String id;
    protected int totalVehiculos;
    protected int totalHoras;
    protected int ingresosTotales;

    public Estacionamiento(String id) {
    }

    public Estacionamiento(String id, int totalVehiculos, int totalHoras, int ingresosTotales) {
        this.id = id;
        this.totalVehiculos = totalVehiculos;
        this.totalHoras = totalHoras;
        this.ingresosTotales = ingresosTotales;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTotalVehiculos() {
        return totalVehiculos;
    }

    public void setTotalVehiculos(int totalVehiculos) {
        this.totalVehiculos = totalVehiculos;
    }

    public int getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }

    public int getIngresosTotales() {
        return ingresosTotales;
    }

    public void setIngresosTotales(int ingresosTotales) {
        this.ingresosTotales = ingresosTotales;
    }

    @Override
    public String toString() {
        return "Estacionamiento{" +
                "id='" + id + '\'' +
                ", totalVehiculos=" + totalVehiculos +
                ", totalHoras=" + totalHoras +
                ", ingresosTotales=" + ingresosTotales +
                '}';
    }

    public void registrarVehiculo(Vehiculos vehiculo, int horas) {
        totalVehiculos++;
        totalHoras += horas;
        ingresosTotales += vehiculo.calcularTarifa(horas);

    }

    public void mostrarInfo() {
        System.out.println("Estacionamiento: " + id);
        System.out.println("Total de vehículos: " + totalVehiculos);
        System.out.println("Tiempo total de uso: " + totalHoras + " horas");
        System.out.println("Ingresos totales: $" + ingresosTotales);
    }
    public void reiniciar() {
        totalVehiculos = 0;
        totalHoras = 0;
        ingresosTotales = 0;
    }

}