package templatepattern.course;

/**
 * @Program: template-and-adapter-pattern-20190516
 * @Description: 大数据课程
 * @Author: whx
 * @Create: 2019-05-16 12:33
 **/
public class BigDataCourse extends NetworkCourse {
	
	private boolean needHomeworkFlag = false;
	
	public BigDataCourse(boolean needHomeworkFlag) {
		this.needHomeworkFlag = needHomeworkFlag;
	}
	
	void checkHomework() {
		System.out.println("检查大数据的课后作业");
	}
	
	@Override
	protected boolean needHomework() {
		return this.needHomeworkFlag;
	}
}
