package ex05;
import java.util.function.IntBinaryOperator;
public class LambdaTest {
	private static int[] scores = {10,50,3};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt( result,score);
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = maxOrMin(
				(a, b)-> {
					if(a>=b) return a;
					else return b;
				}		
				
				
	);
		System.out.println("최대값: "+ max);
		
		//최소값 얻기
		int min = maxOrMin(
				(a, b)-> {
					if(a<=b) return a;
					else return b;
				}		
				
				
				
	);
	System.out.println("최솟값: "+ min);
	}

}
