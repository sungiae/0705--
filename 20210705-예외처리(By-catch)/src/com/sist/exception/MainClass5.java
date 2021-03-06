package com.sist.exception;
// 입출력 ==> 반드시 예외처리를 해야 된다
import java.io.FileReader;
// 반드시 예외처리 : java.io, java.net, java.sql, javax....(jdk1.2) => xml, web... 
/*
 *      public static void main(String[] args) {
 *         try
 *         {
 *            int a=10/0; => ArithmeticException => RuntimeException => Exception => Throwable
 *            System.out.println("Hello"); (X) (건너뛴다)
 *         }catch(NumberFormaException e){}
 *         catch(ArrayIndexOutOfBoundsException e){}
 *         catch(NullPointerException ex){}
 *         ===> 오류
 *         ArithmeticException => RuntimeException => Exception => Throwable 와 관련된 예외처리
 *         없으므로 오류
 *         =========================================================
 *         >> catch(Exception ex) {}  => 수행       default
 *         >> 마지막에 큰거 하나 넣어줘야함
 *         =========================================================
 *      }
 *      
 *      throws : 라이브러리 (자바에서 지원하는 메소드에서 구현이 가능)
 *      
 */
public class MainClass5 {

//	public static void main(String[] args) throws InterruptedException { ==> 선언
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 호출
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		FileReader fr=null;
		try{
			//예외 : 소스상에서 처리 할 수 있는 가벼운 에러 (  <==> 에러 : 파일깨짐, 파일보안...)
			int i=0; // 파일읽기 => 한글자씩 읽어 온다 (한글자는 정수로 되어있으므로) =>  char변환해서 처리
			         // -1 EOF(End Of File)
			fr=new FileReader("c:\\javaDev\\text.txt");
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
		}catch(Exception ex) {
			//오류 처리 => 경로명, 파일명이 틀렸을 때 => 수정이 가능
			ex.printStackTrace(); // 오류 확인
		}
		finally
		{
			//파일 닫기
			try {
				fr.close();
			}catch(Exception ex) {
				
			}
		}
	*/
		// try-with-resource => file, 오라클 try(객체생성) => try{}이 종료하면 자동 close()를 호출
		try(FileReader fr=new FileReader("c:\\javaDev\\text.txt")) // fr.close()가 자동으로 호출된다
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
