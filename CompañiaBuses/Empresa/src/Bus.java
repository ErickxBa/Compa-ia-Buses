public class Bus {
    private int capacidad = 4;
    private int edadUsuarios;
    private Ruta ruta;
    private int capacidadActual ; ;

    public Bus(Ruta ruta){
        this.capacidad = capacidad;
        this.ruta = ruta;
        this.edadUsuarios = edadUsuarios;
        this.capacidadActual = capacidadActual;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public boolean tieneTarifaPreferencialElUsuario(int edadUsuarios){
        return esElUsuarioMayorDeEdad(edadUsuarios);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public boolean esElUsuarioMayorDeEdad(int edadUsuarios){
        return edadUsuarios < 6 || edadUsuarios > 65;
    }

    public boolean hayCapacidadDeAsientos(){
        if(capacidadEsMayorA50()){
            return true;
        }
        capacidadActual++;
        return false;
    }

    public boolean capacidadEsMayorA50(){
        return capacidadActual>capacidad;
    }


}
