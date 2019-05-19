package adapterpattern.loginadapter.v1.service;

import adapterpattern.loginadapter.Member;
import adapterpattern.loginadapter.ResultMsg;

/**
 * @Program: template-and-adapter-pattern-20190516
 * @Description: 注册和登录服务
 * @Author: whx
 * @Create: 2019-05-16 12:29
 **/
public class SignInService {
	
	/**
	 * 注册方法
	 *
	 * @param username
	 * @param password
	 * @return
	 */
	public ResultMsg regist(String username, String password) {
		return new ResultMsg(200, "注册成功", new Member());
	}
	
	
	/**
	 * 登录方法
	 *
	 * @param username
	 * @param password
	 * @return
	 */
	public ResultMsg login(String username, String password) {
		return null;
	}
}
