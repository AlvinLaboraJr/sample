package sample2.dao;

import java.util.Map;

import sample2.entities.Employee;

public interface EmplDao {

	Map<Integer, Employee> getAllEmpl();

	Employee getEmplById(int id);

	void addEmpl(Employee employee);

	void updateEmpl(Employee employee);

	void deleteEmpl(Employee employee);

}
