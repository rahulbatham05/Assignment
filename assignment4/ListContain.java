package assignment4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListContain {

	// Write a program which will accept List of String and produce another List of
	// string of
	// which will have only values which starts with git
	// Input – Git, Github, GitLab,GitBash, Selenium, Java, Maven
	// Output- Git, Github, Gitlab, GitBash

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		list.add("Git");
		list.add("Github");
		list.add("GitLab");
		list.add("GitBash");
		list.add("Selenium");
		list.add("Java");
		list.add("Maven");

		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).startsWith("Git")) {

				//System.out.println(list.get(i));
				list2.add(list.get(i));

			}

		}
		System.out.println(list2);
	}
}
