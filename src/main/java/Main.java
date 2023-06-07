import jakarta.persistence.EntityManager;
import java.util.List;
import me.romeralvarez.app.config.JPAUtil;
import me.romeralvarez.app.entities.ClientEntity;

public class Main {
  public static final EntityManager em = JPAUtil.getEntityManager();

  public static void main(String[] args) {

    /* a simple query */
    // listAllFromDataBase();
  }
  public static void listAllFromDataBase()
  {

    List<ClientEntity> clientEntities =  em.createQuery("SELECT c FROM ClientEntity c", ClientEntity.class).getResultList();

    for (ClientEntity clientEntity : clientEntities) {
      System.out.println("");
      System.out.printf(clientEntity.toString());
    }
    em.close();
  }
}
