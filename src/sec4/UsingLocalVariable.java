package sec4;

public class UsingLocalVariable {
 void method (int arg) {
	 int localVar = 40;
	 
	 //arg=31; arg는 final 특성을 가짐
	 //localVar= 41; localVar는 final특성을 가짐
	 
	 //람다식
	 MyFunctionalInterface fi=()->{
		 //로컬변수 읽기
	System.out.println("arg: "+arg);
	System.out.println("localVar: "+localVar+"\n");
	 };
	 fi.method();
 }
}
