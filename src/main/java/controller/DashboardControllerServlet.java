package controller;

import utils.DBUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DashboardControllerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("profile page");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        String gender = req.getParameter("gender");
        String age = req.getParameter("age");
        String country = req.getParameter("country");

        DBUtils.query("UPDATE users SET firstname = '" + firstname + "', lastname = '" + lastname + "', gender = '" + gender
                + "', age = '" + age + "', country = '"
                + country + "' WHERE email = '" + req.getSession().getAttribute("email") + "';");
    }
}
