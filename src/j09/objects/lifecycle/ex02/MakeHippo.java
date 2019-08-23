package j09.objects.lifecycle.ex02;

public class MakeHippo {
	public static void main(String[] args) {
		Hippo h1 = new Hippo("Buffy");
		System.out.println(h1.getName());
		
		Hippo h2 = new Hippo("Poppo");
		System.out.println(h2.getName());
		
		Hippo h3 = new Hippo("Tamú");
		System.out.println(h3.getName());
		
		Hippo h4 = new Hippo("HipHip");
		System.out.println(h4.getName());
	}
}
