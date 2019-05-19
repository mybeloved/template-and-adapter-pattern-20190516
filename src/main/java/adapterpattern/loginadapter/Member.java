package adapterpattern.loginadapter;

/**
 * @Program: template-and-adapter-pattern-20190516
 * @Description: Member实体类
 * @Author: whx
 * @Create: 2019-05-16 12:29
 **/
public class Member {
	
	private String username;
	private String password;
	private String mid;
	private String info;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getMid() {
		return mid;
	}
	
	public void setMid(String mid) {
		this.mid = mid;
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setInfo(String info) {
		this.info = info;
	}
}
