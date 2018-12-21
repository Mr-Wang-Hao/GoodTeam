package com.wh.test.test01;
/*
 * 该案例展示了Mybatis的基础的用法
 */
import com.wh.pojo.*;
import java.io.*;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class Test01 {
	
			public static void main(String[]args) {
				//根据配置文件 mybatis-config.xml获取 SqlSessionFactory(会话工厂)
				String url="mybatis-config.xml";
				try {
					InputStream is=Resources.getResourceAsStream(url);
					SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
					//根据SqlSessionFacotry 得到Session 
					SqlSession ss=factory.openSession();
					List<Student> list=ss.getMapper(StudentMapper.class).selectStudent();
					for(Student s:list) {
						System.out.println(s);
					}
				} catch (IOException e) {
					System.out.println("获取资源失败");
					e.printStackTrace();
				}

			}
}
