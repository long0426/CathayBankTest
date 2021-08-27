package com.cathaybank.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cathaybank.test.service.CoinDeskService;
import com.cathaybank.test.vo.CurrentPrice;

@RestController
@RequestMapping("coindesk")
public class CoinDeskController {
	@Autowired
	private CoinDeskService coinDeskService;
	
	@GetMapping("show")
	public CurrentPrice getCurrentPrice() {
		CurrentPrice currentPrice = coinDeskService.getCurrentPrice();
		return currentPrice;
	}
}
