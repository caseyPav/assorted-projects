package com.sg.sitelab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import com.sg.sitelab.dao.LuckySevensDAO;
import com.sg.sitelab.dao.FactorizerDAO;
import com.sg.sitelab.dao.FloorCalcDAO;
import com.sg.sitelab.dao.InterestCalcDAO;
import com.sg.sitelab.dao.TipCalcDAO;
import com.sg.sitelab.dao.UnitDAO;

@Controller
@RequestMapping({"/SiteLab"})
public class SiteController {

    LuckySevensDAO luckyDao;
    FactorizerDAO factorizerDao;
    InterestCalcDAO interestDao;
    TipCalcDAO tipDao;
    FloorCalcDAO floorDao;
    UnitDAO unitDao;

    @Inject
    public SiteController(LuckySevensDAO luckyDao, FactorizerDAO factorizerDao,
            InterestCalcDAO interestDao, TipCalcDAO tipDao, FloorCalcDAO floorDao, UnitDAO unitDao) {
        this.luckyDao = luckyDao;
        this.factorizerDao = factorizerDao;
        this.interestDao = interestDao;
        this.tipDao = tipDao;
        this.floorDao = floorDao;
        this.unitDao = unitDao;
    }

    @RequestMapping(value = "/throwawaymoney", method = RequestMethod.POST)
    public String luckySevensController(int userBet, Map<String, Object> model) {
        String[] result = luckyDao.runLuckySevens(userBet);
        model.put("countStr", result[0]);
        model.put("maxMoneyStr", result[1]);
        model.put("maxWalletStr", result[2]);
        return "luckysevensresponse";
    }

    @RequestMapping(value = "/factor", method = RequestMethod.POST)
    public String factorizerController(int userNumber, Map<String, Object> model) {
        String[] result = factorizerDao.runFactorizer(userNumber);
        model.put("allTheFactors", result[0]);
        model.put("perfectResult", result[1]);
        model.put("primeResult", result[2]);
        return "factorizerresponse";
    }

    @RequestMapping(value = "/domath", method = RequestMethod.POST)
    public String interestController(double userPrincipal, double userInterest, int userYears, Map<String, Object> model) {
        List listToReturn = interestDao.runInterestCalc(userPrincipal, userInterest, userYears);
        model.put("listToReturn", listToReturn);
        return "interestcalcresponse";
    }

    @RequestMapping(value = "/tipdrill", method = RequestMethod.POST)
    public String tipController(double userCheck, double userTip, Map<String, Object> model) {
        String[] result = tipDao.runTipCalc(userCheck, userTip);
        model.put("userCheck", userCheck);
        model.put("userTip", userTip);
        model.put("tip", result[0]);
        model.put("total", result[1]);
        return "tipcalcresponse";
    }

    @RequestMapping(value = "/floorstuff", method = RequestMethod.POST)
    public String floorController(double userCost, double userLength, double userWidth, Map<String, Object> model) {
        String[] result = floorDao.runFloorCalc(userCost, userLength, userWidth);
        model.put("totalSqFt", result[0]);
        model.put("floorCost", result[1]);
        model.put("laborCost", result[2]);
        model.put("totalCost", result[3]);
        return "floorcalcresponse";
    }

    @RequestMapping(value = "/convert", method = RequestMethod.POST)
    public String unitController(String unitFrom, String unitTo, double toConvert, Map<String, Object> model) {
        String[] result = unitDao.runUnitConverter(unitFrom, unitTo, toConvert);
        model.put("totalSqFt", result[0]);
        model.put("floorCost", result[1]);
        model.put("laborCost", result[2]);
        model.put("totalCost", result[3]);
        return "floorcalcresponse";
    }
    
}
