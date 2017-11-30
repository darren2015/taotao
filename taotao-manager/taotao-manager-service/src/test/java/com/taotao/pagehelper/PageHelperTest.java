package com.taotao.pagehelper;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;

public class PageHelperTest {
	
	@Test
	public void testPageHelper() {
		//配置插件
		//在执行查询之前设置分页参数
		PageHelper.startPage(1,30);
		//执行查询获取结果
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
		TbItemMapper tbItemMapper = ac.getBean(TbItemMapper.class);
		TbItemExample example = new TbItemExample();
		List<TbItem> list = tbItemMapper.selectByExample(example);
		PageInfo<TbItem> pageInfo = new PageInfo<TbItem>(list);
		System.out.println(pageInfo.getPageNum());
		System.out.println(pageInfo.getPageSize());
		List<TbItem> list2 = pageInfo.getList();
		for (TbItem tbItem : list2) {
			System.out.println(tbItem);
		}
		System.out.println(pageInfo);
	}
}
