package cn.sun.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @aothor Sun
 * @date 2020-06-25 17:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Classes implements Serializable{

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String cname;
    private Integer csum;
}
