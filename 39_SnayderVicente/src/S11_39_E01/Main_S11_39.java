/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S11_39_E01;

/**
 *
 * @author Lenovo
 */
public class Main_S11_39 {
    public static void main(String[] args) {
        persona_39 persona = new persona_39("Juan", 30);
        hija1_39 hija1 = new hija1_39("Ana", 20, "Leer", true, 8);
        hija2_39 hija2 = new hija2_39("Sofía", 25, "Natación", 1.75, true);
        hija3_39 hija3 = new hija3_39("María", 18, "Titanic", true, 5);
        
        // Ejemplo de uso de los métodos de cada clase
        System.out.println(persona.getNombre() + " tiene " + persona.getEdad() + " años.");
        System.out.println(hija1.getNombre() + " tiene " + hija1.getEdad() + " años y su hobby es " + hija1.getHobby() + ".");
        System.out.println(hija2.getNombre() + " mide " + hija2.getAltura() + " metros y su deporte favorito es " + hija2.getDeporteFavorito() + ".");
        System.out.println(hija3.getNombre() + " le gusta la película " + hija3.getPeliculaFavorita() + " y tiene " + hija3.getCantidadDeAmigos() + " amigos.");
    }
}

