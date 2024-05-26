public class App {
    public static void main(String[] args) throws Exception {
        Auto auto = new Auto("Toyota", "Corola", 2020, 15000, 5, "Gasolina");

        Camion camion = new Camion("Volvo", "FH", 2019, 75000, 200000, 4);
        System.out.println("informacion del Auto");
        auto.mostrarInfo();
        System.out.println();
        System.out.println("dandole mantenimiento a mi vehiculo");
       auto.mantenimiento();
       auto.calcularCostoMantenimiento(0.5, 300);
        System.out.println();
        System.out.println("informacion del camion");
        camion.mostrarInfo();
        System.out.println();
        System.out.println("dandole mantenimiento a mi Camion");
       camion.mantenimiento();

       camion.calcularCostoMantenimiento(1.5, 2000);
    }
}
