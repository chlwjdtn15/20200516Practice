/*- D9 요구 : 현질기능을 추가한다. 로켓비행아이템을 추가하세요.*/
/*
class Main {
	public static void main(String[] args) {
		청둥오리 a청둥오리 = new 청둥오리();
		a청둥오리.날다();
		// 출력 : 오리가 날개로 날아갑니다.

		흰오리 a흰오리 = new 흰오리();
		a흰오리.날다();
		// 출력 : 오리가 날개로 날아갑니다.

		고무오리 a고무오리 = new 고무오리();
		a고무오리.날다();
		// 출력 : 저는 날 수 없어요. ㅜㅠ

		고무2오리 a고무2오리 = new 고무2오리();
		a고무2오리.날다();
		// 출력 : 저는 날 수 없어요. ㅜㅠ

		a고무2오리.a비행아이템 = new 로켓비행아이템();
		a고무2오리.날다();
		// 출력 : 로켓파워로 날아갑니다.
	}
}

abstract class 오리 {
	비행아이템 a비행아이템;

	오리() {
		a비행아이템 = new 날개비행아이템();
	}

	void 날다() {
		a비행아이템.작동();
	}
}

class 흰오리 extends 오리 {

}

class 청둥오리 extends 오리 {

}

class 고무오리 extends 오리 {
	고무오리() {
		a비행아이템 = new 못나는비행아이템();
	}
}

class 고무2오리 extends 오리 {
	고무2오리() {
		a비행아이템 = new 못나는비행아이템();
	}
}

abstract class 비행아이템 {
	abstract void 작동();
}

class 날개비행아이템 extends 비행아이템 {
	void 작동() {
		System.out.println("날개로 날아갑니다.");
	}
}

class 못나는비행아이템 extends 비행아이템 {
	void 작동() {
		System.out.println("저는 못 날아요 ㅠㅠ");
	}
}
class 로켓비행아이템 extends 비행아이템 {
	void 작동() {
		System.out.println("로켓파워로 날아갑니다.");
	}
}


class Main {
	public static void main(String[] args) {
		오리 a오리 = new 오리(); // 사람(); => 사람 클래스의 `사람` 생성자를 호출한다.
	}
}

class 오리 {

	오리() {
		System.out.println("오리가 태어났습니다.");
	}
	
	void 걷다() {
		System.out.println("오리가 걷습니다.");
	}
}
class Main {
	public static void main(String[] args) {
		사람 a사람 = new 사람();
		System.out.println(a사람.나이);
		// 출력 : 20
	}
}

class 사람 {
	int 나이;
	
	사람() {
		나이 = 20;
	}
}

class Main {
	public static void main(String[] args) {
		사람 a사람 = new 사람();
		System.out.println(a사람.나이);
		// 출력 : 20
		System.out.println(a사람.이름);
		// 출력 : 홍길동
		System.out.println(a사람.고향);
		// 출력 : 한양
		System.out.println(a사람.성격);
		// 출력 : 착함
	}
}

class 사람 {
	int 나이;
	String 이름;
	String 고향;
	String 성격;
	
	사람() {
		this.나이 = 20;
		this.이름 = "홍길동";
		this.고향 = "한양";
		this.성격  = "착함";
		
	}
}

class Main {
	public static void main(String[] args) {
		사람 a사람 = new 사람("홍길순", 22, "함경도", "예민함");
		System.out.println(a사람.나이);
		// 출력 : 22
		System.out.println(a사람.이름);
		// 출력 : 홍길순
		System.out.println(a사람.고향);
		// 출력 : 함경도
		System.out.println(a사람.성격);
		// 출력 : 예민함
		
		사람 a사람2 = new 사람("임꺽정", 50, "충청도", "호탕함");
		System.out.println(a사람2.나이);
		// 출력 : 50
		System.out.println(a사람2.이름);
		// 출력 : 임꺽정
		System.out.println(a사람2.고향);
		// 출력 : 충청도
		System.out.println(a사람2.성격);
		// 출력 : 호탕함
	}
}

class 사람 {
	int 나이;
	String 이름;
	String 고향;
	String 성격;
	
	사람(String 이름, int 나이, String 고향, String 성격) {
		this.나이 = 나이;
		this.이름 = 이름;
		this.고향 = 고향;
		this.성격 = 성격;
	}
}

class Main {
	public static void main(String[] args) {
		사람 a사람 = new 사람("홍길순", 22, "함경도", "예민함");
		a사람.자기소개();
		// 출력 : 저는 22살 함경도 출신 홍길순 입니다.
		
		사람 a사람2 = new 사람("임꺽정", 50, "충청도", "호탕함");
		a사람2.자기소개();
		
	}
}
//유-레카
class 사람 {

	int 나이;
	String 이름;
	String 고향;
	String 성격;
	
	사람(String 이름, int 나이, String 고향, String 성격) {
		this.나이 = 나이;
		this.이름 = 이름;
		this.고향 = 고향;
		this.성격 = 성격;
	}
	void 자기소개() {
		System.out.printf("%d %s %s %s\n", this.나이, this.이름, this.고향, this.성격);
	}
}
class Main {
	public static void main(String[] args) {
		사람 a사람 = new 사람();
		int a사람의_왼팔_길이 = a사람.a왼팔.길이;
		System.out.println(a사람의_왼팔_길이 + "cm");
		// 출력 : 70cm
	}
}

class 사람 {
	팔 a왼팔;
	사람(){
		a왼팔 = new 팔();
	}
}
class 팔{
	int 길이;
	팔(){
		길이 = 70;
	}
}

class Main {
	public static void main(String[] args) {
		사람 a사람 = new 사람();
		int a사람의_왼팔_길이 = a사람.a왼팔.길이;
		System.out.println(a사람의_왼팔_길이 + "cm");
		// 출력 : 70cm
	}
}

class 사람 {
	팔 a왼팔;
	
	사람() {
		this.a왼팔 = new 팔();
		this.a왼팔.길이 = 70;
	}
}

class 팔 {
	int 길이;
	
	팔() {
	}
}
class Main {
	public static void main(String[] args) {
		계산기 a계산기 = new 계산기();
		
		System.out.println(a계산기.더하기(10, 20));
		// 출력 : 30
		
		System.out.println(a계산기.더하기(10, 20, 30));
		// 출력 : 60
		
		System.out.println(a계산기.더하기(10.5, 20, 30));
		// 출력 : 60.5
	}
}

class 계산기 {

	int 더하기(int a, int b) {
		return (a + b);
	}
	int 더하기(int a, int b, int c) {
		return  (a + b + c);
	}
	double 더하기(double a, int b, int c) {
		return (a + b + c);
	}
}

class Main {
	public static void main(String[] args) {
		new 사과();
		new 포도();
		new 사람("홍길동");
		new 사람();
	}
}

class 사과 {
	// 이렇게 생성자를 만들지 않은 클래스는 자바에서 자동으로 생성자를 하나 만들어준다.
	// 참고로 자동으로 만들어 질 때 `매개변수 없는 생성자`가 만들어집니다.
}

class 포도 {
	포도() {
		// 이렇게 생성자를 직접 만들면 자바는 더 이상 자동으로 생성자를 만들어주지 않습니다.
	}
}
class 사람 {
	사람(String 이름) {
		
	}
	
	사람 (){
		
	}
}

class Main {
	public static void main(String[] args) {
		new 사람();
		
		new 청둥오리();
		/*
		출력
		생물이 생성되었습니다.
		동물이 생성되었습니다.
		오리가 생성되었습니다.
		청둥오리 생성되었습니다.
		*/
