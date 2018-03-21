package MediaController;

import com.MediaModel.Media;
import DatabaseOperations.MediaRepositoryImpl;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ListMediaController", urlPatterns = {"/list"})
public class ListMediaController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Hello, world!");
        out.println("Media House");
        //out.flush();
        //Connection con = null;

            //con = MyPostgresConnection.getMyPostgresConnection();

            List<Media> displayMediaList = new MediaRepositoryImpl().displayMediaProducts();
            request.setAttribute("displayMediaList", displayMediaList);
            request.getRequestDispatcher("ListMedia.jsp").forward(request,response);
            //view.forward(request,response);

    }
}
