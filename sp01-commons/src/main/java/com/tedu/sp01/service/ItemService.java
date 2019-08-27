package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
/**
 * 通过订单id获取商品；列表
 * @param orderId
 * @return
 */
	List<Item> getItems(String orderId);
	/**
	 * 在保存订单时减少库存
	 * @param list
	 */
	void decreaseNumbers(List<Item> list);
}
