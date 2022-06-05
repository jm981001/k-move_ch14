package ex04;
import java.util.function.IntSupplier;
public class LambdaTest {
	public static int method(int x, int y) {
		IntSupplier supplier = ()->{
			//X*=10; 오류 발생 : x는 final의 특성을 가지기때문에 x 변수의 값으 수정할 수 없다.
			int result = x+y;
			return result;
		};//람다식 작성 ->익명구현객체
		int result = supplier.getAsInt();
		return result;
	}
	public static void main(String[] args) {
		System.out.println(method(3,5));
	}

}
