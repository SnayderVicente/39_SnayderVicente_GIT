package S10_39;

/**
 *
 * @author joseLevanoArbizu
 */
public class Main_S10_39 {

    public static void main(String[] args) {
        
        
        futbolista_39 futbolista1 = new futbolista_39(9, "arquero", 1, "paolo", "guerrero", 42);
        masajista_39 masajista1  = new masajista_39("si", 15, 2, "raul", "Martines", 50);
        entrenador_39 RicardoGareca = new entrenador_39("uno", 1, "Ricardo", "Gareca", 65);
        
        //ENTRESNAR
        futbolista1.concentrarse();
        futbolista1.entrenar();
        
        masajista1.darMasaje();
        masajista1.concentrarse();
        
        
                
        
        
    }

}