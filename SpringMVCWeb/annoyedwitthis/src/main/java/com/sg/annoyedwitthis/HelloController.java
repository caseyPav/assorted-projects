package com.sg.annoyedwitthis;

import java.util.Map;
import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value ="/annoyedwitthis")
public class HelloController {

    public HelloController() {
    }
    
    @RequestMapping(value="/idiot", method = RequestMethod.POST)
    public String idiot(String userBet, Map<String, String> model) {
        
        int wallet = Integer.valueOf(userBet);
        int maxWallet;
        int maxWalletCount;
        int die1;
        int die2;
        int count;

        count = 0;
        maxWallet = 0;
        maxWalletCount = 0;

        while (wallet > 0) {
            count++;
            Random generator = new Random();

            die1 = generator.nextInt(6) + 1;
            die2 = generator.nextInt(6) + 1;

            if (die1 + die2 == 7) {
                wallet += 4;
            } else {
                wallet -= 1;
            }

            if (maxWallet < wallet) {
                maxWallet = wallet;
                maxWalletCount = count;
            }

        }

        String countStr = Integer.toString(count);
        String maxMoneyStr = Integer.toString(maxWalletCount);
        String maxWalletStr = Integer.toString(maxWallet);
        
        
        
        model.put("countStr", countStr);
        model.put("maxMoneyStr", maxMoneyStr);
        model.put("maxWalletStr", maxWalletStr);
        return "response";
    }
}
