package cd;
public class CD extends item {
		//private String title;
		//private String artist;
		private int numofTracks;
		//private int playingTime;
		//private boolean gotIt;
		//private String comment;
		
		public CD(String title,String artist, int numofTracks, 
				int playingTime, boolean gotIt,String comment) {
			super(title,artist,playingTime,gotIt,comment);
			//this.title = title;
			//this.artist = artist;
			this.numofTracks = numofTracks;
			//this.playingTime = playingTime;
			//this.comment = comment;
		}

		public void print() {
			// TODO Auto-generated method stub
			super.print();
			System.out.println(numofTracks);
		}

		@Override
		public String toString() {
			return "CD [numofTracks=" + numofTracks + ", toString()=" + super.toString() + "]";
		}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			CD cc = (CD)obj;
			
			return numofTracks==(cc.numofTracks);
		}		
		
}
