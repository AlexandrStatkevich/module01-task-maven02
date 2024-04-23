package alst;

import by.alst.GuruService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/guru")
public class GuruServlet extends HttpServlet {
    private final GuruService guruService = new GuruService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        var guru = guruService.getUser(1L);
        resp.setContentType("text/html");
        var writer = resp.getWriter();
        writer.write("<html><body>");
        writer.write("<h1> Guru: </h1>");
        writer.write("<h1>" + guru.get().getName() + "</h1>");
        writer.println("<br/>");
        writer.println("<br/>");

        writer.println("<h3>Вернуться на стартовую страницу</h3>");
        writer.println("<h3><a href=\"index.html\">Back</a></h3>");
        writer.write("</body></html>");
        writer.close();
    }
}
