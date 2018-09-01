package com.baizhi.controller;

import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/es")
public class EmsController {
	@Autowired
	private EmpService empService;

	@RequestMapping("/showAll")
	public List<Emp> showAll(){
		List<Emp>list = empService.getAll();
			return list;
	}


}
