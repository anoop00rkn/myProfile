package com.anoop.profile.repository;

import com.anoop.profile.entity.Profile;
import com.anoop.profile.entityManagerFactory.EntityManagerFactoryObject;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

@Repository
public class ProfileRepository {

    private EntityManagerFactoryObject entityManagerFactoryObject;

    public ProfileRepository(final EntityManagerFactoryObject entityManagerFactoryObject) {
        this.entityManagerFactoryObject = entityManagerFactoryObject;
    }

    public Profile readProfileDetails(int id){
        Profile profile = null;
        EntityManager entityManager = entityManagerFactoryObject.createEntityManager();
        EntityTransaction transaction = null;
        try {
            // Get a transaction
            transaction = entityManager.getTransaction();
            // Begin the transaction
            transaction.begin();
            profile = entityManager.find(Profile.class, id);
        } catch (Exception ex) {
            // If there are any exceptions, roll back the changes
            if (transaction != null) {
                transaction.rollback();
            }
            // Print the Exception
            ex.printStackTrace();
        } finally {
            // Close the entityManagerFactory
            entityManagerFactoryObject.closeEntityManager(entityManager);
        }
        return profile;
    }
}
