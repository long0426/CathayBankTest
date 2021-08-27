package com.cathaybank.test.service;

import com.cathaybank.test.vo.CurrentPrice;
import com.cathaybank.test.vo.CurrentPriceResponse;

public interface CoinDeskService {

	CurrentPrice getCurrentPrice();
	
	CurrentPriceResponse callCoinDeskApi();

}
