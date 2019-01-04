//Refer Regular expression.

package com.exercise5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.exercise5.model.MailCheck;
import com.exercise5.model.Result;
public class Application {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Bean.xml");
		Result rs=ctx.getBean("result",Result.class);
		
		System.out.println("Result:"+rs.getResult());
	}
}