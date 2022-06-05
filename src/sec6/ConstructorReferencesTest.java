
package sec6;
import java.util.function.BiFunction;
import java.util.function.Function;
public class ConstructorReferencesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Function <String,Member>function1=(s)->{return new Member(s);};
		Function <String,Member> function1=Member::new;
		
		Member member1= function1.apply("angel");
		
		//BiFunction<String, String, Member>function2=Member :: new ;
		BiFunction<String, String, Member>function2=Member :: new ;
		Member member2= function2.apply("신천사", "angel");
	}

}
