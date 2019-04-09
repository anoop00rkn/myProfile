package com.anoop.profile.entityManagerFactory;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class EntityManagerFactoryObject {
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("JavaHelps");

    public EntityManager createEntityManager() {
        return ENTITY_MANAGER_FACTORY.createEntityManager();
    }

    public void closeEntityManager(EntityManager entityManager) {
        entityManager.close();
    }

}
