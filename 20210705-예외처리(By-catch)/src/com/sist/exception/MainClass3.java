package com.sist.exception;

public class MainClass3 {
	// 이런 에러들이 나올 수 있으니 처리해서 써라
	/*
	 * NumberFormatException,ArithmeticException, NumberFormatException 선언 => 처리 시기
	 * : display를 호출 할 때 처리 try { display() }catch(Exception e){}
	 * 
	 * 나중에 처리한다 => 사용자가 처리 void main() throws
	 * NumberFormatException,ArithmeticException, NumberFormatException { }
	 */
	
	// 예외를 선언 (throws) ==> 다음에 메소드 호출시에 처리
	/*
	 *    메소드 호출시에 처리
	 *      = 선언 => 다시 호출시에 처리 => throws
	 *      = 직접처리해서 사용         => try ~ catch
	 *      = 예상되는 에러가 여러개 있는 경우 ==> Exception으로 처리 할 수 있다
	 *      = 선언시에는 예외처리 순서가 존재하지 않는다
	 *      = 라이브러리에서 예외처리를 선언하고 있다
	 *        ========
	 *        라이브러리 사용시에 try~catch, throws (단점 => 복구가 안된다, 정상 종료는 가능 하다)
	 *                       ========== catch에서 에러 복구 (가급적이면 try~catch 사용을 권장)
	 */
	public void display() throws NumberFormatException, ArithmeticException, NumberFormatException, Exception {
		System.out.println("Hello");
	}

	public static void main(String[] args) throws Exception{
		MainClass3 m=new MainClass3();
		// NumberFormatException,ArithmeticException, NumberFormatException
		// RuntimeException => 생략이 가능하다
		/*
		try {
			m.display();
		}catch(NumberFormatException e) {}
		catch(ArithmeticException e) {}
		catch(NullPointerException e) {}
		catch(Exception e) {} // 멀티 catch
		*/
		
		try {
			m.display();
		}catch(Exception e) {
//			???????????
		}
//		???????????????????????
}

}
