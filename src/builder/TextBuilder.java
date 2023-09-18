package builder;

public class TextBuilder extends Builder {
    private final StringBuilder sb = new StringBuilder();
    @Override
    public void makeTitle(String title) {
        sb.append("==============================\n");
        sb.append("[" + title + "]\n");
        sb.append("\n");
    }
    @Override
    public void makeString(String str) {
        sb.append("■" + str + "\n");
        sb.append("\n");
    }
    @Override
    public void makeItems(String[] items) {
        for (String item : items) {
            sb.append("　・" + item + "\n");
        }
        sb.append("\n");
    }
    @Override
    public void close() {
        sb.append("==============================\n");
    }
    public String getResult() {
        return sb.toString();
    }
}
