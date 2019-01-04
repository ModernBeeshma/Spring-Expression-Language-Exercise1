//Refer Static class Example.

package com.exercise2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.exercise2.model.Result;
import com.exercise2.model.circleArea;
public class CircleAreaApplication {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Bean.xml");
		Result rs=ctx.getBean("result",Result.class);
		circleArea ca=ctx.getBean("area",circleArea.class);
		System.out.println("Radius"+ca.getRadius());
		System.out.println("Area:"+rs.getArea());
	}
}