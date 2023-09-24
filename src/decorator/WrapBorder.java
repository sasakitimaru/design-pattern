package decorator;

public class WrapBorder extends Border {
    private char borderChar;
    public WrapBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }
    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }
    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }
    @Override
    public String getRowText(int row) {
        if (row == 0 || row == display.getRows() + 1) {
            return makeLine(borderChar, display.getColumns() + 2);
        } else {
            return borderChar + display.getRowText(row - 1) + borderChar;
        }
    }
    private String makeLine(char ch, int count) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
