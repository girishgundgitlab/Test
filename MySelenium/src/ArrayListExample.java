import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ArrayListExample  {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList(); // ArrayList is Collection -- Dynamic in nature
		list.add("Girish"); //0
		list.add("Kamath"); //1
		list.add("irina"); //2
		list.add("Ketan"); //3
		list.add("Sammy"); //4
		
//		System.out.println(list.get(1));
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		
		String[] str1 = new String[3]; // 0,1,2,3  -- Array is Fixed in size
		str1[0] = "Abc";
		str1[1] = "DEF";
		str1[2] = "GHI";
//		str1[3] = "JKL";
		
//		System.out.println(str1.length);
		
		for(int i=0;i<str1.length;i++)
		{
			System.out.println(str1[i]);
		}
		
//		System.out.println(str1[1]);
		

	}

}
