package decorator;

public class UnderBorder extends Border {
    private char borderChar;

    public UnderBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return 1 + display.getRows();
    }

    @Override
    public String getRowText(int row) {
        if (row == display.getRows()) {
            return makeLine(borderChar, display.getColumns());
        } else if (display.getRows() == 1) {
            return display.getRowText(row);
        } else {
            return display.getRowText(row);
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
