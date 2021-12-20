package single;

import java.util.ArrayList;
import java.util.List;

import dao.AccountDao;
import dto.AccountDto;

public class Singleton {
	private static Singleton single = null;
	public List<AccountDto> list = null;
	
	private Singleton () {
		list = new ArrayList<AccountDto>();
	}
	
	public static Singleton getInstance() {
		if(single == null) {
			single = new Singleton();
		}
		return single;
	}
}
