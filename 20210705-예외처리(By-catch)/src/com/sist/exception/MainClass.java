package com.sist.exception;
/*
 *    직접처리 : 프로그래머가 에러 발생시 에러를 처리하는 과정
 *    try ~ catch ~ finally (서버닫기, 쓰레드종료, 파일닫기)
 *          ===== 에러 복구 => 정상수행을 할 수 있게 만들어 준다
 *    ==== 정상 수해을 할 수 있는 소스코딩
 *    ** 에러에 대한 처리 (예상된 에러를 처리하기 위해 대비하는 프로그램)
 *    
 *    직접 발생 : 테스트 (견고한 프로그램을 제작) => 신뢰성
 *    => throw : 사용자 정의 예외처리를 만들었을 경우에 사용
 *               =========
 *               예) 메소드 : 사용자 정의
 *                  클래스 : 사용자 정의
 *                  데이터형 : 사용자 정의
 *                  예외처리 : 사용자 정의
 *                  ================== 라이브러리 Emp데이터형 (지원하지 않는 데이터형 : 우리 프로그램에 맞게)
 *                  40% 라이브러리
 *                  60% 사용자 정의
 *                  => 데이터형, 클래스, 메소드, 예외처리 직접제작
 *                     ===================================
 *    
 */
public class MainClass {

	public static void main(String[] args) {
		try {
			int a=10;
			if(a%2==0) {
				// 에러를 발생한다
				throw new Exception(a+"는 짝수입니다"); // throw는 catch절을 호출하는 명령어다
			}
		}catch(Exception ex) {
			System.out.println("Exception => catch절 수행");
			System.out.println(ex.getMessage());
		}
	}

}
