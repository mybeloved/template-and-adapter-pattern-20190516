import templatepattern.jdbc.dao.MemberDao;

import java.util.List;

/**
 * @Program: template-and-adapter-pattern-20190516
 * @Description: JDBC模版方法测试类
 * @Author: whx
 * @Create: 2019-05-16 12:29
 **/
public class MemberDaoTest {
	
	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao(null);
		List<?> result = memberDao.selectAll();
		System.out.println(result);
	}
}
