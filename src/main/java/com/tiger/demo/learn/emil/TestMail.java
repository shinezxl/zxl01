package com.tiger.demo.learn.emil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

/**
 * https://www.cnblogs.com/zhangyinhua/p/9277684.html
 */
@Component
public class TestMail {
    public static final String MAIL_SENDER = "shinezxl@163.com";
    @Autowired
    private JavaMailSender javaMailSender;
    public static void main(String[] args) {

    }


    public void sendSimpleMail(MailBean mailBean) {
        try {
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            //邮件发送人
            simpleMailMessage.setFrom(MAIL_SENDER);
            //邮件接收人
            simpleMailMessage.setTo(mailBean.getRecipient());
            //邮件主题
            simpleMailMessage.setSubject(mailBean.getSubject());
            //邮件内容
            simpleMailMessage.setText(mailBean.getContent());
            javaMailSender.send(simpleMailMessage);
        } catch (Exception e) {
//            logger.error("邮件发送失败", e.getMessage());
            e.printStackTrace();
        }
    }
}
