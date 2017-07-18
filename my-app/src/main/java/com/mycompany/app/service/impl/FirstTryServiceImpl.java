package com.mycompany.app.service.impl;

import org.springframework.stereotype.Service;

import com.mycompany.app.service.FirstTryService;

@Service
public class FirstTryServiceImpl implements FirstTryService {

	@Override
	public Integer cal(Integer x, Integer y) {
		Integer cal = x + y;
		return cal;
	}
	
	@Override
	public Integer deduct(Integer x, Integer y){
		Integer cal = x - y;
		return cal;
	}

}
