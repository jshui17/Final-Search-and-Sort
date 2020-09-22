import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.util.ArrayList;

import BreezySwing.GBDialog;
import BreezySwing.DoubleField;

public class StudentSearch extends GBDialog{
	JLabel Name = addLabel ("Enter Name of Student to be searched",1,1,1,1);

	JTextField NameField= addTextField ("",2,1,1,1);
	
	JButton Insertion = addButton("Search Linear",3,1,1,1);
	
	JButton Binary = addButton("Search Binary",4,1,1,1);
	
	SortSearch Search = new SortSearch();
	
	ArrayList <Comparable> Students;
	
	
	
	public void buttonClicked(JButton buttonObj){
		Student x= new Student(NameField.getText(),0);
		if(buttonObj==Insertion) {
			ArrayList<Comparable> Sorted= new ArrayList<Comparable>();
			Sorted.clear();
			if(NameField.getText().isEmpty()==false) {
			for(int i=0;i<Students.size();i++) {
				if(Students.get(i) instanceof Student) {
					Sorted.add(Students.get(i));
				}
			}
			messageBox(Search.searchLinear(Sorted, x));
			dispose();
			}
			else {
				messageBox("Name Field cannot be empty");
			}
		}
		
		if(buttonObj==Binary) {
			ArrayList<Comparable> Sorted= new ArrayList<Comparable>();
			Sorted.clear();
			if(NameField.getText().isEmpty()==false) {
			for(int i=0;i<Students.size();i++) {
				if(Students.get(i) instanceof Student) {
					Sorted.add(Students.get(i));
				}
			}
			messageBox(Search.searchBinary(Sorted, x));
			dispose();
			}
			else {
				messageBox("Name Field cannot be empty");
			}
		}
    }
	
	
	public StudentSearch(JFrame parent, SortSearch s, ArrayList<Comparable> a) {
		super(parent);
		setTitle ("Search for Student");
	    setDlgCloseIndicator ("Cancel");                
	    setSize (300, 200);   
	    this.Search = s;
	    Students=a;
	}
	
	
}





