package com.sist.exception;
// ����� ==> �ݵ�� ����ó���� �ؾ� �ȴ�
import java.io.FileReader;
// �ݵ�� ����ó�� : java.io, java.net, java.sql, javax....(jdk1.2) => xml, web... 
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		FileReader fr=null;
		try{
			//���� : �ҽ��󿡼� ó�� �� �� �ִ� ������ ���� (  <==> ���� : ���ϱ���, ���Ϻ���...)
			int i=0; // �����б� => �ѱ��ھ� �о� �´� (�ѱ��ڴ� ������ �Ǿ������Ƿ�) =>  char��ȯ�ؼ� ó��
			         // -1 EOF(End Of File)
			fr=new FileReader("c:\\javaDev\\text.txt");
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
		}catch(Exception ex) {
			//���� ó�� => ��θ�, ���ϸ��� Ʋ���� �� => ������ ����
			ex.printStackTrace(); // ���� Ȯ��
		}
		finally
		{
			//���� �ݱ�
			try {
				fr.close();
			}catch(Exception ex) {
				
			}
		}
	*/
		// try-with-resource => file, ����Ŭ try(��ü����) => try{}�� �����ϸ� �ڵ� close()�� ȣ��
		try(FileReader fr=new FileReader("c:\\javaDev\\text.txt")) // fr.close()�� �ڵ����� ȣ��ȴ�
		{
			int i=0;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
