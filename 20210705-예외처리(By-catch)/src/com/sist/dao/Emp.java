package com.sist.dao;
// ĸ��ȭ => ������ ����ȭ => ������ �޼ҵ�� ����
/*
 *   Emp ��� ���� (����Ŭ 14��)
 *   empno    : ���
 *   ename    : �̸�
 *   job      : ����
 *   mgr      : �����ȣ
 *   hiredate : �Ի���
 *   sal      : �޿� 
 *   comm     : ������
 *   deptno   : �μ���ȣ
 *   ==> ����Ŭ (����ó�� => ��Ʈ��ũ (������ ����)
 *   
 *   1. ��� 1�� ���� ���� ���� => ����� ���� �������� => ���� ���� (�б�(getter), ����(setter))
 *   
 */
public class Emp {
		
		// TODO Auto-generated method stub
		private int empno;
		private String ename;
		private String job;
		private int sal;
		private int comm;
		private int deptno;
//		source - General getters and setters
		public int getEmpno() {
			return empno;
		}
		public void setEmpno(int empno) {
			this.empno = empno;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public String getJob() {
			return job;
		}
		public void setJob(String job) {
			this.job = job;
		}
		public int getSal() {
			return sal;
		}
		public void setSal(int sal) {
			this.sal = sal;
		}
		public int getComm() {
			return comm;
		}
		public void setComm(int comm) {
			this.comm = comm;
		}
		public int getDeptno() {
			return deptno;
		}
		public void setDeptno(int deptno) {
			this.deptno = deptno;
		}

}
