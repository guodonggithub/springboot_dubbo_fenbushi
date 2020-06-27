package cn.sun.serviceimpl;

import cn.sun.dao.ClassMapper;
import cn.sun.entity.Classes;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @aothor Sun
 * @date 2020-06-25 18:39
 */
@Service
public class ClassServiceImpl implements IClassService{
    @Autowired
    private ClassMapper classMapper;
    @Override
    public List<Classes> queryAll() {
        return classMapper.selectList(null);
    }

    @Override
    public Classes queryById(Integer id) {
        return classMapper.selectById(id);
    }
}
