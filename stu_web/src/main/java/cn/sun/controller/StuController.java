package cn.sun.controller;

import cn.sun.entity.Classes;
import cn.sun.entity.Student;
import cn.sun.serviceimpl.IClassService;
import cn.sun.serviceimpl.IStuService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @aothor Sun
 * @date 2020-06-25 17:52
 */


@Controller
@RequestMapping("/stu")
public class StuController {
    @Reference
    private IClassService iClassService;
    @Reference
    private IStuService iStuService;

    /**跳转到添加学生的页面*/
    @RequestMapping("/toInsert")
    public String insertStu(Model model){
        List<Classes> list = iClassService.queryAll();
        model.addAttribute("classes", list);
        return "stuadd";
    }

    /**添加学生点击提交*/
    @RequestMapping("/insert")
    public void insert(Student student, HttpServletResponse response) throws IOException {
        int num = iStuService.insert(student);
        response.sendRedirect("http://192.168.82.101:8080/stu/list");
     //   return "stuadd";
    }

    @RequestMapping("/list")
    public String list(Model model){
        List<Student> list = iStuService.stuList();
        model.addAttribute("stulist", list);
        return "stulist";
    }



}
