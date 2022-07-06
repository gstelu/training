package assignment;

import java.util.ArrayList;

public interface EmpManagService {
	void displayEmp(ArrayList<Employee> e);
	void deleteEmp(ArrayList<Employee> e) throws MyException;
	void updateEmp(ArrayList<Employee> e) throws MyException;
	void  addEmp(ArrayList<Employee> e);
	void searchEmp(ArrayList<Employee> e) throws MyException;
}
