package com.basics.in.java.blogspot.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.basics.in.java.blogspot.Model.Laptop;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class LaptopRepository {
    @PersistenceContext
    EntityManager entityManager;

    public List<Laptop> findAll() {
        TypedQuery<Laptop> namedQuery = entityManager.createNamedQuery("find_all_laptops", Laptop.class);
        return namedQuery.getResultList();
    }

    public Laptop findById(Long id) {
        return entityManager.find(Laptop.class, id);

    }

    public void deleteById(Long id) {
        Laptop laptop = findById(id);
        entityManager.remove(laptop);

    }

    public Laptop insert(Laptop laptop) {
        return entityManager.merge(laptop);

    }

    public Laptop update(Laptop laptop) {
        return entityManager.merge(laptop);

    }

}