package cn.tedu.sp01.service;
import java.util.List;

import cn.tedu.sp01.pojo.Item;
/**
 * ItemService接口
 */
public interface ItemService {
	//通过订单id查询商品信息接口
	List<Item> getItems(String orderId);
	//减少库存数量接口
	void decreaseNumbers(List<Item> list);
}