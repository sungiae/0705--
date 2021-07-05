package com.sist.exception;

public class MainClass3 {
	// �̷� �������� ���� �� ������ ó���ؼ� ���
	/*
	 * NumberFormatException,ArithmeticException, NumberFormatException ���� => ó�� �ñ�
	 * : display�� ȣ�� �� �� ó�� try { display() }catch(Exception e){}
	 * 
	 * ���߿� ó���Ѵ� => ����ڰ� ó�� void main() throws
	 * NumberFormatException,ArithmeticException, NumberFormatException { }
	 */
	
	// ���ܸ� ���� (throws) ==> ������ �޼ҵ� ȣ��ÿ� ó��
	/*
	 *    �޼ҵ� ȣ��ÿ� ó��
	 *      = ���� => �ٽ� ȣ��ÿ� ó�� => throws
	 *      = ����ó���ؼ� ���         => try ~ catch
	 *      = ����Ǵ� ������ ������ �ִ� ��� ==> Exception���� ó�� �� �� �ִ�
	 *      = ����ÿ��� ����ó�� ������ �������� �ʴ´�
	 *      = ���̺귯������ ����ó���� �����ϰ� �ִ�
	 *        ========
	 *        ���̺귯�� ���ÿ� try~catch, throws (���� => ������ �ȵȴ�, ���� ����� ���� �ϴ�)
	 *                       ========== catch���� ���� ���� (�������̸� try~catch ����� ����)
	 */
	public void display() throws NumberFormatException, ArithmeticException, NumberFormatException, Exception {
		System.out.println("Hello");
	}

	public static void main(String[] args) throws Exception{
		MainClass3 m=new MainClass3();
		// NumberFormatException,ArithmeticException, NumberFormatException
		// RuntimeException => ������ �����ϴ�
		/*
		try {
			m.display();
		}catch(NumberFormatException e) {}
		catch(ArithmeticException e) {}
		catch(NullPointerException e) {}
		catch(Exception e) {} // ��Ƽ catch
		*/
		
		try {
			m.display();
		}catch(Exception e) {
//			???????????
		}
//		???????????????????????
}

}
