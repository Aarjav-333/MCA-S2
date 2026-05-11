import java.util.*;
import java.util.function.*;
class test {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        Function<String, Integer> length = s -> s.length();
        Supplier<Integer> supplier = () -> (int)Math.floor(Math.random() * 10);
        System.out.println(supplier.get());
        System.out.println(length.apply("Aarjav"));
    }
}