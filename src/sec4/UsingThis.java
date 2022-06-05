package sec4;

public class UsingThis {
	public int outterField =10;
	
	class Inner{
		int innerField =20;
		
		void method() {
			MyFunctionalInterface fi=()->{
				System.out.println("outterField: " + outterField);
				System.out.println("outterField: " + UsingThis.this.outterField + "\n");
				
				System.out.println("innerField: " + innerField);
				System.out.println("innerField: " + this.innerField + "\n");
			};  //익명구현객체   						//람다식을 실행한 객체를 참조
			fi.method();	//람다식 실행
			}
		}
	}
