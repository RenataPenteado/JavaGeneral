package j02.basic.objects.ex03;

public class DVDPlayerTestDrive {
	public static void main(String[] args) {
		
		DVDPlayer d = new DVDPlayer();
		d.playDVD();
		d.canRecord = true;
		
		
		if (d.canRecord == true) {
			d.recordDVD();
		}
	}

}
