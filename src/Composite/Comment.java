package Composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Comment extends Conversation {
    private final String comment;
    private final List<Conversation> conversations = new ArrayList<>();
    public Comment(String comment) {
        this.comment = comment;
    }

    public void add(Conversation cv) {
        cv.depth = this.depth + 1;
        this.conversations.add(cv);
    }
    @Override
    public void getComment() {
        if (this.depth == 0) System.out.println(this.comment);
        else System.out.println(this.getIndent() + "|-" + this.comment);
        for (Conversation cv : this.conversations) {
            cv.getComment();
        }
    }
}