/*
	}
}

class 생물 {
	생물() {
		// 이 함수는 부모 클래스 생성자를 자동으로 호출합니다.
		System.out.println("생물이 생성되었습니다.");
	}
}
class 동물 extends 생물 {
	동물() {
		 // 부모 클래스의 생성자를 호출합니다. 생략가능합니다.
		// 이 함수는 부모 클래스 생성자를 자동으로 호출합니다.
		
		System.out.println("동물이 생성되었습니다.");
	}
	
}
class 사람 extends 동물 {
	
	사람() {
		super();// 부모 클래스의 생성자를 호출합니다.
		// 이 함수는 부모 클래스 생성자를 자동으로 호출합니다.
		
		System.out.println("사람이 생성되었습니다.");
	}
}

class 오리 extends 동물 {
	오리(){
		System.out.println("오리가 생성되었습니다.");
	}
}

class 청둥오리 extends 오리{
	청둥오리(){
		System.out.println("청둥오리가 생성되었습니다.");
	}
}

// 문제 : 아래가 오류없이 실행되도록 해주세요.
// 조건 : 사람 클래스만 수정할 수 있습니다.

class Main {
	public static void main(String[] args) {
		new 사람();
	}
}

class 동물 {
	동물(String 이름) {
		System.out.println("동물(String 이름) 실행됨!");
		System.out.println("이름 : " + 이름);
	}

	동물(String 이름, int 나이) {
		System.out.println("동물(String 이름, int 나이) 실행됨!");
		System.out.println("이름 : " + 이름);
		System.out.println("나이 : " + 나이);
	}
}

class 사람 extends 동물 {

	사람(){
		super("홍길동", 20);

	}
}*/
//code.oa.gg/java8/938
// 문제 : 아래와 같이 출력되도록 해주세요. init() 메세드에 의해서 출력되어야 합니다.
// 조건 : 사람 클래스의 생성자는 사용할 수 없습니다.
// 힌트 : 모든 생성자는 자신의 일을 하기 전에 super(); 부터 실행합니다.
// 힌트 : 모든 생성자는 자신의 일을 하기 전에 부모클래스의 생성자 부터 실행합니다.

class Main {
	public static void main(String[] args) {
		new 사람();
		// 출력 : 사람이 초기화 됩니다.
	}
}


class 동물 {
	동물(){
	super();
	init();
	
	}
	
	void init() {
		
	}
	
}


class 사람 extends 동물{

	void init() {
		
		System.out.println("사람이 초기화 됩니다.");
		
	}
}



