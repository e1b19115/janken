package oit.is.z1404.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Lec02Controller {
  /**
   *
   * @param name
   * @param model
   * @return
   */
  @GetMapping("/lec02")
  public String lec02() {
    return "lec02.html";
  }

  @PostMapping("/lec02")
  public String lec02(@RequestParam String name, ModelMap model) {
    model.addAttribute("name", name);
    return "lec02.html";
  }

  @GetMapping("/lec02/{param1}")
  public String lec02j(@PathVariable String param1, ModelMap model) {
    String playerhand;
    String cpuhand = "Gu";
    String judge;
    if (param1.equals("gu")) {
      playerhand = "Gu";
      judge = "Draw!!";
    } else if (param1.equals("pa")) {
      playerhand = "Pa";
      judge = "You Win!!";
    } else {
      playerhand = "Tyoki";
      judge = "You Lose!!";
    }
    model.addAttribute("playerhand", playerhand);
    model.addAttribute("cpuhand", cpuhand);
    model.addAttribute("judge", judge);
    return "lec02.html";
  }
}
