package MediaController;

import DatabaseOperations.MediaRepositoryImpl;
import com.MediaModel.Media;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteMediaController", urlPatterns = {"/delete"})
public class DeleteMediaController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        MediaRepositoryImpl mediaRepository = new MediaRepositoryImpl();
        Integer id = Integer.parseInt(request.getParameter("id"));
        Media media = new MediaRepositoryImpl().findById(id);
        mediaRepository.deleteProduct(media);
        request.setAttribute("msg", "Deleted Successfully!");
        response.sendRedirect("/list");
    }
}
