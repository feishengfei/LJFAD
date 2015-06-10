package listing7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ExploreType
{
	private static ExploreType et;

	public static void main(String[] args)
	{
		if(args.length != 1) 
		{
			System.out.println("usage: java ExploreType pkgAndTypeName");
			return;
		}
		
		try
		{
			et = new ExploreType();
			printClassName(et);
			
			Class<?> clazz = Class.forName(args[0]);
			System.out.println("NAME: " + clazz.getName());
			System.out.println("PACKAGE: " + clazz.getPackage().getName());
			System.out.println();
			
			System.out.println("FIELDS");
			Field[] fields = clazz.getDeclaredFields();
			for(int i = 0; i < fields.length; i++)
				System.out.println(fields[i]);
			System.out.println();
			
			System.out.println("CONSTRUCTORS");
			Constructor[] constructors = clazz.getDeclaredConstructors();
			for(int i = 0; i < constructors.length; i++)
				System.out.println(constructors[i]);
			System.out.println();
			
			System.out.println("METHODS");
			Method[] methods = clazz.getDeclaredMethods();
			for(int i = 0; i < methods.length; i++)
				System.out.println(methods[i]);
			System.out.println();
		}
		catch (ClassNotFoundException cnfe)
		{
			System.err.println("could not locate" + args[0]);
		}
	}

	private static void printClassName(Object obj)
	{
		System.out.println("The class of " + obj + " is " + obj.getClass().getName());
	}

}
