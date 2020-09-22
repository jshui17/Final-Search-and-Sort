import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.util.ArrayList;

import BreezySwing.GBDialog;
import BreezySwing.DoubleField;

public class StudentDialog extends GBDialog{
	JLabel Name = addLabel ("Enter Name",1,1,1,1);

	JTextField NameField= addTextField ("",2,1,1,1);
	
	JLabel GPA = addLabel ("Enter GPA",3,1,1,1);

	DoubleField GPAField= addDoubleField (0,4,1,1,1);
	
	JButton Submit = addButton("Submit",5,1,1,1);
	
	SortSearch Search = new SortSearch();
	
	ArrayList <Comparable> Student;
	
	public void buttonClicked(JButton buttonObj){
		if(buttonObj==Submit) {
			if(NameField.getText().isEmpty()==false && GPAField.getText().isEmpty()==false && GPAField.isValidNumber()) {
				if(GPAField.getNumber()>=0 && GPAField.getNumber()<=5) {
					Student.add(new Student(NameField.getText(), GPAField.getNumber()));
					dispose();
				}
				else {
					messageBox("Invalid GPA");
				}
			}
			else {
				messageBox("Name and GPA Field cannot be empty");
			}
		}
    }
	
	
	public StudentDialog(JFrame parent, SortSearch s, ArrayList<Comparable> a) {
		super(parent);
		setTitle ("Add Student");
	    setDlgCloseIndicator ("Cancel");                
	    setSize (300, 200);   
	    this.Search = s;
	    Student=a;
	}
}








