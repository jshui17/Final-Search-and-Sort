import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.util.ArrayList;

import BreezySwing.GBDialog;
import BreezySwing.DoubleField;

public class EmployeeDialog extends GBDialog{
	JLabel Name = addLabel ("Enter Name",1,1,1,1);

	JTextField NameField= addTextField ("",2,1,1,1);
	
	JLabel Salary = addLabel ("Enter Salary",3,1,1,1);

	DoubleField SalaryField= addDoubleField (0,4,1,1,1);
	
	JButton Submit = addButton("Submit",5,1,1,1);
	
	SortSearch Search = new SortSearch();
	
	ArrayList <Comparable> Employee;
	
	public void buttonClicked(JButton buttonObj){
		if(buttonObj==Submit) {
			if(NameField.getText().isEmpty()==false && SalaryField.getText().isEmpty()==false && SalaryField.isValidNumber()) {
				Employee.add(new Employee(NameField.getText(), SalaryField.getNumber()));
				dispose();
			}
			else {
				messageBox("Name and Salary Field cannot be empty");
			}
		}
    }
	
	
	public EmployeeDialog(JFrame parent, SortSearch s, ArrayList<Comparable> a) {
		super(parent);
		setTitle ("Add Employee");
	    setDlgCloseIndicator ("Cancel");                
	    setSize (300, 200);   
	    this.Search = s;
	    Employee=a;
	}
	
	
}





