package cn.manager.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.manager.service.ItemServer;
import e3.manager.mapper.TbItemMapper;
import e3.manager.pojo.TbItem;

@Service
public class ItemServerImpl implements ItemServer{

	@Autowired
	private TbItemMapper tbItem;
	@Override
	public TbItem find(Integer id) {
		
		long value = id.longValue();
		return tbItem.selectByPrimaryKey(value);
	}

}
