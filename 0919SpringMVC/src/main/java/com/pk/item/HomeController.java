package com.pk.item;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pk.item.domain.Item;
import com.pk.item.service.ItemService;

@Controller
public class HomeController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locase,Model model) {
		List<Item> list = itemService.listItem();
		model.addAttribute("list",list);
		return "home";
	}
	
	@RequestMapping(value="detail",method=RequestMethod.GET)
	public String getItem(
			@RequestParam("itemid") int itemid, Model model) {
		Item item = itemService.getItem(itemid);
		model.addAttribute("item",item);
		return "detail";
	}
	
}
