//Refer logical expressions.

package com.exercise3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.exercise3.model.MarkSheet;
import com.exercise3.model.Result;
public class LogicalApplication {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Bean.xml");
		Result rs=ctx.getBean("result",Result.class);
		MarkSheet m=ctx.getBean("s1",MarkSheet.class);
		System.out.println("Name:"+m.getName());
		System.out.println("Physics:"+m.getPhysics());
		System.out.println("Chemistry:"+m.getChemistry());
		System.out.println("Math:"+m.getMath());
		System.out.println("Result:"+rs.getResult()+" "+rs.getMessage());
	}
}