package chapter09.ReplaceConditionalwithPolymorphism.part2;

public class Factory {
	public static Animal getInstance(String className) {
		Animal animal = null;
		try {
			animal = (Animal) Class.forName(className).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return animal;
	}
}
