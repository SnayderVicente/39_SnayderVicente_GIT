package S11_39_E01;

public class hija3_39 extends persona_39 {
    private String peliculaFavorita;
    private boolean leGustaBailar;
    private int cantidadDeAmigos;

    public hija3_39(String nombre, int edad) {
        super(nombre, edad);
    }
    
    public hija3_39(String nombre, int edad, String peliculaFavorita, boolean leGustaBailar, int cantidadDeAmigos) {
        super(nombre, edad);
        this.peliculaFavorita = peliculaFavorita;
        this.leGustaBailar = leGustaBailar;
        this.cantidadDeAmigos = cantidadDeAmigos;
    }
    
    public String getPeliculaFavorita() {
        return peliculaFavorita;
    }
    
    public boolean leGustaBailar() {
        return leGustaBailar;
    }

    String getCantidadDeAmigos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}