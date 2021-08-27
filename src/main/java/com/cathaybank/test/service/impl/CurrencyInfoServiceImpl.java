package com.cathaybank.test.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cathaybank.test.entity.CurrencyInfo;
import com.cathaybank.test.repository.CurrencyInfoRepository;
import com.cathaybank.test.service.CurrencyInfoService;

@Service
public class CurrencyInfoServiceImpl implements CurrencyInfoService{
	@Autowired
	private CurrencyInfoRepository currencyInfoRepository;

	@Override
	public CurrencyInfo addCurrencyInfo(CurrencyInfo currencyInfo) {
		CurrencyInfo info = currencyInfoRepository.findByCode(currencyInfo.getCode());
		if (info != null) {
			currencyInfo.setId(info.getId());
		}
		return currencyInfoRepository.save(currencyInfo);
	}

	@Override
	public CurrencyInfo getCurrencyInfo(int id) {
		return currencyInfoRepository.getById(id);
	}

	@Override
	public List<CurrencyInfo> getAllCurrencyInfo() {
		return currencyInfoRepository.findAll();
	}

	@Override
	@Transactional(rollbackOn=Exception.class)
	public CurrencyInfo modifyCurrencyInfo(CurrencyInfo currencyInfo) {
		return currencyInfoRepository.save(currencyInfo);
	}

	@Override
	@Transactional(rollbackOn=Exception.class)
	public void deleteCurrencyInfo(Integer id) throws IllegalAccessException {
		currencyInfoRepository.deleteById(id);
	}

	@Override
	public CurrencyInfo findCurrencyInfoByCode(String code) {
		return currencyInfoRepository.findByCode(code);
	}

	@Override
	public List<CurrencyInfo> findAll() {
		return currencyInfoRepository.findAll();
	}

}
