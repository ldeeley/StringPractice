public class StringToIntLongFloatOrDouble {

    private static final String TO_INT = "453";
    private static final String TO_LONG = "45234223233";
    private static final String TO_FLOAT = "45.823F";
    private static final String TO_DOUBLE = "13.83423D";

    public static void main(String[] args) {
        int x = Integer.parseInt(TO_INT);
        long l = Long.parseLong(TO_LONG);
        float f = Float.parseFloat(TO_FLOAT);
        double d = Double.parseDouble(TO_DOUBLE);

        Integer x1 = Integer.valueOf(TO_INT);
    }

}
