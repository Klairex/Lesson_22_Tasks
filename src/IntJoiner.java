public class IntJoiner implements Joiner<Integer> {

    @Override
    public Integer join(Integer string1, Integer string2) {
        int a  = (int)string1 + (int)string2;
        return a;
    }
}
