package world;

public class ClassLoaderExamples {
	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String classname = "ClassToLoad";
		String pathname = "world";
		ClassLoader clsl = ClassLoader.getSystemClassLoader();
		Class cls = clsl.loadClass(pathname + "." + classname);
		Object obj = cls.newInstance();
		((ClassToLoad) obj).load();

		Class classtoload = Class.forName("world.ClassToLoad2");
		ClassToLoad2 obj2 = (ClassToLoad2) classtoload.newInstance();
		
		obj2.load();

	}
}



