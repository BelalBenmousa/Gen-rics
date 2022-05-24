package n1.ex2;
//Crea una classe anomenada Persona amb els atributs nom, cognom i edat. Després crea una classe anomenada GenericMethods amb un mètode genèric que accepti tres arguments de tipus genèric. Aquest mètode només ha d’imprimir per pantalla els arguments que ha rebut. Al main() de la classe principal, crida el mètode genèric amb diferents tipus de paràmetres.
//
//        Exemple: un objecte de la classe Persona, un String i un tipus primitiu.
//
//        D’aquesta manera has comprovat que se li pot passar qualsevol tipus de paràmetre i en qualsevol ordre
public class GenericMethods<T, S, M>{
    private T firstParam;
    private S secondParam;
    private M thirdParam;

    public GenericMethods(T firstParam, S secondParam, M thirdParam) {
        this.firstParam = firstParam;
        this.secondParam = secondParam;
        this.thirdParam = thirdParam;
    }

    public T getFirstParam() {
        return firstParam;
    }

    public void setFirstParam(T firstParam) {
        this.firstParam = firstParam;
    }

    public S getSecondParam() {
        return secondParam;
    }

    public void setSecondParam(S secondParam) {
        this.secondParam = secondParam;
    }

    public M getThirdParam() {
        return thirdParam;
    }

    public void setThirdParam(M thirdParam) {
        this.thirdParam = thirdParam;
    }

    @Override
    public String toString() {
        return "NoGenericMethods{" +
                "firstParam=" + firstParam +
                ", secondParam=" + secondParam +
                ", thirdParam=" + thirdParam +
                '}';
    }
}