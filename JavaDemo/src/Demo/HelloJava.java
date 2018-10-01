package Demo;

public class HelloJava {
	String url = "http://www.abc.com";
	String webName = "ABC";
	
	//System.out.println(url);
	
	public void printString() {
		float x = 223.56F;
		float y = 100.00f;
		
		double d1 = 23.45D;
		double d2 = 422.22d;
		double d3 = 2523.234;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);
		
	    // 字符型
	    char webName1 = '微';
	    char webName2 = '学';
	    char webName3 = '苑';
	    System.out.println("网站的名字是：" + webName1 + webName2 + webName3);
	   
	    // 整型
	    short x1=22;  // 十进制
	    int y1=022;  // 八进制
	    long z1=0x22L;  // 十六进制
	    System.out.println("转化成十进制：x1 = " + x1 + ", y1 = " + y1 + ", z1 = " + z1);
	   
	    // 浮点型
	    float m = 22.45f;
	    double n = 10;
	    System.out.println("计算乘积：" + m + " * " + n + "=" + m*n);
	    
	    // 布尔型
	    boolean a = 100>10;
	    boolean b = 100<10;
	    System.out.println("100>10 = " + a);
	    System.out.println("100<10 = " + b);
	   
	    if(a){
	        System.out.println("100<10是对的");
	    }else{
	        System.out.println("100<10是错的");
	    }
	}
}
