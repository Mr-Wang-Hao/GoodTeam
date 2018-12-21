package com.wh.test.test01;
/*
 * 该案例演示了多对多
 */
import java.util.*;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.*;
import com.wh.pojo.*;
public class Test05 {
	
		public static void main(String []args)throws Exception {
				String url="mybatis-config.xml";
				InputStream is=Resources.getResourceAsStream(url);
				SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(is);
				SqlSession ss=factory.openSession();
				List<Book> list=ss.selectList("selectBook");
				lookList(list);
		}
	
		public static void lookList(List<Book> list) {
			for(Book b:list) {
				System.out.print("["+b.getBookName()+"]"+"\t");
				for(BookType bt:b.getBookTypeList()) {
					System.out.print(bt.getTypeName()+"\t");
				}
				System.out.println();
			}
		}
}
