package cd;

public class mp3 extends item {
	private int numofSongs;
	private String sign;
	
	public mp3(String sign,int playingTime,int numofSongs,
			   boolean gotIt,String comment) {
			super(playingTime,false,comment);
			this.numofSongs = numofSongs;
			this.sign = sign;		
	}
	
	public void print() {
		System.out.println();
	}
}