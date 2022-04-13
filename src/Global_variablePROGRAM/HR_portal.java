package Global_variablePROGRAM;

public class HR_portal {

	public static void main(String[] args) {
		Emplyee Sachin_T=new Emplyee();
		Sachin_T.emp_name="SACHIN TENDULKAR";
		Sachin_T.emp_id=10;
		Sachin_T.emp_grade='A';
		Sachin_T.emp_sal=145675327.98f;
		
		Emplyee Rahul_D=new Emplyee();
		Rahul_D.emp_name="RAHUL DRAVID";
		Rahul_D.emp_id=11;
		Rahul_D.emp_grade='B';
		Rahul_D.emp_sal=45638372.783f;
		
		Sachin_T.emp_info();
		Rahul_D.emp_info();
		
	}

}
