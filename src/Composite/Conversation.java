package Composite;

import java.util.Arrays;

public abstract class Conversation {
    protected int depth = 0;
    protected String getIndent() {
        char[] chars = new char[depth * 4];
        Arrays.fill(chars, ' ');
        return new String(chars);
    }
    public abstract void getComment();
}
