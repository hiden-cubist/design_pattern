package builder.builder2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder implements Builder {
    private String fileName;
    private PrintWriter printWriter;

    @Override
    public void makeTitle(String title) {
        fileName = "src/builder/builder1/" + title + ".html";

        try {
            printWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        printWriter.println("<html><head><title>" + title + "</title></head><body>");
        printWriter.println("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String string) {
        printWriter.println("<p>" + string + "</p>");
    }

    @Override
    public void makeItems(String[] items) {
        printWriter.println("<ul>");
        for (String item: items) {
            printWriter.println("<li>" + item + "</li>");
        }
        printWriter.println("</ul>");
    }

    @Override
    public void close() {
        printWriter.println("</body></html>");
        printWriter.close();
    }

    String getResult() {
        return fileName;
    }
}
