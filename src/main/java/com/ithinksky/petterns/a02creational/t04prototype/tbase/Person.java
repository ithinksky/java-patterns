package com.ithinksky.petterns.a02creational.t04prototype.tbase;

import java.util.ArrayList;

/**
 * @author tengpeng.gao
 */
public class Person implements Cloneable {

	private String name;

	private int age;

	// 对象的clone和对象内的final是互相冲突的
	private ArrayList<String> hands = new ArrayList<>(2);

	public void addHand(String handName){
		this.hands.add(handName);
	}

	@Override
	public Person clone() throws CloneNotSupportedException {
		Person person = (Person) super.clone();
		// 对象的拷贝
		person.hands = (ArrayList<String>) this.hands.clone();
		return person;
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
		return "Person{" + "name='" + name + '\'' + ", age=" + age + ", hands=" + hands + '}';
	}
}
