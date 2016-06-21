package com.frankstar;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by frankstar on 16/6/21.
 */
@WebServlet(
        name = "contextParameterServlet",
        urlPatterns = {"/contextParameters"}
)
public class ContextParameterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = this.getServletContext();
        PrintWriter printWriter = resp.getWriter();

        printWriter.append("settinOne: ").append(servletContext.getInitParameter("settingOne"))
                .append(", settingTwo: ").append(servletContext.getInitParameter("settingTwo"));

    }
}
