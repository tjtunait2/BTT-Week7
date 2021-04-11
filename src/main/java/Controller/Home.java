package Controller;

import Model.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet(value = "/get-books-from-name")
public class Home extends HttpServlet {
    private BookDAO bookDAO = new BookDAO();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        List<Book> listBook = bookDAO.getAllBooks();
        request.setAttribute("listBook", listBook);
    }
}
