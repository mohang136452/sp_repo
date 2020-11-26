package cn.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 用户实体类pojo
 */
@Data //lomnok注释，相当于get/set/toString
@NoArgsConstructor //无参构造方法
@AllArgsConstructor //全参构造方法
public class User {
    private Integer id; //用户id
    private String username; //用户名
    private String password; //密码
}