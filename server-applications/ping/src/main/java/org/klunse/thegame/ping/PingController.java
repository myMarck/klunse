package org.klunse.thegame.ping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
    
    @RequestMapping("/")
    public String index() {
        return "Ping!";
    }
}
