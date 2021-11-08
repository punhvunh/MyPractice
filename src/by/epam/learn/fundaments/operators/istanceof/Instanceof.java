package by.epam.learn.fundaments.operators.istanceof;

class Course {}
class BaseCourse extends Course {}
class FreeCourse extends BaseCourse{}
class OptionalCourse extends Course {}
public class Instanceof {
	public static void doAction(Course course){
		if (course instanceof BaseCourse){
			System.out.println("for BaseCourse and FreeCourse");
		} else if (course instanceof OptionalCourse ){
			System.out.println("for OptionalCourse");
		}else {
			System.out.println("for null or Course");
		}
	}
	public static void main(String[] args) {
		Course course = new BaseCourse();
		doAction(course);
		Course course1 = new OptionalCourse();
		doAction(course1);
		Course course2 = new Course();
		doAction(course2);
		Course course3 = null;
		doAction(course3);
		Course course4 = new FreeCourse();
		doAction(course4);
		BaseCourse baseCourse = new BaseCourse();
		OptionalCourse optionalCourse = new OptionalCourse();

	}

}
