package adapterpattern.loginadapter.v2.adapters;

import adapterpattern.loginadapter.ResultMsg;

/**
 * @Program: template-and-adapter-pattern-20190516
 * @Description: QQ注册适配
 * @Author: whx
 * @Create: 2019-05-16 12:29
 **/
public class RegistForQQAdapter implements RegistAdapter, LoginAdapter {
	
	public boolean support(Object adapter) {
		return false;
	}
	
	public ResultMsg login(String id, Object adapter) {
		return null;
	}
}
