package controller;

import utils.DBUtils;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthControllerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        if (req.getSession().getAttribute("email") != null) {
            System.out.println("Authorized");
        } else {
            System.out.println("Unauthorized");
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        try {
            if (email != null && password.length() != 0){
                ResultSet result = DBUtils.query("SELECT * FROM users where email = '" + email + "' and password = '" + password +"';");
                if(result != null){
                    while (result.next()) {
                        HttpSession session = req.getSession();
                        session.setAttribute("email", email);
                    }
                } else {
                    System.out.println("user not exists");
                }
            } else {
                System.out.println("Invalid username password");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
