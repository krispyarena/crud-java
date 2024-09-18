package org.demo.amnilcrud.controllers;

import org.demo.amnilcrud.model.Player;
import org.demo.amnilcrud.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping({"/","/players"})
    public String getPlayer(Model model){

        return "PlayerForm";
    }

    @PostMapping("/players")
    public String postPlayer(@ModelAttribute Player player){
        playerService.addPlayer(player);
        return "PlayerForm";
    }

    @GetMapping("/playersList")
    public String getPlayersList(Model model){
        model.addAttribute("plist", playerService.getAllPlayers());
        return "PlayersListForm";
    }

    @GetMapping("/players/delete")
    public String deletePlayer(@RequestParam Long id){
        playerService.deletePlayer(id);
        return "redirect:/playersList";
    }

    @GetMapping("/players/edit")
    public String editPlayer(@RequestParam Long id, Model model){
        model.addAttribute("player", playerService.getPlayerById(id));
        return "PlayerEditForm";
    }

    @PostMapping("players/update")
    public String updatePlayer(@ModelAttribute Player player){
        playerService.updatePlayer(player);
        return "redirect:/playersList";
    }

}
