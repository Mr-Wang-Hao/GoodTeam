package com.wh.pojo;
/*
 *	 年级实体类
 */
import java.util.*;
public class Grade {
		private int id;//id
		private String gradeName;//年级名称
		private List<Student> studentList;//学生
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getGradeName() {
			return gradeName;
		}
		public void setGradeName(String gradeName) {
			this.gradeName = gradeName;
		}
		public List<Student> getStudentList() {
			return studentList;
		}
		public void setStudentList(List<Student> studentList) {
			this.studentList = studentList;
		}
		
		
		@Override
		public String toString() {
			return "Grade [id=" + id + ", gradeName=" + gradeName + ", studentList=" + studentList + "]";
		}
		
		 
		
		
		
}
