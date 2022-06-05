package ex06;
import java.util.function.ToIntFunction;


import sec5.Student;
public class LambdaTest {
		private static Student[] students = {
				new Student("홍길동",90,96),
				new Student("신용권",95,93),
		};
		
		
		//avg메소드 작성
		public static double avg(ToIntFunction<Student>function) {
			int sum=0;
			for(Student student :students) {
				sum+= function.applyAsInt(student);
				
			}
		    double avg =(double) sum / students.length;
		    return avg;		
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double englishAvg = avg(s -> s.getEnglishScore());
		//7번
		double englishAvg = avg(Student :: getEnglishScore);
		System.out.println("영어 평균 점수: "+englishAvg);
		
		//double englishAvg = avg(s -> s.get1MathScore());
		//7번
		double mathAvg = avg(s -> s.getEnglishScore());
		System.out.println("수학 평균 점수: "+mathAvg);
	}
	
	public static class Student {
		private String name;
		private int englishScore;
		private int mathScore;
	public Student (String name, int englishScore, int mathScore) {
		this.name=name;
		this.englishScore=englishScore;
		this.mathScore=mathScore;
	}
	
	public String getName() {return name; }
	public int getEnglishScore() {return englishScore; }
	public int getMathScore() {return mathScore; }

}
}