package sec5;

import java.util.function.BinaryOperator;

public class OperatorMinbyMaxbyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;
		
		binaryOperator = BinaryOperator.minBy((f1,f2)-> Integer.compare(f1.price,f2.price));
		fruit = binaryOperator.apply(new Fruit("딸기",6000),new Fruit("수박",10000));
		System.out.println(fruit.name);
		
		binaryOperator = BinaryOperator.maxBy((f1,f2)-> Integer.compare(f1.price,f2.price));
		fruit = binaryOperator.apply(new Fruit("딸기",6000),new Fruit("수박",10000));
		System.out.println(fruit.name);
	}

}
