package DataConversion;

import java.util.Arrays;

public class WrapperClassConcept {

	public static void main(String[] args) {
	String x = "100";
	System.out.println(x+20);//10020
	
	
	//String to int:
	int i = Integer.parseInt(x);//100 --> convert(parse) to a String
	System.out.println(i+20);//120
	
	String y = "100USD";
	System.out.println(y+20);//100A20
	//int j = Integer.parseInt(y);//NumberFormatException
	
	String curr[] = y.split("USD");
	int j = Integer.parseInt(curr[0]);
	System.out.println(Arrays.toString(curr));//100
	
	System.out.println(j+20);
	
	//String to Double:
	String z = "12.33";
	System.out.println(z+20);//12.3320
	
	double d = Double.parseDouble(z);//12.33
	System.out.println(d+20);//32.33
	
	
	//String to boolean:
	String headless = "true";
	if(Boolean.parseBoolean(headless)) {
		System.out.println("run in headless");
	}
	
	System.out.println("----- valueOf -------");
	
	//int/boolean/double/float/long to String: --> String.valueOf() method:
	int k = 100;
	String k1 = String.valueOf(k); //"100"
	System.out.println(k1 + 20); //10020
	
	boolean flag = true;
	String f1 = String.valueOf(flag);//"true"
	
	System.out.println("-------- constants -------");
	
	//integer/byte/short min- max
	System.out.println(Integer.MIN_VALUE);//-2147483648
	System.out.println(Integer.MAX_VALUE);//-2147483647
	
	System.out.println(Byte.MIN_VALUE);//-128
	System.out.println(Byte.MAX_VALUE);//127
	
	System.out.println(Short.MIN_VALUE);//-32768
	System.out.println(Short.MAX_VALUE);//-32767
	
	
	
	
	}

}
