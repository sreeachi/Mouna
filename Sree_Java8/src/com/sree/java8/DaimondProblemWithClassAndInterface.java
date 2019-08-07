package com.sree.java8;

public class DaimondProblemWithClassAndInterface extends poet1 implements writer1 {

	public static void main(String[] args) {
		DaimondProblemWithClassAndInterface dbs = new DaimondProblemWithClassAndInterface();
		dbs.write();
	}
}

class poet1 {
	public void write() {
		System.out.println("am from poet's writing");
	}
}

interface writer1 {
	default void write() {
		System.out.println("am from writer's writing");
	}
}