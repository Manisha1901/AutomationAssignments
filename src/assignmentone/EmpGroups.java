package assignmentone;

public class EmpGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		
		String[] employeenames = new String[3];
		employeenames[0]=emp.empname1;
		employeenames[1]=emp.empname2;
		employeenames[2]=emp.empname1;
		
		int[] employeeIds = new int[3];
		employeeIds[0]=emp.empid1;
		employeeIds[1]=emp.empid2;
		employeeIds[2]=emp.empid3;
		
		System.out.println("Employee Name:"+ employeenames[0] +"," +"Employee ID:" +emp.empid1);
			
	}
	}


