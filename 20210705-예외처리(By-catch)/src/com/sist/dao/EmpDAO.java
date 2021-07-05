package com.sist.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
 *    �ڹ��������α׷�  <===========> ����Ŭ
 *                                ������ ����
 *    ==> ��Ʈ��ũ (�ݵ�� ����ó�� �ؾ� �ȴ�)
 *    1. ����̹� ����
 *    2. ����
 *    3. SQL���� ����
 *    4. ����� �ޱ�
 *    5. ���� ���� 
 */
public class EmpDAO {
	private Connection conn; // ����Ŭ ���� => ���� Ŭ����
	private PreparedStatement ps; // SQL���� ���� => ������� �޾ƿ´�
	
	// ����Ŭ���� ������� ��������
	private final String URL="jdbc:oracle:thin:@211.238.142.181:1521:XE"; // ����Ŭ �ּ�
    // XE : �����ͺ��̽� (�������(����) ==> ����, �����ͺ��̽� => ���̺�)
	
	// �ʱ�ȭ : ����̹� ��� => ����(������ �ƴϹǷ� Ŭ�������� �Ұ�) (������ �̿�)
	public EmpDAO()
	{
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver"); // ClassNotFoundException (������)
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	// ����
	public void getConnection() {
		try {
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	// ��������
	public void disConnection() {
		try {
			if(ps!=null)
				ps.close(); // ��ż�
			if(conn!=null)
				conn.close(); // ������ �Ǿ� �ִٸ� => ���� => ��ȭ��
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public Emp[] empAllData() {
		Emp[] emp=new Emp[14]; //������ �迭 => ArrayList
		try {
			// ����
			getConnection();
			String sql="SELECT empno, ename, job, sal, FROM emp"; // SQL (������ �˻� : SELECT)
			// ����Ŭ�� ������ ����
			ps=conn.prepareStatement(sql);
			// ����� �б�
			ResultSet rs=ps.executeQuery();
			int i=0;
			while(rs.next())
			{
				emp[i]=new Emp();
				emp[i].setEmpno(rs.getInt(1));
				emp[i].setEname(rs.getString(2));
				emp[i].setJob(rs.getString(3));
				emp[i].setSal(rs.getInt(4));
				i++;
			}
			rs.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		finally // ������ ���๮�� => ��������, ���� �ݱ� ==> ����Ŭ ���� ���� ����
		{
			disConnection();
		}
		
		return emp;
	}
}
