package User;

import java.sql.Date;

public class UserVO {
	//데이터를 담아서 객체로 만든 후 작업
	//데이터베이스 테이블 필드와 동일하게 생성
	//userTBL => no, name, birthday, address
	/*no int(11) AI PK 
	name char(10) 
	birthday date 
	address varchar(20)
	*/
	private int no;
	private String name;
	private Date birthday;
	private String address;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "UserVO [no=" + no + ", name=" + name + ", birthday=" + birthday + ", address=" + address + "]";
	}
	
	
}
