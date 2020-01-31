package com.jwat.controller.web;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jwat.dto.NewDTO;


import com.jwat.service.INewService;
import com.jwat.util.MessageUtil;

@Controller(value = "newControllerOfWeb")
public class NewController {
	
	@Autowired
	private INewService newService;
	

	
	@Autowired
	private MessageUtil messageUtil;

	@RequestMapping(value = "/trang-chu/danh-sach", method = RequestMethod.GET)
	public ModelAndView showList( HttpServletRequest request) {
		NewDTO model = new NewDTO();
		model.setPage(1);
		model.setLimit(21);
		ModelAndView mav = new ModelAndView("web/hienthi");
		Pageable pageable = new PageRequest(1 - 1,21);
		model.setListResult(newService.findAll(pageable));
		model.setTotalItem(newService.getTotalItem());
		model.setTotalPage((int) Math.ceil((double) model.getTotalItem() / model.getLimit()));
		if (request.getParameter("message") != null) {
			Map<String, String> message = messageUtil.getMessage(request.getParameter("message"));
			mav.addObject("message", message.get("message"));
			mav.addObject("alert", message.get("alert"));
		}
		mav.addObject("model", model);
		return mav;
	}
	
	@RequestMapping(value = "/trang-chu./", method = RequestMethod.GET)
	public ModelAndView showListpage(@RequestParam("page") int page
								, HttpServletRequest request) {
		NewDTO model = new NewDTO();
		model.setPage(page);
		model.setLimit(20);
		ModelAndView mav = new ModelAndView("web/list");
		Pageable pageable = new PageRequest(page - 1,20);
		model.setListResult(newService.findAll(pageable));
		model.setTotalItem(newService.getTotalItem());
		model.setTotalPage((int) Math.ceil((double) model.getTotalItem() / model.getLimit()));
		if (request.getParameter("message") != null) {
			Map<String, String> message = messageUtil.getMessage(request.getParameter("message"));
			mav.addObject("message", message.get("message"));
			mav.addObject("alert", message.get("alert"));
		}
		mav.addObject("model", model);
		return mav;
	}
	@RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
	public ModelAndView show(  HttpServletRequest request) {
		NewDTO model = new NewDTO();
		model.setPage(1);
		model.setLimit(21);
		model.setSortBy("desc");
		ModelAndView mav = new ModelAndView("web/list");
		Pageable pageable = new PageRequest(1 - 1, 21);
		model.setListResult(newService.findAll(pageable));
		model.setTotalItem(newService.getTotalItem());
		model.setTotalPage((int) Math.ceil((double) model.getTotalItem() / model.getLimit()));
		if (request.getParameter("message") != null) {
			Map<String, String> message = messageUtil.getMessage(request.getParameter("message"));
			mav.addObject("message", message.get("message"));
			mav.addObject("alert", message.get("alert"));
		}
		mav.addObject("model", model);
		return mav;
	}
	@RequestMapping("/baiviet/{id}")
	public ModelAndView showPost(@PathVariable("id")int id)
	{
		NewDTO model = new NewDTO();
		model.setItem(newService.findById(id));
		ModelAndView mav = new ModelAndView("web/test");
		mav.addObject("model", model);
		return mav;
	}
	@RequestMapping("/danh-muc/{id}")
	public ModelAndView showCategory(@PathVariable("id")int id,HttpServletRequest request)
	{
		NewDTO model = new NewDTO();
		model.setPage(1);
		model.setLimit(21);
		model.setSortBy("desc");
		ModelAndView mav = new ModelAndView("web/list");
		model.setListResult(newService.findBycategoryid(id));
		model.setTotalItem(newService.getTotalItem());
		model.setTotalPage((int) Math.ceil((double) model.getTotalItem() / model.getLimit()));
		if (request.getParameter("message") != null) {
			Map<String, String> message = messageUtil.getMessage(request.getParameter("message"));
			mav.addObject("message", message.get("message"));
			mav.addObject("alert", message.get("alert"));
		}
		mav.addObject("model", model);
		return mav;
	}

	
}
