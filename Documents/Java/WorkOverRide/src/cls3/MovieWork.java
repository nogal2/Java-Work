package cls3;

public class MovieWork extends Movie{
	private int content;	//작품성 
	private int popul;		//대중성
	private	int script;		//대본
	
	
	public MovieWork(String title, int director, int acter, int content, int popul, int script) {
		super(title, director, acter);
		this.content = content;
		this.popul = popul;
		this.script = script;
		
	}

	@Override 
	public void display() { //여기를 구현하세요. 
		int total = director + acter + content + popul + script;
		String result = "";
		
		System.out.printf("영화제목:%s\n", title);
		System.out.printf("감독:%d, 배우:%d, 작품성:%d, 대중성:%d, 대본:%d\n", director, acter, content, popul, script);
		System.out.printf("영화총점 :%d\n", total);
		
		if (total >= 45)
			result = "☆☆☆☆☆";
		else if (total >= 30)
			result = "☆☆☆☆";
		else if (total >= 15)
			result = "☆☆☆";
		else
			result = "☆☆";
		
		System.out.println("영화평점 : " + result);
		
		
		
	}
}
