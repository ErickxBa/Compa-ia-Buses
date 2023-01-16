public class Empresa {
    private String nombre ;
    private Bus[] bus;
    private int ingresos;
    private final int tarifaNormal = 12;
    private Bus busNum1;

    public Empresa(String nombre){
        bus = new Bus[10];
        this.nombre = nombre;
        bus[0] = new Bus(Ruta.QUITO_MANTA);
        bus[1] = new Bus(Ruta.QUITO_GUAYAQUIL);
        bus[2] = new Bus(Ruta.QUITO_SANTADOMINGO);

    }
    public void venderBoleto(String nombre, int edadUsuario, Ruta ruta){
        if(obtenerBus(ruta) == null){
            return;
        }
        if(obtenerBus(ruta).hayCapacidadDeAsientos()){
            return;
        }
        
        if(obtenerBus(ruta).tieneTarifaPreferencialElUsuario(edadUsuario)){
            System.out.println(nombre+ " Se ha registrado el boleto correctamente, su numero de boleto es " + obtenerBus(ruta).getCapacidadActual());
        }
        else{
            ingresos += ruta.getPrecio();
            System.out.println(nombre +" Se ha registrado el boleto correctamente, su numero de boleto es " + obtenerBus(ruta).getCapacidadActual());
        }
    }

    public void imprimirReporte(){
        System.out.println("Las ganancias totales son: " + ingresos);
    }

    public Bus obtenerBus(Ruta ruta){
        int i = 0;
        do{
            busNum1 = this.bus[i++];

        }while(busNum1.getRuta() != ruta || busNum1.getCapacidadActual() > busNum1.getCapacidad());
        return busNum1;
    }
    public String getNombre() {
        return nombre;
    }
}
