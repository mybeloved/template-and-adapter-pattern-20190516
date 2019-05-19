import templatepattern.course.BigDataCourse;
import templatepattern.course.JavaCourse;
import templatepattern.course.NetworkCourse;

/**
 * @Program: template-and-adapter-pattern-20190516
 * @Description: Course测试类
 * @Author: whx
 * @Create: 2019-05-16 12:37
 **/
public class NetworkCourseTest {
	public static void main(String[] args) {
		
		System.out.println("---Java架构师课程---");
		NetworkCourse javaCourse = new JavaCourse();
		javaCourse.createCourse();
		
		System.out.println("---大数据课程---");
		NetworkCourse bigDataCourse = new BigDataCourse(true);
		bigDataCourse.createCourse();
		
	}
}
