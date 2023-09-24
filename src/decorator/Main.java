package decorator;

public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, world.");
        Display b2 = new WrapBorder(b1, '#');
        Display b3 = new UnderBorder(b1, '-');
        b1.show();
        b2.show();
        b3.show();
        Display b4 = new WrapBorder(
            new UnderBorder(
                new WrapBorder(
                    new UnderBorder(
                        new StringDisplay("Hello, world."),
                        '-'
                    ),
                    '='
                ),
                '+'
            ),
            '*'
        );
        b4.show();
    }
}
