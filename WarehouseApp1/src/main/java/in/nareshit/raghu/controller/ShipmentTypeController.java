package in.nareshit.raghu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.nareshit.raghu.model.ShipmentType;
import in.nareshit.raghu.service.IShipmentTypeService;

@Controller
@RequestMapping("/st")
public class ShipmentTypeController {
	
	@Autowired
	private IShipmentTypeService service;
	
	//1. Show Register page
	@GetMapping("/register")
	public String showReg() {
		return "ShipmentTypeRegister";
	}
	
	//2. On click submit button read form -> save data
	@PostMapping("/save")
	public String saveShipmentType(
			//Reading Form Data
			@ModelAttribute ShipmentType shipmentType,
			Model model //send to UI
			) 
	{
		//call service
		Integer id = service.saveShipmentType(shipmentType);
		
		//create message
		String message = "Shipment Type "+id+" saved";

		//send message to UI
		model.addAttribute("message", message);
		
		//Go back to same page
		return "ShipmentTypeRegister";
	}
	
	
	
	
	
}
