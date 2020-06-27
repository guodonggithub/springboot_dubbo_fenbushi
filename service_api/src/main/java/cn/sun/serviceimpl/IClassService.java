package cn.sun.serviceimpl;

import cn.sun.entity.Classes;

import java.util.List;

/**
 * @aothor Sun
 * @date 2020-06-25 18:28
 */
public interface IClassService {



    /**查询所有班级的函数*/
    List<Classes> queryAll();

    /**根据id查询班级*/
    Classes queryById(Integer id);




}
