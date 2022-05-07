

//
class Circle{
	//field  vs. 지역변수
	int radius;
	String name;
	
	//method
	void getArea() {
		System.out.println(radius* radius*3.14);     //지역변수와 다르게 필드에서 지정한 변수를 가져다 쓸수 있음.
	}
}

public class chap4 {

	public static void main(String[] args) {  //메소드
		// TODO Auto-generated method stub
		System.out.println("객체지향 실습");
		
		// 객체 생성
		
		Circle pizza = new Circle();    // Scanner랑 비슷함
		
		pizza.radius = 10;
		
		pizza.name = "미스터피자";    //객체에 값을 저장하는 방법
		
		//메소드 호출
		pizza.getArea();
		
		System.out.println(pizza.radius +" "+ pizza.name);

	}

}
