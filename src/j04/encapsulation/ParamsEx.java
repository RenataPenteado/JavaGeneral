package j04.encapsulation;

public class ParamsEx {
	
	int method_1(int p1) {
		System.out.println(p1+10);
		return 1;
	}
	
	int method_2(int p1, int p2) {
		System.out.println(p1+p2);
		return 2;
	}
	
	int method_3(int p1, int p2, String p_str) {
		System.out.println(p1+" "+p2+" "+p_str);
		return 3;
	}
	
	public static void main(String[] args) {
		int var_1 = 100;
		int var_2 = 200;
		String str_main = "Hello";
		
		ParamsEx paramEx = new ParamsEx();
		int ret_1_0 = paramEx.method_1(var_1);
		int ret_1_1 = paramEx.method_1(100);
		
		int ret_2_0 = paramEx.method_2(var_1, var_2);
		int ret_2_1 = paramEx.method_2(var_2, var_1);
		int ret_2_2 = paramEx.method_2(var_1+var_2, 300);
		
		int XXXXX = paramEx.method_3(var_1+var_2, 300, str_main);
		
	}

}
