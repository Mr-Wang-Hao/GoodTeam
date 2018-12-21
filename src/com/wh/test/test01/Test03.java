package com.wh.test.test01;
/*
 * 该案例演示了Mybatis中的一对多关系
 */
import java.util.*;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.wh.pojo.*;
import java.io.*;
public class Test03 {
	
		public static void main (String [] args) {
			//根据mybatis-config.xml 核心配置文件获取 SqlSessionFactory 
			String url="mybatis-config.xml";
			InputStream is;
			try {
				is = Resources.getResourceAsStream(url);
				SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
				//通过SqlSessionFactory 获取SqlSessio对象
				SqlSession ss=factory.openSession();
				List<Grade> list=ss.selectList("gradeList");
				lookList(list);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public static void lookList(List<Grade> list) {
			for(Grade g:list) {
				System.out.println(g);
			}
		}
}
