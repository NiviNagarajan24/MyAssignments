package week2.day4;

public  class Samsung extends androidTv {

	public void watchVideo() {
		System.out.println("watchvideo in samsung");

	}
	public static void main(String[] args) {
		Samsung sam=new Samsung();
		sam.createApp();
		sam.watchVideo();
	}

}
