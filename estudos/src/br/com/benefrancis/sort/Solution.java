package br.com.benefrancis.sort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//Complete the code

/**
 * Desafio:
 * https://www.hackerrank.com/challenges/java-sort/problem?isFullScreen=true
 * 
 * 
 * Adaptei para ler arquivo no diretório.
 * 
 * estudantes.txt
 * 
 * 33,Rumpa,3.68 85,Ashis,3.85 56,Samiha,3.75 19,Samara,3.75 22,Fahim,3.76
 * 
 * 
 * c:\tmp\estudantes.txt
 * 
 * 
 * @author Francis
 *
 */
public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Locale.setDefault(Locale.US);

		System.out.println("Enter full file path: ");
		String path = in.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Student> l = new ArrayList<>();

			String line = br.readLine();

			while (line != null) {

				String[] fields = line.split(",");

				l.add(new Student(Integer.parseInt(fields[0]), fields[1], Double.parseDouble(fields[2])));

				line = br.readLine();

			}

			Collections.sort(l, Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getFname)
					.thenComparing(Student::getId));

			for (Student st : l) {
				System.out.println(st.getFname());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}
