package sec5;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//람다식 정의
		Consumer<String> consumer = t -> System.out.println(t+"8");
		consumer.accept("java");
		
		//람다식 정의
		BiConsumer<String, String> bigConsumer = (t, u) ->System.out.println(t + u);
		bigConsumer.accept("Java", "8");
		
		//람다식 정의
		DoubleConsumer doubleConsumer = d ->System.out.println("Java" + d);
		doubleConsumer.accept(8.0);
		
		//람다식 정의
		ObjIntConsumer<String> objIntConsumer =(t, i) ->System.out.println(t + i);
		objIntConsumer.accept("Java", 8);
	 }

}
