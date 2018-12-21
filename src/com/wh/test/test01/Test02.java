package com.wh.test.test01;
/*
 * ������ɾ���  �Լ������ѯʵ��
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
					//����mybatis-config.xml�����ļ���ȡSqlSessionFactory;
					String url="mybatis-config.xml";
					try {
						InputStream is=Resources.getResourceAsStream(url);
						//ͨ�����������߻�ȡ����
						SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
						//ͨ��������ȡSqlSessio
						SqlSession ss=factory.openSession();
						//����Ҫ����Ҫ��ӵ����� ʵ�������
					/*	Student s=new Student();
						s.setStudentName("��ԲԲ");
						ss.insert("addStudent",s);*/
					/*	Student s=new Student();
						s.setId(10);
						ss.delete("deleteStudent",s);*/
					/*	Student s=new Student();
						s.setId(3);
						s.setStudentName("���ں�");
						int list=ss.update("updateStudent",s);
						if(list>0) {
							System.out.println("�޸ĳɹ���");
						}*/
					/*	List<Student> list=ss.selectList("selectStdent","�����");
						LookList(list);*/
						Map<String,Object> m=new HashMap<String,Object>();
						m.put("id",4);
						m.put("studentName", "�����");
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
