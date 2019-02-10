package com.bamvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FindMedicineController {

	@PostMapping("/do-find-medicine.htm")
	public String doFindMedicine(@RequestParam("medicineName") String medicineName, ModelMap modelMap) {
		modelMap.addAttribute("medicineName", medicineName);
		return "medicine-details";
	}

}
