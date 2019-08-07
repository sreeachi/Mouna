package com.sree.java8;

public class DaimondProblem implements poet, writer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaimondProblem db = new DaimondProblem();
		db.write();
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		//poet.super.write();
		//writer.super.write();
		System.out.println("Am from mainclass's writing");
	}
}

interface poet {
	default void write() {
		System.out.println("Am from poet's writing");
	}
}

interface writer {
	default void write() {
		System.out.println("am from writer's writing");
	}
}
