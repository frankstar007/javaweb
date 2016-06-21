package com.frankstar;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by frankstar on 16/6/21.
 */
public class ServletParameterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig servletConfig = this.getServletConfig();
        PrintWriter printWriter = resp.getWriter();

        printWriter.append("dataBase: ").append(servletConfig.getInitParameter("dataBase"))
                .append(", server: ").append(servletConfig.getInitParameter("server"));

    }
}
