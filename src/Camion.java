public class Camion extends VehiculoCarga {
    private int numEjes;

    public Camion (String marca, String modelo, int año, int kilometraje, int capacidadCarga, int numEjes){
        super(marca, modelo, año, kilometraje, capacidadCarga);
        this.numEjes = numEjes;
    }
    public int getnumEjes(){
        return numEjes;
    }
    public void setnumEjes(int numEjes){
        this.numEjes = numEjes;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de Ejes: "+ numEjes);
    }
    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento específico para el Camion...");
        mantenimiento();
        System.out.println("Revisar suspensión y sistema de carga del camion.");
        System.out.println("Mantenimiento del Camion completado.");
    }
    public double calcularCostoMantenimiento(double costoPorKm, int kilometrosRecorridos) {
        double costoTotal = costoPorKm * kilometrosRecorridos;
        System.out.println("El costo total del mantenimiento es: $" + costoTotal);
        return costoTotal;
    }
}
