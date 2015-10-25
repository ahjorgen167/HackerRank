import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.regex.*;

public class PrivateAccess {
	public static void main(String[] args) throws Exception{
		System.out.println("Hello");
		int num = 8;
		Object o;
		
		
		Class<?> clazz =  Class.forName("PrivateAccess$Private");
		o = clazz.getClass();
		Method m = clazz.getDeclaredMethod("powerof2", int.class);
		m.setAccessible(true);
		System.out.println(o.getClass().getSimpleName());
		
		m.invoke(o, num);
		}
	
	class Private{
		private String powerof2(int num)
		{
			return ((num&num-1)==0)?"power of 2":"not a power of 2";
		}
	}
}
