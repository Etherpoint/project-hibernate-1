package com.game.repository;

import com.game.entity.Player;
import org.springframework.stereotype.Repository;

import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Optional;

@Repository(value = "db")
public class PlayerRepositoryDB implements IPlayerRepository {
    //todo Убрать комментарии

/*    private final SessionFactory sessionFactory;

    public PlayerRepositoryDB() {
        Properties properties = new Properties();
        properties.put(Environment.DRIVER, Cfg.getDRIVER());
        properties.put(Environment.URL, Cfg.getURL());
        properties.put(Environment.DIALECT, Cfg.getDIALECT());
        properties.put(Environment.USER, Cfg.getUSER());
        properties.put(Environment.PASS, Cfg.getPASSWORD());
        properties.put(Environment.HBM2DDL_AUTO, "update");
        sessionFactory = new Configuration()
                .configure()
                .setProperties(properties)
                .addAnnotatedClass(Player.class)
                .buildSessionFactory();
    }*/

    @Override
    public List<Player> getAll(int pageNumber, int pageSize) {
        return null;
    }

    @Override
    public int getAllCount() {
        return 0;
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

    }
}