package firstGit1;

public class game3 {

	public static void main(String[] args) {
		전사 a전사 = new 전사();
		String 전사이름 = "칸";
		a전사.이름 = 전사이름;
		a전사.성격 = "상냥함";
		a전사.나이 = 10;
		a전사.취미 = "뜨개질";
		a전사.고향 = "몽고 초원";
		
		무기 a무기 = new 무기();

		a전사.a무기 = a무기;
		
		a전사.공격();
		// 출력 : 무기로 공격합니다.
		
		// 출력 : 공격합니다.
		a전사.걷다();
		// 출력 : 걷습니다.
	}
}
class 전사 {
	// 변수 만들기
	int 나이;
	String 이름;
	String 성격;
	String 취미;
	String 고향;
	무기 a무기;
	
	// 함수 만들기
	void 공격() {
		// 무기를 사용해보세요.
		a무기.사용();
		// 같은 식구 끼리는 `this.` 으로 접근가능
		System.out.println(this.이름 + "이(가) 무기를 사용합니다.");
	}
	
	// 함수 만들기
	void 걷다() {
		System.out.println("걷습니다.");
	}
}
class 무기 {
	// 함수 만들기
	void 사용() {
		System.out.println("무기로 공격합니다.");
	}
}
