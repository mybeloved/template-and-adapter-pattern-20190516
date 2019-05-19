package templatepattern.jdbc;

import java.sql.ResultSet;

/**
 * @Program: template-and-adapter-pattern-20190516
 * @Description: ORM映射定制化的接口
 * @Author: whx
 * @Create: 2019-05-16 12:29
 **/
public interface RowMapper<T> {
	T mapRow(ResultSet rs, int rowNum) throws Exception;
}
