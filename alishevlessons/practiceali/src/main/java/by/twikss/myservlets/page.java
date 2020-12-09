package by.twikss.myservlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class page extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String name = (String) req.getAttribute("name");
//
        if (req.getSession().getAttribute("name") != null){
            if (req.getSession().getAttribute("name").equals("admin")){
                req.setAttribute("adminInfo", "I know you, Eddi. You Admin, Eddy, I know you!!!" );
            }
        } else {
            resp.sendRedirect("/home");
        }

//        req.setAttribute("name", name);
//
        RequestDispatcher view = req.getRequestDispatcher("/page.jsp");
        view.forward(req,resp);
//        resp.sendRedirect("/page.jsp");

    }
}
