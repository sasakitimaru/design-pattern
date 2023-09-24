package Composite;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Comment> comments = new ArrayList<>();
        Comment c1 = new Comment("こんにちは");
        c1.add(new Reply("はじめまして"));
        c1.add(new Reply("こんにちは！"));
        Comment c1_1 = new Comment("名前を教えてください");
        c1.add(c1_1);
        c1_1.add(new Reply("私は栗松です"));
        Comment c2 = new Comment("こんばんは");
        c2.add(new Reply("こんばんは！"));
        c2.add(new Reply("おやすみなさい"));
        comments.add(c1);
        comments.add(c2);
        for (Comment c : comments) {
            c.getComment();
        }
    }
}
