package cn.manager.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.manager.service.ItemServer;
import e3.common.pojo.EasyUIResult;
import e3.manager.mapper.TbItemMapper;
import e3.manager.pojo.TbItem;
import e3.manager.pojo.TbItemExample;

@Service("itemServerImpl")
public class ItemServerImpl implements ItemServer{

	@Autowired
	private TbItemMapper tbItem;
	@Override
	public TbItem find(Integer id) {
		
		long value = id.longValue();
		return tbItem.selectByPrimaryKey(value);
	}
	@Override
	public EasyUIResult findAll(int page, int rows) {
		PageHelper pageHelper = new PageHelper();
		pageHelper.startPage(page, rows);
		List<TbItem> list = tbItem.selectByExample(new TbItemExample());
		PageInfo<TbItem> info = new PageInfo<>(list);
		EasyUIResult result = new EasyUIResult(info.getTotal(),list);
		return result;
	}

}
