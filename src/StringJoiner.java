public class StringJoiner implements Joiner{

    @Override
    public String join(Object string1, Object string2) {
        return  (string1+" "+string2);
    }


}
