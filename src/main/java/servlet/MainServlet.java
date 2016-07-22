package servlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 19.07.16.
 */
public class MainServlet extends HttpServlet {
    List<Tasks> result = new ArrayList<>();;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        updateResponse(req,  resp);

}
    private void updateResponse(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
       String tasks[] = request.getParameterValues("task");
        if(tasks != null) {
            for (int i = 0; i < result.size(); ++i) {
                for (int j = 0; j < tasks.length; ++j)
                    if(result.get(i).getName().equals(tasks[j]))
                        result.remove(i) ;
            }
        }
        request.setAttribute("styles", result);
        RequestDispatcher view = request.getRequestDispatcher("headers.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      getResponse(request, response);

    }


    private void getResponse(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Tasks task = new Tasks();
        String name = request.getParameter("parameter1");
        String category = request.getParameter("parameter2");
        if(name != null && category != null ) {
            task.setName(name);
            task.setCategory(category);
            result.add(task);
        }

        request.setAttribute("styles", result);
        RequestDispatcher view = request.getRequestDispatcher("headers.jsp");
        view.forward(request, response);
    }



}
