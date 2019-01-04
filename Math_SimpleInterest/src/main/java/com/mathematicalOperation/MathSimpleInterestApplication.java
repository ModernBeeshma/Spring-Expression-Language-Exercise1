//3. Refer mathematical operations. 

package com.mathematicalOperation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mathematicalOperation.model.Result;
public class MathSimpleInterestApplication {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Bean.xml");
		Result rs=ctx.getBean("result",Result.class);
		System.out.println("Simple Interest:"+rs.getSimpleInterest());
	}
}