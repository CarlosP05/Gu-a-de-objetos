public class Auto extends VehiculoPasajeros{
    private String TipoCombustible;

    public Auto(String marca, String modelo, int año, int kilometraje, int numPasajeros, String TipoCombustible){
        super(marca, modelo, año, kilometraje, numPasajeros);
        this.TipoCombustible= TipoCombustible;
    }

    public String getTipoCombustible(){
        return TipoCombustible;
    }
    public void setTipoCombustible(String TipoCombustible){
        this.TipoCombustible = TipoCombustible;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo de combustible: "+ TipoCombustible);
    }
    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento específico para el Auto...");
        mantenimiento();
        System.out.println("Limpieza del interior y exterior del auto.");
        System.out.println("Mantenimiento del Auto completado.");
    }
    public double calcularCostoMantenimiento(double costoPorKm, int kilometrosRecorridos) {
        double costoTotal = costoPorKm * kilometrosRecorridos;
        System.out.println("El costo total del mantenimiento es: $" + costoTotal);
        return costoTotal;
    }
}

