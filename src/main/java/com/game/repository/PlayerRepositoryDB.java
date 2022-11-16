package com.game.repository;

import com.game.entity.Player;
import com.game.util.DataInfo;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Properties;

@Repository(value = "db")
public class PlayerRepositoryDB implements IPlayerRepository {

    private final SessionFactory sessionFactory;

    public PlayerRepositoryDB() {
        //todo Остановился здесь
        /*Properties properties = new Properties();
        properties.put(Environment.DRIVER, DataInfo.getDRIVER());
        properties.put(Environment.URL, DataInfo.getURL());
        properties.put(Environment.DIALECT, DataInfo.getDIALECT());
        properties.put(Environment.USER, DataInfo.getUSER());
        properties.put(Environment.PASS, DataInfo.getPASSWORD());
        sessionFactory = new Configuration()
                .setProperties(properties);*/
    }

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

    /*@PreDestroy
    public void beforeStop() {

    }*/
}