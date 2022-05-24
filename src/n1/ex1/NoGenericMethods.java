//Crea una classe anomenada NoGenericMethods que emmagatzemi tres objectes del mateix tipus, juntament amb els mètodes per a emmagatzemar i extreure aquests objectes i un constructor per a inicialitzar els tres. Comprova que els arguments es poden posar en qualsevol posició en la crida al constructor.

package n1.ex1;

public class NoGenericMethods<T, S, M>{
    private T firstParam;
    private S secondParam;
    private M thirdParam;

    public NoGenericMethods(T firstParam, S secondParam, M thirdParam) {
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
