package cn.sun.springboot_mail;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.util.Date;
@SpringBootTest
class SpringbootMailApplicationTests {
	@Autowired
	private JavaMailSender javaMailSender;
	@Test
	void contextLoads() throws MessagingException, UnsupportedEncodingException {

	    //创建一封邮件
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        //创建一个spring提供的邮件帮助对象
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);

        //设置发送方
        helper.setFrom("guodong_166@163.com");
        /*设置邮件接收方
        * addTo:普通接收方
        * addCc：抄送方
        * addBcc：密送方*/
        helper.addTo("422792306@qq.com","发送方别名");
        helper.setSubject("设置邮件标题");
        helper.setText("发送的邮件内容"+new Date());

//        设置邮件发送的时间
        helper.setSentDate(new Date());

        //发送邮件
        javaMailSender.send(mimeMessage);



    }

}
