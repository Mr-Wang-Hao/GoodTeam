package com.wh.pojo;
/*
 * ѧ��ʵ����
 */
public class Student {
		private int id;//ѧ��id
		private String studentName;//ѧ������
		private Grade grade;//�����꼶
		
		
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
