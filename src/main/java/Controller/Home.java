package Controller;

import Model.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(value = "/get-all-books")
public class Home extends HttpServlet {
    private BookDAO bookDAO = new BookDAO();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("name-search");
        List result = new ArrayList();
        if (name != null) {
            System.out.println(name);
            result = bookDAO.getBooksFromName(name);
        }
        else {
            result = bookDAO.getAllBooks();
        }
        request.setAttribute("bookList", result);
    }
}
