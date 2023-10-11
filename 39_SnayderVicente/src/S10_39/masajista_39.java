package S10_39;

/**
 *
 * @author joseLevanoArbizu
 */
public class masajista_39 extends seleccionFutbol_39{

    public masajista_39(String titulacion, int aniosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

//atributos
    private final String titulacion;
    private final int aniosExperiencia;

//metodos
    public void darMasaje() {
        System.out.println(nombre + " da masajes");
    }

}