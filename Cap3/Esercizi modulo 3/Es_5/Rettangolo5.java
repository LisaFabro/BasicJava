package Es_5;

public class Rettangolo5 implements Forma5 {
    public static int base = 4;
    public static int altezza = 8;

    @Override
    public int calcolaArea() {
        return base*altezza;
    }
}
