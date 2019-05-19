package templatepattern.jdbc.dao;

import templatepattern.jdbc.JdbcTemplate;
import templatepattern.jdbc.Member;
import templatepattern.jdbc.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * @Program: template-and-adapter-pattern-20190516
 * @Description: DAO
 * @Author: whx
 * @Create: 2019-05-16 12:29
 **/
public class MemberDao extends JdbcTemplate {
	public MemberDao(DataSource dataSource) {
		super(dataSource);
	}
	
	public List<?> selectAll() {
		String sql = "select * from t_member";
		return super.executeQuery(sql, new RowMapper<Member>() {
			public Member mapRow(ResultSet rs, int rowNum) throws Exception {
				Member member = new Member();
				//字段过多，原型模式
				member.setUsername(rs.getString("username"));
				member.setPassword(rs.getString("password"));
				member.setAge(rs.getInt("age"));
				member.setAddr(rs.getString("addr"));
				return member;
			}
		}, null);
	}
}
