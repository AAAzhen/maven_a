package pojo;

public class Account {

	private Integer id;
	private String cardNumber;
	private Integer money;
	private Integer createtime;
	private Bank bank;
	private User user;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	public Integer getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Integer createtime) {
		this.createtime = createtime;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", cardNumber=" + cardNumber + ", money=" + money + ", createtime=" + createtime
				+ ", bank=" + bank + ", user=" + user + "]";
	}
	
	
}
