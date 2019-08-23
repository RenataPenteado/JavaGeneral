package j02.basic.objects.ex09;

public class DuckCompair {
	
	private DuckCompair(){ }
	
	public static Duck duckWithMaxCounter(Duck a, Duck b) {
	//	if(a.count >= b.count) {
		int  x = Math.max(a.count, b.count);
		if(x == a.count) {	
			return a;
		} else {
			return b;
		} 
	}
}
