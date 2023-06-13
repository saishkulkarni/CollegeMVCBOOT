package org.jsp.jesa5.helper;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.jsp.jesa5.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class SendMail {

	@Autowired
	JavaMailSender mailSender;

	@Autowired
	Configuration configuration;

	public void send(Student student) {
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);

		try {
			helper.setFrom("saishkulkarni7@gmail.com");
			helper.setTo(student.getEmail());
			helper.setSubject("Login");
			helper.setText("<h1>Loo Vikasaaa</h1>",true);

			mailSender.send(message);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	public String getEmailContent(Student student) {
			StringWriter writer = new StringWriter();
			Map<String, Object> model = new HashMap();
			model.put("merchant", student);
			try {
				configuration.getTemplate("Merchant-email-template.ftl").process(model, writer);
			} catch (TemplateException | IOException e) {
				e.printStackTrace();
			}
			return writer.getBuffer().toString();
	}

}
