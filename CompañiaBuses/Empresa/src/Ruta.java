public enum Ruta {
    QUITO_MANTA(18),
    QUITO_GUAYAQUIL(20),
    QUITO_SANTADOMINGO(15);

    private int precio;
    Ruta(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }
}
