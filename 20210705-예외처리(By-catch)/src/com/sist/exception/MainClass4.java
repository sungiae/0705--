package com.sist.exception;
/*
 *   try~catch
 *   �޼ҵ�() throws ���� ==> ��� ����ó�� Ŭ���� => Exception
 *   
 *   ��)
 *        void display() throws IOException, SQLException,...
 *                              =========================
 *                           1. CheckException => �����Ͻÿ� ����ó�� Ȯ�� (�ݵ�� ����ó���ؾ� �ȴ�)
 *                                IOException : ����
 *                                SQLException : ����Ŭ
 *                                MalformedURLException : ��Ʈ��ũ
 *                                InterruptedException : ������
 *                                ClassNotFoundException : ��Ű��
 *                                
 *                           2. UnCheckException
 *                              =================
 *                              RuntimeException : java(����� => �ҽ��� ���پ� �о ���� : ����������)
 *                                |
 *                                ArithmathException
 *                                NumberFormatException
 *                                NullPointerException
 *                                ArrayIndexOutOfBoundsException
 *                                ============================== ����ó���� ���� �� �� �ִ�
 *                                �ʿ��Ҷ� ����ó���� �Ѵ� (���ֿ��� �߻��ϴ� ����=����ó���� �� �� �ִ�)
 *        => ȣ���ϴ� �޼ҵ忡�� ó��
 *        public static void main(String[] arg)
 *        {
 *           display(); ==> ���� �߻�
 *        }
 *        
 *        1.
 *        public static void main(String[] arg) throws IOException, SQLException,...
 *        {
 *           display(); ==> ���� �߻�
 *        }
 *        
 *        2. �����ϴ� ū �� ������
 *        public static void main(String[] arg) throws Exception
 *        {
 *           display(); ==> ���� �߻�
 *        }
 *        
 *        3.
 *        public static void main(String[] arg) 
 *        {
 *           try{
 *               display();
 *           }catch(IOException e){}
 *            catch(SQLException e){}
 *        }
 *        
 *        4.
 *        public static void main(String[] arg) 
 *        {
 *           try{
 *               display();
 *           }catch(Exception e){}
 *        }
 *        
 *        * �޼ҵ� �ڿ� ����ó���� ����Ǿ� ������
 *          1) ���α׷��Ӱ� �ٽ� ���� �� �� �ִ� (public static void main(String[] arg) throws Exception)
 *          2) ���� ó�� �� ��� �� �� �ִ�
 *          ***** �ݵ�� ���� ó���� ��� �ؾ� �ȴ�
 *        * ���ܰ� ������ �ִ� ��쿡�� ū ����ó���� ó���� �����ϴ�
 *                                ========= Throwsable(Error, Exception), Exception(����ó���� ����)
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
