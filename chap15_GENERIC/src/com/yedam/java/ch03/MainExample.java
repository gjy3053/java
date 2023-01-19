package com.yedam.java.ch03;

public class MainExample {

	public static void main(String[] args) {
		//Course1
		Person person = new Person();
		Applicant<Person> applicant = new Applicant<>(person);
		//Course.registerCouse1(applicant); 
		
	
		Course.registerCouse1(new Applicant<Person>(new Person())); 
		Course.registerCouse1(new Applicant<Worker>(new Worker()));
		Course.registerCouse1(new Applicant<Student>(new Student()));
		Course.registerCouse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCouse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		
		Course.registerCouse2(new Applicant<Person>(new Person())); 
		Course.registerCouse2(new Applicant<Worker>(new Worker()));
		//Course.registerCouse2(new Applicant<Student>(new Student()));
		//Course.registerCouse2(new Applicant<HighStudent>(new HighStudent()));
		//Course.registerCouse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		
		//Course.registerCouse3(new Applicant<Person>(new Person())); 
		//Course.registerCouse3(new Applicant<Worker>(new Worker()));
		Course.registerCouse3(new Applicant<Student>(new Student()));
		Course.registerCouse3(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCouse3(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		

	}

}
