package builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class HTMLBuilder extends Builder {
    private String filename = "untitled.html";
    private final StringBuilder sb = new StringBuilder();
    @Override
    public void makeTitle(String title) {
        this.filename = title + ".html";
        sb.append("<!DOCTYPE html>");
        sb.append("<html><head><title>" + title + "</title></head><body>");
        sb.append("<h1>" + title + "</h1>");
    }
    @Override
    public void makeString(String str) {
        sb.append("<p>" + str + "</p>");
    }
    @Override
    public void makeItems(String[] items) {
        sb.append("<ul>");
        for (String item : items) {
            sb.append("<li>" + item + "</li>");
        }
        sb.append("</ul>");
    }
    @Override
    public void close() {
        sb.append("<hr/></body></html>");
        try {
            Writer writer = new FileWriter(filename);
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getResult() {
        return sb.toString();
    }
}
