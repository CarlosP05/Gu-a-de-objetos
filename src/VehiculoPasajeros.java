public class VehiculoPasajeros extends Vehiculos{
    private int numPasajeros;
    
    public VehiculoPasajeros(String marca, String modelo, int año, int kilometraje, int numPasajeros){
        super(marca, modelo, año, kilometraje);
        this.numPasajeros = numPasajeros;
    }

    public int getNumpasajeros(){
        return numPasajeros;
    }
    public void setNumpasajeros(int numPasajeros){
        this.numPasajeros = numPasajeros;
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de pasajeros: "+ numPasajeros);
    }

}
