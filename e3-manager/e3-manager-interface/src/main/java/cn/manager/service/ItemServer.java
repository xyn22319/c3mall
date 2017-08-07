package cn.manager.service;

import e3.common.pojo.EasyUIResult;
import e3.manager.pojo.TbItem;

public interface ItemServer {

	TbItem find(Integer i);

	EasyUIResult findAll(int page, int rows);

}
