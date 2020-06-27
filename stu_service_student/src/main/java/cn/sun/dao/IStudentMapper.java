package cn.sun.dao;

import cn.sun.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

/**
 * @aothor Sun
 * @date 2020-06-26 17:23
 */
public interface IStudentMapper extends BaseMapper<Student>{

    int inserts(Student student);

}
