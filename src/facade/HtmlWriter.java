package facade;

import java.io.Writer;

public class HtmlWriter {
    private Writer writer;
    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }
    public void title(String title) {
        String html = """
        <html>
            <head>
                <title>%s</title>
            </head>
            <body>
                <h1>%s</h1>
        """;
        try {
            writer.write(String.format(html, title, title));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void paragraph(String msg) {
        String html = """
        <p>%s</p>
        """;
        try {
            writer.write(String.format(html, msg));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void mailto(String mailaddr, String username) {
        String html = """
        <a href="mailto:%s">%s</a>
        """;
        try {
            writer.write(String.format(html, mailaddr, username));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close() {
        String html = """
            </body>
        </html>
        """;
        try {
            writer.write(html);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
