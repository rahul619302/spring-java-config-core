package com.lti.controller;

import java.util.Scanner;
import java.util.function.Predicate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lti.TestAppConfig;

@SuppressWarnings("all")
public class MainClass {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(TestAppConfig.class);
		StudentController controller = ctx.getBean(StudentController.class);

		String isContinue = "ds";
		Scanner scanner = new Scanner(System.in);
		while (!"quit".equalsIgnoreCase(isContinue)) {
			System.out.println("Chosse Opperation among add, view and quit");
			Predicate<String> predicate = s -> "quit".equalsIgnoreCase(s);
			Predicate<String> predicate1 = s -> "add".equalsIgnoreCase(s);
			isContinue = scanner.next();
			if (predicate.test(isContinue))
				break;
			else if (predicate1.test(isContinue))
				addStudent(scanner, controller);
			else
				controller.displayStudent();

		}
		scanner.close();
	}

	private static void addStudent(Scanner scanner, StudentController controller) {
		System.out.println("Enter roll : ");
		int roll = Integer.valueOf(scanner.next());
		System.out.println("Enter name : ");
		String name = scanner.next();
		controller.saveStudent(roll, name);
	}

}
