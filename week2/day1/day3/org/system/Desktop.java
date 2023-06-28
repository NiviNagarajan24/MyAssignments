package week2.day3.org.system;

public class Desktop extends Computer {
public void desktopsize() {
	System.out.println("Desktop class---->desktopsize");
}
public static void main(String[] args) {
	Desktop option=new Desktop();
	option.computerModel();
	option.desktopsize();
}
}
