package com.wh.test.test02;
/*
 *   �ð���չʾ�˶�̬SQL if���÷�
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
			//ͨ�������ļ���ȡSqlSessionFactory ����
			String url="mybatis-config.xml";
			InputStream is =Resources.getResourceAsStream(url);
			SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
			//��ȡSqlSession ����
			SqlSession ss=factory.openSession();
			Student stu=new Student();
		/*	stu.setStudentName("����");*/
			List<Student> list=ss.selectList("selectStudentIf",stu);
			lookList(list);
		}
		public static void lookList(List<Student> list) {
				for(Student s:list) {
					System.out.println(s);
				}
		}
}
