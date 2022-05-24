//Crea una classe anomenada Persona amb els atributs nom, cognom i edat. Després crea una classe anomenada GenericMethods amb un mètode genèric que accepti tres arguments de tipus genèric. Aquest mètode només ha d’imprimir per pantalla els arguments que ha rebut. Al main() de la classe principal, crida el mètode genèric amb diferents tipus de paràmetres.
//
//        Exemple: un objecte de la classe Persona, un String i un tipus primitiu.
//
//        D’aquesta manera has comprovat que se li pot passar qualsevol tipus de paràmetre i en qualsevol ordre.a

package n1.ex2;

import n1.ex1.NoGenericMethods;

public class main {
    public static void main(String[] args) {
        Persona pepe = new Persona("Pepe", "Gomez", 54);
        NoGenericMethods<Persona, Integer, String> firstParam = new NoGenericMethods<Persona, Integer, String>(pepe, 10, "Hola");

        System.out.println("Aquí podem veure que pots pasar el valor que tu vulguis");
        System.out.println(firstParam.toString());
    }
}
