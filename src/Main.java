import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Joiner<String> joinerString= new StringJoiner();

        String string1 = "Hello";
        String string2 = "World";

        System.out.println(joinerString.join(string1,string2));

        ArrayList<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("world");
        words.add("!");

        Joiner<String> stringJoiner = new StringJoiner();

        System.out.println(Joiners.fold(words, stringJoiner));

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Joiner<Integer> integerJoiner  = new IntJoiner();

        System.out.println(Joiners.fold(numbers,integerJoiner));
    }
}
