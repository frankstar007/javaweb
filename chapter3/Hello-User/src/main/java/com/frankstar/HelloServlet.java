package com.frankstar;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by frankstar on 16/6/20.
 */
@WebServlet(
        name = "helloServlet",
        urlPatterns = {"/greeting", "/salutation", "/wazzup"},
        loadOnStartup = 1
)
public class HelloServlet extends HttpServlet {

    private static final String DEFAULT_USER = "Guest";

    @Override
    public void destroy() {
        //super.destroy();
        System.out.println("Servlet:" + this.getServletName() + " has destoried!");
    }

    @Override
    public void init() throws ServletException {
        //super.init();
        System.out.println("Servlet:" + this.getServletName() + " has started!");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String user = req.getParameter("user");
        if (user == null) {
            user = HelloServlet.DEFAULT_USER;
        }

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter printWriter = resp.getWriter();
        printWriter.append("<!DOCTYPE html>\r\n")
                .append("<html>\r\n")
                .append("   <head>\r\n")
                .append("       <title>Hello Frankstar</title>\r\n")
                .append("   </head>")
                .append("   <body>\r\n")
                .append("       Hello, ").append(user).append("!<br/><br/>\r\n")
                .append("       <form action=\"greeting\" method=\"POST\">\r\n")
                .append("           Enter your name:<br/>\r\n")
                .append("           <input type=\"text\" name=\"user\"/><br/>\r\n")
                .append("           <input type=\"submit\" value=\"Submit\"/>\r\n")
                .append("       </form>\r\n")
                .append("   </body>\r\n")
                .append("</html>\r\n");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doGet(request, response);
    }

}
