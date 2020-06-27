package cn.sun.serviceimpl;

import cn.sun.entity.Student;

import java.util.List;

/**
 * @aothor Sun
 * @date 2020-06-26 17:16
 */
public interface IStuService {

    /**添加学生的服务*/
    int insert(Student student);
    /**查询所有学生*/
    List<Student> stuList();
}
