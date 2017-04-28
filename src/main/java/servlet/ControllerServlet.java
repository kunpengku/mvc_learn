package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by fupeng on 2017/4/28.
 */

@WebServlet(name="ControllerServlet"  , urlPatterns = {"/"})

public class ControllerServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req, resp);
    }

    private void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        int lastIndex = uri.lastIndexOf("/");

        String action = uri.substring(lastIndex+1);

        if(action.equals("product_input")){
            // no action
        }else if(action.equals("product_save")){
            // todu
        }

        //forward to a view
        String dispatchUrl = null;
        if(action.equals("product_input")){
            dispatchUrl = "/WEB-INF/page/ProductForm.jsp";
        }else if(action.equals("product_save")){
            dispatchUrl = "/WEB-INF/page/ProductDetail.jsp";
        }

        if(dispatchUrl != null){
            RequestDispatcher rd = req.getRequestDispatcher(dispatchUrl);
            rd.forward(req, resp);
        }
    }
}
