package n1.ex1;

public class main {
    public static void main(String[] args) {
        NoGenericMethods<String, Double, Integer> firstParam = new NoGenericMethods<String, Double, Integer>("value1", 7.2, 5);
        NoGenericMethods<Double, Integer, String> secondParam = new NoGenericMethods<Double, Integer, String>(1.5, 10, "Hola");
        NoGenericMethods<Integer, String, Double> thirdParam = new NoGenericMethods<Integer, String, Double>(3, "Adeu", 5.2);

        System.out.println("Els valors de la clase generica cambiant l'ordre ");
        System.out.println(firstParam.toString());
        System.out.println(secondParam.toString());
        System.out.println(thirdParam.toString());
    }
}
