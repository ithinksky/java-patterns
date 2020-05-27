package com.ithinksky.petterns.a02creational.t04prototype.tsample;

/**
 * @author tengpeng.gao
 */
public class Person implements Cloneable {

	private String name;

	private int age;

	@Override
	public Person clone() throws CloneNotSupportedException {
		return (Person) super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
	}
}
