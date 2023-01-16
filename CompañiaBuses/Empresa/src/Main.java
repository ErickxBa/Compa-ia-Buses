public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("\n|||||||----------------------FLOTA ECUADOR-------------------------||||||\n");
        System.out.println(""+empresa.getNombre());
        empresa.venderBoleto("Pablo",9, Ruta.QUITO_MANTA);
        empresa.venderBoleto("Josias",13, Ruta.QUITO_MANTA);
        empresa.venderBoleto("Luisito",4, Ruta.QUITO_SANTADOMINGO);
        empresa.venderBoleto("David",20, Ruta.QUITO_GUAYAQUIL);
        empresa.venderBoleto("Sebastián",65, Ruta.QUITO_GUAYAQUIL);

        empresa.imprimirReporte();
    }
}