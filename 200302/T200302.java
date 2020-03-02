public class T200302 {
	public static void main(String[] args) {
		System.out.println(Byte.MIN_VALUE);//-128
		System.out.println(Byte.MIN_VALUE - 1);//-129
		System.out.println(Byte.MAX_VALUE);//127
		System.out.println(Byte.MAX_VALUE + 1);//128

		System.out.println(Character.MIN_VALUE);//  \u0000
		System.out.println(Character.MIN_VALUE - 1);//-1
		System.out.println(Character.MAX_VALUE);//  \uffff
		System.out.println(Character.MAX_VALUE + 1);//65536

		System.out.println(Short.MIN_VALUE);//-32768
		System.out.println(Short.MIN_VALUE - 1);//-32769
		System.out.println(Short.MAX_VALUE);//32767
		System.out.println(Short.MAX_VALUE + 1);//32768

		System.out.println(Integer.MIN_VALUE);//-2147483648
		System.out.println(Integer.MIN_VALUE - 1);//2147483647
		System.out.println(Integer.MAX_VALUE);//2147483647
		System.out.println(Integer.MAX_VALUE + 1);//-2147483648

		System.out.println(Long.MIN_VALUE);//-9223372036854775808
		System.out.println(Long.MIN_VALUE - 1);//9223372036854775807
		System.out.println(Long.MAX_VALUE);//9223372036854775807
		System.out.println(Long.MAX_VALUE + 1);//-9223372036854775808

		System.out.println(Float.MIN_VALUE);//1.4E-45
		System.out.println(Float.MIN_VALUE - 1);//-1.0
		System.out.println(Float.MAX_VALUE);//3.4028235E38
		System.out.println(Float.MAX_VALUE + 1);//3.4028235E38

		System.out.println(Double.MIN_VALUE);//4.9E-324
		System.out.println(Double.MIN_VALUE - 1);//-1.0
		System.out.println(Double.MAX_VALUE);//1.7976931348623157E308
		System.out.println(Double.MAX_VALUE + 1);//1.7976931348623157E308
	}

	public static void main5(String[] args) {
		//求最大值
		int a = 10;
		int b = 20;
		int max = a>b ? a : b;
        System.out.println(max);//b
	}


	public static void main4(String[] args) {
        int a = 0x10; 
        System.out.printf("%x\n", a >> 1);//8
        //结果按十六进制显示
	}

	public static void main3(String[] args) {
	    int a = 10; 
        int b = 20; 
        System.out.println(a & b);//0
	}

	public static void main2(String[] args) {
		double x = 2.0;
		int y = 4;
		x /= ++y;
		System.out.println(x); //0.4
	}

	public static void main1(String[] args) {
		short a = 128;
		byte b = (byte) a;
		System.out.println(a);//128
		System.out.println(b);//-128
		System.out.println(Byte.MAX_VALUE);//127
		System.out.println(Byte.MAX_VALUE + 1);//128
	}
}