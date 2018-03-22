package MediaController;

import DatabaseOperations.MediaRepositoryImpl;
import com.MediaModel.Media;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateMediaController", urlPatterns = {"/update"})
public class UpdateMediaController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        updateOperations(request,response);
    }

    protected void updateOperations(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String cmd = request.getParameter("cmd");
        if(cmd.equalsIgnoreCase("openUpdate")){
            openUpdatePage(request,response);
        }
        else if(cmd.equalsIgnoreCase("saveUpdate")){
            updateMedia(request,response);
        }
    }

    protected void openUpdatePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //MediaRepositoryImpl mediaRepository = new MediaRepositoryImpl();
        Integer id = Integer.parseInt(request.getParameter("id"));
        Media media = new MediaRepositoryImpl().findById(id);
        request.setAttribute("media", media);
        request.getRequestDispatcher("UpdateMedia.jsp").forward(request,response);
    }

    private void updateMedia(HttpServletRequest request, HttpServletResponse response) throws IOException {
        MediaRepositoryImpl mediaRepository = new MediaRepositoryImpl();
        Media media = new Media(Integer.parseInt(request.getParameter("id")),
                request.getParameter("title"),
                request.getParameter("category"),
                Float.parseFloat(request.getParameter("price")),
                Integer.parseInt(request.getParameter("quantity")));
        mediaRepository.updateProduct(media);
        request.setAttribute("msg", "Updated successfully");
        response.sendRedirect("/list");
    }
}
