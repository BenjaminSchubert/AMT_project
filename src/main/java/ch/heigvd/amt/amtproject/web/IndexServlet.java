package ch.heigvd.amt.amtproject.web;

import ch.heigvd.amt.amtproject.util.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "IndexServlet", urlPatterns = {""})
public class IndexServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher(Paths.JSP_FOLDER + "index.jsp").forward(request, response);
    }
}
