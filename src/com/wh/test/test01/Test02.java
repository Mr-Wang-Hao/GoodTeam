package com.wh.test.test01;
/*
 * 基础增删查改  以及更多查询实例
 */
import java.util.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.wh.pojo.Student;

import java.io.*;
public class Test02 {
	
			public static void main(String[]args) {
					//根据mybatis-config.xml配置文件获取SqlSessionFactory;
					String url="mybatis-config.xml";
					try {
						InputStream is=Resources.getResourceAsStream(url);
						//通过工厂制造者获取工厂
						SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
						//通过工厂获取SqlSessio
						SqlSession ss=factory.openSession();
						//创建要给需要添加的数据 实体类对象
					/*	Student s=new Student();
						s.setStudentName("陈圆圆");
						ss.insert("addStudent",s);*/
					/*	Student s=new Student();
						s.setId(10);
						ss.delete("deleteStudent",s);*/
					/*	Student s=new Student();
						s.setId(3);
						s.setStudentName("白宗海");
						int list=ss.update("updateStudent",s);
						if(list>0) {
							System.out.println("修改成功！");
						}*/
					/*	List<Student> list=ss.selectList("selectStdent","李佳乐");
						LookList(list);*/
						Map<String,Object> m=new HashMap<String,Object>();
						m.put("id",4);
						m.put("studentName", "李佳乐");
						List<Student> list=ss.selectList("selectStdent",m);
						LookList(list);
						ss.commit();
					} catch (IOException e) {
						e.printStackTrace();
					}
					
			}
			
			public static void LookList(List<Student> list){
					for(Student s:list) {
						System.out.println(s);
					}
			}
}
