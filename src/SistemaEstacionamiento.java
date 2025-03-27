import java.util.ArrayList;
public class SistemaEstacionamiento {

    protected ArrayList<Estacionamiento> estacionamientos;

    public SistemaEstacionamiento() {
        this.estacionamientos = estacionamientos;
    }

    public ArrayList<Estacionamiento> getEstacionamientos() {
        return estacionamientos;
    }

    public void setEstacionamientos(ArrayList<Estacionamiento> estacionamientos) {
        this.estacionamientos = estacionamientos;
    }

    @Override
    public String toString() {
        return "SistemaEstacionamiento{" +
                "estacionamientos=" + estacionamientos +
                '}';
    }

    public void agregarEstacionamiento(String id) {
        estacionamientos.add(new Estacionamiento(id));
    }

    public Estacionamiento obtenerEstacionamiento(String id) {
        for (int j = 0; j < estacionamientos.size(); j++) {
            Estacionamiento i = estacionamientos.get(j);
        }
        return null;
    }

    public void mostrarConsolidado() {
        int totalVehiculos = 0;
        int totalHoras = 0;
        int ingresosTotales = 0;

        for (int j = 0; j < estacionamientos.size(); j++) {
            Estacionamiento i = estacionamientos.get(j);
            totalVehiculos += i.getTotalVehiculos();
            totalHoras += i.getTotalHoras();
            ingresosTotales += i.getIngresosTotales();
        }

        System.out.println("Resumen General:");
        System.out.println("Total de vehículos: " + totalVehiculos);
        System.out.println("Tiempo total de uso: " + totalHoras + " horas");
        System.out.println("Ingresos totales: $" + ingresosTotales);
    }


}



