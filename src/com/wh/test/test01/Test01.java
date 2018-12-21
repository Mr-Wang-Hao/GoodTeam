package com.wh.test.test01;
/*
 * �ð���չʾ��Mybatis�Ļ������÷�
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
				//���������ļ� mybatis-config.xml��ȡ SqlSessionFactory(�Ự����)
				String url="mybatis-config.xml";
				try {
					InputStream is=Resources.getResourceAsStream(url);
					SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
					//����SqlSessionFacotry �õ�Session 
					SqlSession ss=factory.openSession();
					List<Student> list=ss.getMapper(StudentMapper.class).selectStudent();
					for(Student s:list) {
						System.out.println(s);
					}
				} catch (IOException e) {
					System.out.println("��ȡ��Դʧ��");
					e.printStackTrace();
				}

			}
}
