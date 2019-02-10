package com.srf.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srf.dto.Receipt;
import com.srf.dto.Recharge;

@RestController
@RequestMapping("/wallet")
public class PayTMWalletController {
	@GetMapping("/{mobileNo}")
	public float getBalance(@PathVariable("mobileNo") String mobileNo) {
		System.out.println("mobile : " + mobileNo);
		return 33.34f;
	}

	@PostMapping(consumes = { "application/json" }, produces = { "application/json" })
	public ResponseEntity<Receipt> addBalance(@RequestBody Recharge recharge) {
		Receipt receipt = null;
		ResponseEntity<Receipt> responseEntity = null;

		receipt = new Receipt();
		receipt.setMobileNo(recharge.getMobileNo());
		receipt.setBalance(100 + recharge.getAmount());
		responseEntity = new ResponseEntity<>(receipt, HttpStatus.CREATED);
		return responseEntity;
	}
}
