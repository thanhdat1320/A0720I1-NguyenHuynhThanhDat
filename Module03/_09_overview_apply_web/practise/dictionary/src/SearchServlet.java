import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "SearchServlet", urlPatterns = "/search")
public class SearchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "xin chao");
        dictionary.put("what", "cai gi");
        dictionary.put("how", "nhu the nao");
        dictionary.put("when", "khi nao");

        String inputSearch = request.getParameter("search");
        String result = dictionary.get(inputSearch);
        if (result != null) {
            request.setAttribute("result", result);
        } else {
            request.setAttribute("result", "Not Found.");
        }
        request.getRequestDispatcher("jsp/input.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/input.jsp").forward(request, response);
    }
}
