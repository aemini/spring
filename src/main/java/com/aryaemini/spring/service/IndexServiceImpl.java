package com.aryaemini.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("indexService")
@Transactional
public class IndexServiceImpl implements IndexService {

	@Autowired
	public String getAttributes() {
		return "Bar";
	}
}
