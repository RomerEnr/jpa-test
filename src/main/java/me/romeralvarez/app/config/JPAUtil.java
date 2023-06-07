package me.romeralvarez.app.config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
  private static final String PERSISTENCE_UNIT_NAME = "logixs_pu";
  private static EntityManagerFactory factory = getEntityManagerFactory();

  private static EntityManagerFactory getEntityManagerFactory() {
    return Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
  }

  public static EntityManager getEntityManager(){
    return factory.createEntityManager();
  }

  public static void shutdown() {
    if (factory != null) {
      factory.close();
    }
  }
}
