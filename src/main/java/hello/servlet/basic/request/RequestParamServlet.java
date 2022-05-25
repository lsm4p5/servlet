package hello.servlet.basic.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;

/**
 * 1. 파라미터 전송 기능
 *  http://localhost:8080/request-param?username=hello&age=20
 *
 */
@WebServlet(name="requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println( "[전체 파라메터 조회] - Start" );

        request.getParameterNames().asIterator().forEachRemaining( s-> System.out.println( s + " = " +  request.getParameter(s)));

        System.out.println( "[전체 파라메터 조회] - End" );
        System.out.println();

        System.out.println("[단일 파라메터 조회] ");
        String username = request.getParameter( "username" );
        System.out.println( "username = " + username );
        String age = request.getParameter( "age" );
        System.out.println( "age = " + age );
        System.out.println();

        System.out.println("[이름이 같은 복수 파라메터 조회]");
        String[] usernames = request.getParameterValues( "username" );
        for (String s : usernames) {
            System.out.println( "username = " + s );
        }
        System.out.println();

        response.getWriter().write( "OK" );

    }
}
