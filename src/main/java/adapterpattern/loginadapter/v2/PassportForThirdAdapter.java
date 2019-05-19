package adapterpattern.loginadapter.v2;

import adapterpattern.loginadapter.ResultMsg;
import adapterpattern.loginadapter.v1.service.SignInService;
import adapterpattern.loginadapter.v2.adapters.*;

/**
 * @Program: template-and-adapter-pattern-20190516
 * @Description: 结合策略模式、工厂模式、适配器模式
 * @Author: whx
 * @Create: 2019-05-16 12:29
 **/
public class PassportForThirdAdapter extends SignInService implements IPassportForThird {
	
	public ResultMsg loginForQQ(String id) {
		return processLogin(id, LoginForQQAdapter.class);
	}
	
	public ResultMsg loginForWechat(String id) {
		return processLogin(id, LoginForWechatAdapter.class);
	}
	
	public ResultMsg loginForToken(String token) {
		return processLogin(token, LoginForTokenAdapter.class);
	}
	
	public ResultMsg loginForTelephone(String telephone, String code) {
		return processLogin(telephone, LoginForTelAdapter.class);
	}
	
	public ResultMsg loginForRegist(String username, String passport) {
		super.regist(username, passport);
		return super.login(username, passport);
	}
	
	private ResultMsg processLogin(String key, Class<? extends LoginAdapter> clazz) {
		try {
			//适配器不一定要实现接口
			LoginAdapter adapter = clazz.newInstance();
			
			//判断传过来的适配器是否能处理指定的逻辑
			if (adapter.support(adapter)) {
				return adapter.login(key, adapter);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
