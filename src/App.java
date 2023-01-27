import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
    List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
    Stream<Integer> numerosStream = numeros.stream();

    int Suma = numerosStream
        .filter(n -> n % 2 ==1 ) // 1,3,5,7,9
        .map(n -> n*n) // 1, 9,25,49,81
        .reduce(0,Integer::sum ); // suma todos los numeros

        System.out.println("Suma de los numeros impares es = " + Suma);

    }
}
