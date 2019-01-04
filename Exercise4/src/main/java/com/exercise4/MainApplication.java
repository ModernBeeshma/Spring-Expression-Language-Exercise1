//Refer Collections.

package com.exercise4;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.exercise4.model.MarkSheet;
import com.exercise4.model.Result;
public class MainApplication {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Bean.xml");
		Result rs=ctx.getBean("result",Result.class);
		System.out.println("------------Names----------");
		System.out.println("Names:"+rs.getNames());
		List<MarkSheet> res1=rs.getFailed();
		System.out.println("------------Failed Students----------");
		for(MarkSheet ms:res1)
			System.out.println(ms.getName()+" "+ms.getMark());
		System.out.println("------------Third Student----------");
		MarkSheet m=rs.getStudentThree(); 
		System.out.println(m.getName()+" "+m.getMark());
	}
}