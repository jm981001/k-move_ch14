package sec3;

public class MyFunctionalInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyFunctionalInterface fi= new MyFunctionalInterfaceImpl();
		
		/*익명 구현 객체
		MyFunctionalInterface fi= new MyFunctionalInterfaceImpl() {
			public void method() {
				String str = "method call";
				System.out.println(str);		
			}
		};*/
		
		
		//람다식 위처럼 세부적인것들이 다 필요없다
		MyFunctionalInterface fi= ()->{
				//String str = "method call";
				System.out.println("method call");		
		};
		
		fi=()-> {System.out.println("method call");};
		
		
	   fi.method();
		
		//람다식- 매개변수가 있는 경우
		MyFunctionalInterface2 fi2= (x)->{
				int result = x*5;
				System.out.println(result);		
				};
				
	   fi2= (x)->System.out.println(x*5); 
		fi2.method(5);
				
		
		
		//람다식-리턴값이 잇는 경우
		MyFunctionalInterface3 fi3= (x,y)->{
				int result = x+y;
				return result;
				};
		 fi3= (x,y)->x+y;
		 System.out.println(fi3.method(5,10));//이런식으로 줄여쓰기 가능
	}

}
