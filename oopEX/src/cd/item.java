package cd;
public class item {
	private String artist;
	private String title;
	private int playingTime;
	private String comment;
	private boolean gotIt = false;
	
	public item() {
	}
	
	public item(String title, String artist,  
			int playingTime,boolean gotIt, String comment) {
		super();
		this.title = title;
		this.artist = artist;
		this.playingTime = playingTime;
		this.gotIt = gotIt;
		this.comment = comment;
	}
	

	public item(int playingTime, boolean gotIt,String comment) {
		super();
		this.playingTime = playingTime;
		this.comment = comment;
		this.gotIt = gotIt;
	}

	public void print() {
		System.out.println(title);
	}
}
