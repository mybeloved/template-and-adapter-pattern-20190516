package adapterpattern.loginadapter.v2.adapters;

import adapterpattern.loginadapter.ResultMsg;

/**
 * @Program: template-and-adapter-pattern-20190516
 * @Description: 新浪登录适配
 * @Author: whx
 * @Create: 2019-05-16 12:29
 **/
public class LoginForSinaAdapter implements LoginAdapter {
	
	public boolean support(Object adapter) {
		return adapter instanceof LoginForSinaAdapter;
	}
	
	public ResultMsg login(String id, Object adapter) {
		return null;
	}
}
