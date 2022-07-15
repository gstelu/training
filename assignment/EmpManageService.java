package assignment;

import java.util.ArrayList;

import training.MyException;

public interface EmpManageService {
	void displayEmp(ArrayList<Employee> e);
	void deleteEmp(ArrayList<Employee> e) throws MyException;
	void updateEmp(ArrayList<Employee> e) throws MyException;
	void  addEmp(ArrayList<Employee> e);
	void searchEmp(ArrayList<Employee> e) throws MyException;
}