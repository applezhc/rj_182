package com.inner_class;
@FunctionalInterface
interface PersonBuilder{
	Person builderPerson(String name);
}
class Person{
	private String name;

	public String getName() {
		return name;
	}

	public Person(String name) {
		super();
		this.name = name;
	}
	
}
public class E26 {

	public static void main(String[] args) {
		printName("权志龙",new PersonBuilder() {

			@Override
			public Person builderPerson(String name) {
				return new Person(name);
			}
});
		printName("肖战",name->new Person(name));
		printName("王一博",Person::new);

	}

	private static void printName(String name, PersonBuilder pb) {
		System.out.println(pb.builderPerson(name).getName());
		
	}

}
