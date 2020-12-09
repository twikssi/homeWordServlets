package by.twikss.myservlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class formreg extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher view = req.getRequestDispatcher("/home.jsp");
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");

        if (name != null && password != null){
            if (name.equals("admin") && password.equals("123")) {
                HttpSession session = req.getSession();
                session.setAttribute("name", "admin");
                session.setAttribute("password", "123");
//                RequestDispatcher view = req.getRequestDispatcher("/page");
//                view.forward(req, resp);
                resp.sendRedirect("/page");
                return;
            } else {
                RequestDispatcher view = req.getRequestDispatcher("/home.jsp");
                view.forward(req, resp);
            }
        } else {
            RequestDispatcher view = req.getRequestDispatcher("/home.jsp");
            view.forward(req, resp);
        }




    }


}
