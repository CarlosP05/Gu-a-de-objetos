public class VehiculoCarga extends Vehiculos{
    private int capacidadCarga;

    public VehiculoCarga (String marca, String modelo, int año, int kilometraje, int capacidadCarga){
        super(marca, modelo, año, kilometraje);
        this.capacidadCarga = capacidadCarga;
    }
    public int getcapacidadCarga(){
        return capacidadCarga;
    }
    public void SetcapacidadCarga(int capacidadCarga){
        this.capacidadCarga = capacidadCarga;
    }
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Capacidad de carga: "+ capacidadCarga + " kg");
    }

}
