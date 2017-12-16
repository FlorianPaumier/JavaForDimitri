package fr.iialaval.eshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TotoController {

	@RequestMapping("/toto")
	public String totoPage() {

		return "totopage";
	}
}
