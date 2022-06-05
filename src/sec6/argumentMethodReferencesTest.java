package sec6;
import java.util.function.ToIntBiFunction;
public class argumentMethodReferencesTest {

	public static void main(String[] args) {
		
		ToIntBiFunction<String,String>function;
		
		function = (a,b) -> a.compareToIgnoreCase(b);//람다식 작성
		print(function.applyAsInt("java8", "JAVA8"));//람다식 실행
		
		function = String::compareToIgnoreCase;//람다식 작성 ->메소드
		print(function.applyAsInt("java8", "JAVA8"));//람다식 실행
}		
		public static void print (int order) {
			if(order<0) {System.out.println("사전순으로 먼저 옵니다");}
			else if(order == 0) {System.out.println("동일한 문자열 입니다");}
			else {System.out.println("사전순으로 나중에 옵니다");}
			
		}
	}
		


