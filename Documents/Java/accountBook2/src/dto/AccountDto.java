package dto;

public class AccountDto {
	private String dateTime;	// 몇 년도 몇 월 몇일 0000/00/00
	private String item;			// 용도(제목)
	private String classify;	// 수입 or 지출
	private int money;			// 금액
	private	String memo;		// 내용
	
	public AccountDto () {
		
	}

	public AccountDto(String dateTime, String item, String classify, int money, String memo) {
		super();
		this.dateTime = dateTime;
		this.item = item;
		this.classify = classify;
		this.money = money;
		this.memo = memo;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getClassify() {
		return classify;
	}

	public void setClassify(String classify) {
		this.classify = classify;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Override
	public String toString() {
	//	return "AccountDto [dateTime=" + dateTime + ", item=" + item + ", classify=" + classify + ", money=" + money
	//			+ ", memo=" + memo + "]";
		return dateTime + "-" + item + "-" + classify + "-" + money + "-" + memo;
	}
		
	
}
