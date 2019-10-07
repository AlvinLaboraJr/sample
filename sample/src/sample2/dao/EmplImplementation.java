package sample2.dao;

import java.util.HashMap;
import java.util.Map;

import sample2.entities.Employee;

public class EmplImplementation implements EmplDao {

	private Map<Integer, Employee> employees;

	public EmplImplementation() {
		employees = new HashMap<Integer, Employee>();
	}

	@Override
	public Map<Integer, Employee> getAllEmpl() {
		return employees;
	}

	@Override
	public Employee getEmplById(int id) {
		return employees.get(id);
	}

	@Override
	public void addEmpl(Employee employee) {
		employees.put(employee.getId(), employee);

	}

	@Override
	public void updateEmpl(Employee employee) {
		employees.replace(employee.getId(), employee);

	}

	@Override
	public void deleteEmpl(Employee employee) {
		employees.remove(employee.getId());

	}

}
