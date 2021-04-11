package Controller;

import Model.UserDAO;
import Model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginController", value = "/login")
public class LoginController extends HttpServlet {
    private UserDAO userDAO = new UserDAO();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = userDAO.getUser(request.getParameter("username"), request.getParameter("password"));

        if (user != null) {
            response.sendRedirect("view/home.jsp");
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("view/login.jsp");
            dispatcher.forward(request, response);
        }
    }
}


