public class Vehiculos {
    private String marca;
    private String modelo;
    private int año;
    private int kilometraje;

    private boolean aceiteBueno;
    private boolean frenosBuenos;
    private boolean neumaticosBuenos;
    private int nivelGasolina;
    // el constructor debe tener el mismo 
    public Vehiculos (String marca, String modelo, int año, int kilometraje){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.kilometraje = kilometraje;
        this.aceiteBueno = true;
        this.frenosBuenos = true;
        this.neumaticosBuenos = true;
        this.nivelGasolina = 100;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getAño(){
        return año;
    }
    public void setAño(int año){
        this.año = año;
    }

    public int getKilometraje(){
        return kilometraje;
    }
    public void setKilometraje(int kilometraje){
        this.kilometraje = kilometraje;
    }
    public void mantenimiento() {
        System.out.println("Iniciando mantenimiento del vehículo...");

        // Verificar el aceite
        if (!aceiteBueno) {
            System.out.println("El aceite está sucio. Cambiando aceite...");
            aceiteBueno = true;
        } else {
            System.out.println("El aceite está en buen estado.");
        }

        // Revisar los neumáticos
        if (!neumaticosBuenos) {
            System.out.println("Los neumáticos están desgastados. Reemplazando neumáticos...");
            neumaticosBuenos = true;
        } else {
            System.out.println("Los neumáticos están en buen estado.");
        }

        // Comprobar los frenos
        if (!frenosBuenos) {
            System.out.println("Los frenos están desgastados. Reemplazando frenos...");
            frenosBuenos = true;
        } else {
            System.out.println("Los frenos están en buen estado.");
        }

        // Llenar el tanque de gasolina
        if (nivelGasolina < 100) {
            System.out.println("El tanque de gasolina está parcialmente vacío. Llenando el tanque...");
            nivelGasolina = 100;
        } else {
            System.out.println("El tanque de gasolina está lleno.");
        }

        System.out.println("Mantenimiento completado.");
    }

    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento genérico del vehículo...");
        mantenimiento();
        System.out.println("Mantenimiento del vehículo completado.");
    }


    public void mostrarInfo(){
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Año: "+ año);
        System.out.println("Kilometraje: "+ kilometraje);
    }
}
