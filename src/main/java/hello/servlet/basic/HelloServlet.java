package hello.servlet.basic;



import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@WebServlet(name="helloServlet",urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println( "HelloServlet.service" );
        System.out.println( "request = " + request );
        System.out.println( "response = " + response );
        System.out.println( "request.toString() = " + request.toString() );
        System.out.println( "request = " + request.getParameter( "username" ) );

        response.setContentType( "text/plain" );
        response.setCharacterEncoding( "utf-8" );
        response.getWriter().write( "Hello " + request.getParameter( "username" ) );
    }
}
