package listing7;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SystemTest
{

	public static void main(String[] args)
	{
		Map<String, String> envs = System.getenv();
		Set<Map.Entry<String, String>> env = envs.entrySet();
		
		Iterator<Map.Entry<String,String>> it = env.iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			System.out.println(me.getKey() + ":" + me.getValue());
		}
		System.out.println();
		
		
		testGetProperties();
		System.out.println();
		
		testArrayCopy();
		System.out.println();
	}
	
	

	private static void testArrayCopy()
	{
		int[] grades = {100, 99, 98, 97 };
		int[] gradesBackup = new int[grades.length];
		System.arraycopy(grades, 0, gradesBackup, 0, grades.length);
		for(int i:gradesBackup) {
			System.out.println(i);
		}
	}



	private static void testGetProperties()
	{
		String[] propNames = {
				"java.version",
				"java.vendor",
				"java.vendor.url",
				"java.home",
				"java.vm.specification.version",
				"java.vm.specification.vendor",
				"java.vm.specification.name",
				"java.vm.version",
				"java.vm.vendor",
				"java.vm.name",
				"java.specification.version",
				"java.specification.vendor",
				"java.specification.name",
				"java.class.version",
				"java.class.path",
				"java.library.path",
				"java.io.tmpdir",
				"java.compiler",
				"java.ext.dirs",
				"os.name",
				"os.arch", 
				"os.version",
				"file.separator",
				"path.separator",
				"line.separator",
				"user.name",
				"user.home",
				"user.dir	"
		};
		for (String prop:propNames) {
			System.out.println(prop + ":" + System.getProperty(prop));
		}
		
	}
	
	

}
