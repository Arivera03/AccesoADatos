package JavasRandom;

import java.io.PrintWriter;

public class htmlenjava2 {
    public static void main(String[] args) {
        try{
            PrintWriter writer = new PrintWriter("mipagina.html", "UTF-8");
                writer.println("<html>");
                writer.println("<head>");
                writer.println("<title>Mi sitio web</title>");
                writer.println("</head>");
                writer.println("<body>");
                writer.println("<h1>Bienvenidos a mi sitio web</h1>");
                writer.println("<p>Este es un ejemplo de como crear una página html en java</p>");
                writer.println("<ul>");
                writer.println("<p>· Elemento 1</p>");
                writer.println("<p>· Elemento 2</p>");
                writer.println("<p>· Elemento 3</p>");
                writer.println("</ul>");
                writer.println("</body>");
                writer.println("</html>");
                writer.close();

        } catch (Exception e){
            System.out.println("No va");
        }
    }
}
