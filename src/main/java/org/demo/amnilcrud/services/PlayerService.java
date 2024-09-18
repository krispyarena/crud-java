package org.demo.amnilcrud.services;

import org.demo.amnilcrud.model.Player;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlayerService {

    void addPlayer(Player player);

    void deletePlayer(Long id);

    void updatePlayer(Player player);

    Player getPlayerById(Long id);

    List<Player> getAllPlayers();
}
