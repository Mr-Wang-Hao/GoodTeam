package com.wh.test.test01;
/*
 * 该案例展示了mybatis中多对一关系
 */
import java.util.*;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.*;
import com.wh.pojo.*;
public class Test04 {
	
		public static void main(String[]rag)throws Exception {
				String url ="mybatis-config.xml";
				InputStream is=Resources.getResourceAsStream(url);
				SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(is);
				SqlSession ss=factory.openSession();
				List<Student> list=ss.selectList("selectStudent");
				lookList(list);
		}
		
		public static void lookList(List<Student> list) {
				if(list!=null) {
					for(Student s:list) {
						System.out.println(s);
					}
				}
		}
}
