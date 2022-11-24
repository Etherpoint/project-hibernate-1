package com.game.repository;

import com.game.entity.Player;
import com.game.util.Cfg;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

@Repository(value = "db")
public class PlayerRepositoryDB implements IPlayerRepository {

    private final SessionFactory sessionFactory;

    public PlayerRepositoryDB() {
        Properties properties = new Properties();
        properties.put(Environment.DRIVER, Cfg.getDRIVER());
        properties.put(Environment.URL, Cfg.getURL());
        properties.put(Environment.DIALECT, Cfg.getDIALECT());
        properties.put(Environment.USER, Cfg.getUSER());
        properties.put(Environment.PASS, Cfg.getPASSWORD());
        properties.put(Environment.HBM2DDL_AUTO, "update");
        sessionFactory = new Configuration()
                .setProperties(properties)
                .addAnnotatedClass(Player.class)
                .buildSessionFactory();
    }

    @Override
    public List<Player> getAll(int pageNumber, int pageSize) {
        try(Session session = sessionFactory.openSession()){
            NativeQuery<Player> nativeQuery = session.createNativeQuery("SELECT * FROM Player", Player.class);
            nativeQuery.setFirstResult(pageNumber*pageSize);
            nativeQuery.setMaxResults(pageSize);
            return nativeQuery.list();
        }
    }

    @Override
    public int getAllCount() {
        try(Session session = sessionFactory.openSession()){
            Query<Long> result = session.createNamedQuery("Player_getAllCount", Long.class);
            return Math.toIntExact(result.uniqueResult());
        }
    }

    @Override
    public Player save(Player player) {
        return null;
    }

    @Override
    public Player update(Player player) {
        return null;
    }

    @Override
    public Optional<Player> findById(long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Player player) {

    }

    @PreDestroy
    public void beforeStop() {
        sessionFactory.close();
    }
}