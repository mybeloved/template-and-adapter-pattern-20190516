import adapterpattern.loginadapter.v1.service.SignInForThirdService;

/**
 * @Program: template-and-adapter-pattern-20190516
 * @Description: 服务测试类
 * @Author: whx
 * @Create: 2019-05-16 12:29
 **/
public class SignInForThirdServiceTest {
	public static void main(String[] args) {
		SignInForThirdService service = new SignInForThirdService();
		service.login("whx", "123456");
		service.loginForQQ("32256646");
		service.loginForWechat("88923672");
	}
}
