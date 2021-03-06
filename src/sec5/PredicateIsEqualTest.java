package sec5;
import java.util.function.Predicate;
public class PredicateIsEqualTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String>predicate;
		
		predicate = Predicate.isEqual(null);
		System.out.println("null, null : "+predicate.test(null));
		
		predicate = Predicate.isEqual("java8");
		System.out.println("null, java8 : "+predicate.test(null));
		
		predicate = Predicate.isEqual(null);
		System.out.println("java8, null : "+predicate.test("java8"));
		
		predicate = Predicate.isEqual("java8");
		System.out.println("java8, java8 : "+predicate.test("java8"));
		
		predicate = Predicate.isEqual("java8");
		System.out.println("java7,java8" + predicate.test("java7s"));
	}

}
