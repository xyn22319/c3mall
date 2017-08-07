package cn.manager.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.manager.service.ItemServer;
import e3.common.pojo.EasyUIResult;
import e3.manager.pojo.TbItem;



@Controller
public class ItemController {

	@Autowired
	private ItemServer itemServer;
	//item/list
	@RequestMapping("item/list")
	public @ResponseBody EasyUIResult list(int page,int rows){
		EasyUIResult result=itemServer.findAll(page,rows);
		
		return result;
	}
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	@RequestMapping("/{page}")
	public String demo(@PathVariable String page){
		
		return page;
	}
	
}
