package cn.sun.serviceimpl;

import cn.sun.dao.IStudentMapper;
import cn.sun.entity.Classes;
import cn.sun.entity.Student;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @aothor Sun
 * @date 2020-06-26 17:21
 */
@Service
public class StudentImpl implements IStuService {


    @Autowired
    private IStudentMapper iStudentMapper;
    @Reference
    private IClassService iClassService;

    @Override
    public int insert(Student student) {
        int num = iStudentMapper.insert(student);
        return num;
    }

    @Override
    public List<Student> stuList() {
        List<Student> students = iStudentMapper.selectList(null);

        for(Student stu : students){
            Classes classes = iClassService.queryById(stu.getCid());
            stu.setClasses(classes);
        }

        return students;
    }


}
