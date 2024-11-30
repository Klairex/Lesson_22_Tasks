import java.util.ArrayList;

public class Joiners {
    public static <T> T fold(ArrayList<T> list, Joiner<T> joiner) {
        if (list.isEmpty()) {
            return null;
        }

        T result = list.getFirst();
        for (int i = 1; i < list.size(); i++) {
            result = (T) joiner.join(result, list.get(i));
        }

        return (T) result;



    }
}
