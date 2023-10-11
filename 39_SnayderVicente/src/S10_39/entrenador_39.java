package S10_39;

/**
 *
 * @author joseLevanoArbizu
 */
public class entrenador_39 extends seleccionFutbol_39{

    public entrenador_39(String idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }
    
    

//atributos
    private final String idFederacion;

//metodos
    public void dirigirPartido() {
    }

    public void dirigirEntrenamiento() {
        System.out.println(nombre + " es el entrenador");
    }

}