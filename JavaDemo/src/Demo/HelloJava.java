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
		
	    // �ַ���
	    char webName1 = '΢';
	    char webName2 = 'ѧ';
	    char webName3 = 'Է';
	    System.out.println("��վ�������ǣ�" + webName1 + webName2 + webName3);
	   
	    // ����
	    short x1=22;  // ʮ����
	    int y1=022;  // �˽���
	    long z1=0x22L;  // ʮ������
	    System.out.println("ת����ʮ���ƣ�x1 = " + x1 + ", y1 = " + y1 + ", z1 = " + z1);
	   
	    // ������
	    float m = 22.45f;
	    double n = 10;
	    System.out.println("����˻���" + m + " * " + n + "=" + m*n);
	    
	    // ������
	    boolean a = 100>10;
	    boolean b = 100<10;
	    System.out.println("100>10 = " + a);
	    System.out.println("100<10 = " + b);
	   
	    if(a){
	        System.out.println("100<10�ǶԵ�");
	    }else{
	        System.out.println("100<10�Ǵ��");
	    }
	}
}
