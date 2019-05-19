package adapterpattern.loginadapter.v2.adapters;

import adapterpattern.loginadapter.ResultMsg;

/**
 * @Program: template-and-adapter-pattern-20190516
 * @Description: 在适配器中，这个接口是可有可无，不要跟模板模式混淆；模板模式一定是抽象类，而这里仅仅只是一个接口
 * @Author: whx
 * @Create: 2019-05-16 12:29
 **/
public interface LoginAdapter {
	
	boolean support(Object adapter);
	
	ResultMsg login(String id, Object adapter);
	
}
