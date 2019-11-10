
public class HelloWorld {

	public String getMessage(String name) {
		if (name == null || name == "")
			return "Hello World";
		else
			return "Hello " + name;
	}

	public long sum(int a, int b) {
		return a + b;
	}
}
