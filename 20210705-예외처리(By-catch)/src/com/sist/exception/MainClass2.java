package com.sist.exception;
/*
 *    throws : ���� ȸ��, ���� ó��
 *    ======
 *      ����Ǵ� ������ �̷� �͵��� �ִ�, �׳� �Ѿ�� (�ý��ۿ� ���ؼ� ó��) <---> try ~ catch
 *    ����) ������ �޼ҵ��() throws ����ó������.......
 *                               NumberFormatException, NullPointerException,Exception...
 *                               ========================================================
 *                                  ������ �������� �ʴ´�
 *         => throws�� �� �ִ� �޼ҵ带 ȣ���Ҷ� (ȣ���ؼ� ����ϴ� �޼ҵ忡�� ó��)
 *            => ȸ��
 *            => ����ó��
 *            
 *         ���ܰ� �߻� : ArrayIndexOutOfException ==> �迭�� ū ��� ==> �ε�����ȣ ������ �߻� �� �� �ִ�
 *         public static void display1() throws ArrayIndexOutOfException // RuntimeException ���� �� ����
 *         {
 *         }
 *         
 *         public static void display2() throws Exception // �����Ͽ��� => ���߿� ȣ��� ����ó���ϰ� ����ϰڴ� (����ó�� ���ϸ� ����)
 *         {
 *         }
 *         
 *         public static void main(String[] arg)
 *         {
 *         		display1(); // ����ó���� ���� �ʰ� ����ص� ������ ����
 *         		display2(); // ����ó���� ���� �ʰ� ����ϸ� ������ �߻�
 *                  ��
 *                  ��
 *                  ��
 *              try // ������ �� �� ����ó���ؾ��Ѵ�
 *              {	
 *                 display2(); 
 *              }catch(Exception ex){}
 *               
 *         }
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
