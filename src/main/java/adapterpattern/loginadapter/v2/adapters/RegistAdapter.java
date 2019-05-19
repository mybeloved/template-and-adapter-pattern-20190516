package adapterpattern.loginadapter.v2.adapters;

import adapterpattern.loginadapter.ResultMsg;

/**
 * @Program: template-and-adapter-pattern-20190516
 * @Description: 注册接口
 * @Author: whx
 * @Create: 2019-05-16 12:29
 **/
public interface RegistAdapter {
	
	boolean support(Object adapter);
	
	ResultMsg login(String id, Object adapter);
}
