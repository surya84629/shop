package com.jsp.SweetShop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.SweetShop.dao.SweetDao;

@Controller
public class SweetController {

    @Autowired
    private SweetDao sweetDao;
	//to show the show the page
    @RequestMapping("/buy")
    public String buy()
    {
    	return "BuySweet" ;
    }
    //to perform the operation of page
    @RequestMapping("/buySweet")
    public ModelAndView buySweet(@RequestParam("sweetNames") String sweet, @RequestParam("quantity") double quantity, ModelAndView model) {
        int currentStock = sweetDao.getStock(sweet);

        if (currentStock >= quantity) {
            double remainingStock = currentStock - quantity;
            sweetDao.updateStock(sweet, remainingStock);
			model.setViewName("BuySweet");
			

            model.addObject("msg", "Thank you for buying " + quantity + " kg of " + sweet + ".");
            model.addObject("stock","remainingStock "+ remainingStock +" Kg "+sweet+" .");
        } else {
        	model.setViewName("BuySweet");
            model.addObject("msg", sweet + " is out of stock.");
            
        }
        return model;
    }
}
