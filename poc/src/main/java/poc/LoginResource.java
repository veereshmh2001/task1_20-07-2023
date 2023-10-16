package poc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/regular", loadOnStartup = 5)
public class LoginResource extends HttpServlet {
    public LoginResource() {
        System.out.println("LoginResource is created..");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userId = req.getParameter("userId");
        String password = req.getParameter("password");

        req.setAttribute("userId", userId);
        req.setAttribute("password", password);

        if (userId.equals("admin") && password.equals("password"))
        	 {
                 System.out.println("Login Successful...");
                 RequestDispatcher dispatcher = req.getRequestDispatcher("LoginSuccess.jsp");
                 dispatcher.forward(req, resp);
             } else {
                 req.setAttribute("errorMsg", "Credentials do not match");
                 System.out.println("Credentials not matching....");
                 RequestDispatcher dispatcher = req.getRequestDispatcher("Login.jsp");
                 dispatcher.forward(req, resp);
             }
        
    }
}
