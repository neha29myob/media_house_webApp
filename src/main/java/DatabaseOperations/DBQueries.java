package DatabaseOperations;

import com.MediaModel.Media;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class DBQueries {
    private static EntityManager entityManager;

    public static List<Media> displayMediaProducts() {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("mediaPU");
        entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        List<Media> mediaList = entityManager.createQuery(
                "SELECT m FROM Media m").getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        factory.close();
        
    return mediaList;
    }
}
