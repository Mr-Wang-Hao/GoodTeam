package com.wh.test.test02;
/*
 *   该案例展示了动态SQL if的用法
 */
import java.util.*;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.*;
import com.wh.pojo.*;
public class Test01 {
			
		public static void main(String []args)throws Exception {
			//通过配置文件获取SqlSessionFactory 对象
			String url="mybatis-config.xml";
			InputStream is =Resources.getResourceAsStream(url);
			SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
			//获取SqlSession 对象
			SqlSession ss=factory.openSession();
			Student stu=new Student();
		/*	stu.setStudentName("王豪");*/
			List<Student> list=ss.selectList("selectStudentIf",stu);
			lookList(list);
		}
		public static void lookList(List<Student> list) {
				for(Student s:list) {
					System.out.println(s);
				}
		}
}
