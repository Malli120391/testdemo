package com.javacodes.test;

import java.util.HashSet;
import java.util.Set;

public class EqualsHachcodeEx {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1, "Malleswara");
		Employee emp2 = new Employee(1, "Malleswara");
		
		//System.out.println(emp1 == emp2);
		
		
		System.out.println(emp1.equals(emp2));

		Set<Employee> employee = new HashSet<>();
		employee.add(emp1);
		employee.add(emp2);
		
		System.out.println(employee);
	}

}
class Employee extends Object{
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	
}