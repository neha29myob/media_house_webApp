package MediaController;

import DatabaseOperations.MediaRepositoryImpl;
import com.MediaModel.Media;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CreateMediaController", urlPatterns = {"/create"})
public class CreateMediaController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MediaRepositoryImpl mediaRepository = new MediaRepositoryImpl();
        Media media = new Media(null,
                    request.getParameter("title"),
                    request.getParameter("category"),
                    Float.parseFloat(request.getParameter("price")),
                    Integer.parseInt(request.getParameter("quantity")));
        mediaRepository.createProduct(media);
        request.setAttribute("msg", "Created Successfully!");
        request.getRequestDispatcher("CreateMedia.jsp").forward(request,response);
        //response.sendRedirect("/list");
    }
}
