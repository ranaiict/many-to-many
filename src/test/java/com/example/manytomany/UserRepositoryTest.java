package com.example.manytomany;

import com.example.manytomany.model.Role;
import com.example.manytomany.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import javax.persistence.PersistenceContext;
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@Rollback(value = false)
//public class UserRepositoryTest {
//
//    @Autowired
//    private UserRepository repo;
//
//    @PersistenceContext
//    private TestEntityManager entityManager;
//
//    @Test
//    public void testCreateRole(){
//        Role roleAdmin = new Role("Administrator");
//        Role roleEditor = new Role("Editor");
//        Role roleVisitor = new Role("Visitor");
//
//        entityManager.persist(roleAdmin);
//        entityManager.persist(roleEditor);
//        entityManager.persist(roleVisitor);
//
//    }
//}
