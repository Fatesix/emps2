package com.baizhi.service;

import com.baizhi.entity.Emp;
import com.baizhi.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {
	
    @Autowired
	private EmpMapper empMapper;
	
	@Override
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public List<Emp> getAll() {
		List<Emp> list = empMapper.queryAll();
		return list;
	}


}
