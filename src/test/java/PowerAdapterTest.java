import adapterpattern.poweradapter.AC220;
import adapterpattern.poweradapter.DC5;
import adapterpattern.poweradapter.PowerAdapter;

/**
 * @Program: template-and-adapter-pattern-20190516
 * @Description: 电源适配测试类
 * @Author: whx
 * @Create: 2019-05-16 12:37
 **/
public class PowerAdapterTest {
	public static void main(String[] args) {
		DC5 dc5 = new PowerAdapter(new AC220());
		dc5.outoupDC5V();
	}
}
