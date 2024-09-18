package org.demo.amnilcrud.services.impl;

import org.demo.amnilcrud.model.Player;
import org.demo.amnilcrud.repository.PlayerRepository;
import org.demo.amnilcrud.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepo;


    @Override
    public void addPlayer(Player player) {
        playerRepo.save(player);
    }

    @Override
    public void deletePlayer(Long id) {
        playerRepo.deleteById(id);
    }

    @Override
    public void updatePlayer(Player player) {
        playerRepo.save(player);
    }

    @Override
    public Player getPlayerById(Long id) {
        return playerRepo.findById(id).get();
    }

    @Override
    public List<Player> getAllPlayers() {
        return playerRepo.findAll();
    }
}
