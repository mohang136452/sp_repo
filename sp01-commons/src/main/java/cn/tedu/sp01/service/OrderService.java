package cn.tedu.sp01.service;


import cn.tedu.sp01.pojo.Order;
/**
 * 订单相关的service接口
 *
 */
public interface OrderService {
    //根据订单id查询订单信息接口
    Order getOrder(String orderId);
  //添加订单接口
    void addOrder(Order order);
}