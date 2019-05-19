package adapterpattern.loginadapter.v2;

import adapterpattern.loginadapter.ResultMsg;

/**
 * @Program: template-and-adapter-pattern-20190516
 * @Description:服务接口
 * @Author: whx
 * @Create: 2019-05-16 12:29
 **/
public interface IPassportForThird {
	
	/**
	 * QQ登录
	 *
	 * @param id
	 * @return
	 */
	ResultMsg loginForQQ(String id);
	
	/**
	 * 微信登录
	 *
	 * @param id
	 * @return
	 */
	ResultMsg loginForWechat(String id);
	
	/**
	 * 记住登录状态后自动登录
	 *
	 * @param token
	 * @return
	 */
	ResultMsg loginForToken(String token);
	
	/**
	 * 手机号登录
	 *
	 * @param telephone
	 * @param code
	 * @return
	 */
	ResultMsg loginForTelephone(String telephone, String code);
	
	/**
	 * 注册后自动登录
	 *
	 * @param username
	 * @param password
	 * @return
	 */
	ResultMsg loginForRegist(String username, String password);
}
