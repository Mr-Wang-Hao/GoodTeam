package com.wh.pojo;
/*
 * 学生实体类
 */
public class Student {
		private int id;//学生id
		private String studentName;//学生姓名
		private Grade grade;//所属年级
		
		
		public Grade getGrade() {
			return grade;
		}
		public void setGrade(Grade grade) {
			this.grade = grade;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		
		
		@Override
		public String toString() {
			return "Student [id=" + id + ", studentName=" + studentName + ", grade=" + grade + "]";
		}
		
		
		
		
}
