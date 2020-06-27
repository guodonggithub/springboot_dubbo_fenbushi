package cn.sun.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.lang.reflect.Parameter;
import java.util.Date;

/**
 * @aothor Sun
 * @date 2020-06-25 17:05
 */

@Data//getset方法
@AllArgsConstructor//全参构造
@NoArgsConstructor//无参构造

public class Student implements Serializable{


    /**设置id自增长*/
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;
    private Integer age;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private Integer cid;
    /**表示当前属性不是数据库的字段，但在项目中必须使用*/
    @TableField(exist = false)
    private Classes classes;


}

