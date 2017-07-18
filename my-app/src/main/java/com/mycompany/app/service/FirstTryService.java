package com.mycompany.app.service;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface FirstTryService {

	Integer cal(Integer x, Integer y);

	Integer deduct(Integer x, Integer y);

}
