package com.sist.main;
// 패키지가 다르면 import를 사용한다 
import com.sist.dao.Emp;
import com.sist.dao.EmpDAO;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EmpDAO dao=new EmpDAO();
        Emp[] emp=dao.empAllData();// => 브라우저 
        for(Emp e:emp)
        {
        	System.out.println(e.getEmpno()+" "
        			+e.getEname()+" "
        			+e.getJob()+" "
        			+e.getSal()+" ");
        }
	}

}