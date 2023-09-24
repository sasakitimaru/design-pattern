package Composite;

public class Reply extends Conversation {
    private String comment;
    public Reply(String comment) {
        this.comment = comment;
    }
    @Override
    public void getComment() {
        System.out.println(this.getIndent() + "|-" + this.comment);
    }
}
