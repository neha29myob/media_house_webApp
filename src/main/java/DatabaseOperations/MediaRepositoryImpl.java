package DatabaseOperations;

import com.MediaModel.Media;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import javax.ejb.Stateless;
//import javax.persistence.PersistenceContext;

//@Stateless
public class MediaRepositoryImpl {
    //@PersistenceContext(unitName="mediaPU")
    private EntityManagerFactory factory;
    private EntityManager em;


    public MediaRepositoryImpl(){

        factory =Persistence.createEntityManagerFactory("mediaPU");
        em = factory.createEntityManager();
   }

    public Media createProduct(Media media){
       em.getTransaction().begin();
       em.persist(media);
       em.getTransaction().commit();
       return media;
    }

    public List<Media> displayMediaProducts() {
        em.getTransaction().begin();
        List<Media> mediaList = em.createQuery("SELECT m FROM Media m").getResultList();
        em.getTransaction().commit();
        return mediaList;

//        String sql = "Select * from media";
//        PreparedStatement pstm = conn.prepareStatement(sql);
//        ResultSet rs = pstm.executeQuery();
//        List<Media> mediaList = new ArrayList<>();
//
//        while(rs.next()){
//        Media media = new Media();
//        media.setCode(rs.getInt("code"));
//        media.setName(rs.getString("name"));
//        media.setPrice(rs.getFloat("price"));
//        media.setCategory(rs.getString("category"));
//        media.setQuantity(rs.getInt("quantity"));
//        mediaList.add(media);
//        }
    }
}
