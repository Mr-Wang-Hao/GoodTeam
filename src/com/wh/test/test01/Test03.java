package com.wh.test.test01;
/*
 * �ð�����ʾ��Mybatis�е�һ�Զ��ϵ
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
			//����mybatis-config.xml ���������ļ���ȡ SqlSessionFactory 
			String url="mybatis-config.xml";
			InputStream is;
			try {
				is = Resources.getResourceAsStream(url);
				SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
				//ͨ��SqlSessionFactory ��ȡSqlSessio����
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
