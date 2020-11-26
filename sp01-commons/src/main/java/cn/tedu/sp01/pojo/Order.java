package cn.tedu.sp01.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //lomnok注释，相当于get/set/toString
@NoArgsConstructor //无参构造方法
@AllArgsConstructor //全参构造方法
public class Order {
    private String id; //订单主键id
    private User user;  //用户信息
    private List<Item> items; //商品item信息 多个，用List集合接收
}