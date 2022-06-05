package sec4;

public class UsingThisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner= usingThis.new Inner();
		inner.method();
	}

}
