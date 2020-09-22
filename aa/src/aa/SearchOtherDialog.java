import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.util.ArrayList;

import BreezySwing.GBDialog;
import BreezySwing.DoubleField;

public class SearchOtherDialog extends GBDialog{
	JLabel Name = addLabel ("Enter Salary or Number Sold",1,1,1,1);

	DoubleField InputField= addDoubleField (0,2,1,1,1);
	
	JButton Submit = addButton("Search Employees using Linear Search",3,1,1,1);
	
	JButton Submit2 = addButton("Search Widget using Linear Search",4,1,1,1);
	
	JButton Submit3 = addButton("Search Employees using Binary Search",5,1,1,1);
	
	JButton Submit4 = addButton("Search Widget using Binary Search",6,1,1,1);
	
	SortSearch Search = new SortSearch();
	
	ArrayList <Comparable> Array;
	
	public void buttonClicked(JButton buttonObj){
		if(buttonObj==Submit) {
			Employee x= new Employee("a",InputField.getNumber());
			ArrayList<Comparable> Sorted= new ArrayList<Comparable>();
			Sorted.clear();
			if(InputField.getText().isEmpty()==false) {
			for(int i=0;i<Array.size();i++) {
				if(Array.get(i) instanceof Employee) {
					Sorted.add(Array.get(i));
				}
			}
			messageBox(Search.searchLinear(Sorted, x));
			dispose();
			}
			else {
				messageBox("Name Field cannot be empty");
			}
		}
		
		if(buttonObj==Submit2) {
			Widget x = new Widget (1,(int)InputField.getNumber());
			if(InputField.getText().isEmpty()==false) {
				ArrayList<Comparable> Sorted= new ArrayList<Comparable>();
				Sorted.clear();
				if(InputField.getText().isEmpty()==false) {
				for(int i=0;i<Array.size();i++) {
					if(Array.get(i) instanceof Widget) {
						Sorted.add(Array.get(i));
					}
				}
				messageBox(Search.searchLinear(Sorted, x));
				dispose();
			}
		}
			else {
				messageBox("Name Field cannot be empty");
			}		
    }
		if(buttonObj==Submit3) {
			Employee x= new Employee("a",InputField.getNumber());
			ArrayList<Comparable> Sorted= new ArrayList<Comparable>();
			Sorted.clear();
			if(InputField.getText().isEmpty()==false) {
			for(int i=0;i<Array.size();i++) {
				if(Array.get(i) instanceof Employee) {
					Sorted.add(Array.get(i));
				}
			}
			messageBox(Search.searchBinary(Sorted, x));
			dispose();
			}
			else {
				messageBox("Name Field cannot be empty");
			}
		}
		
		if(buttonObj==Submit4) {
			Widget x = new Widget (1,(int)InputField.getNumber());
			if(InputField.getText().isEmpty()==false) {
				ArrayList<Comparable> Sorted= new ArrayList<Comparable>();
				Sorted.clear();
				if(InputField.getText().isEmpty()==false) {
				for(int i=0;i<Array.size();i++) {
					if(Array.get(i) instanceof Widget) {
						Sorted.add(Array.get(i));
					}
				}
				messageBox(Search.searchBinary(Sorted, x));
				dispose();
			}
		}
			else {
				messageBox("Name Field cannot be empty");
			}	
		}
}	
	
	public SearchOtherDialog(JFrame parent,SortSearch s, ArrayList<Comparable> a) {
		super(parent);
		setTitle ("Search for Employee or Widget");
	    setDlgCloseIndicator ("Cancel");                
	    setSize (300, 200); 
	    this.Search = s;
	    Array=a;
	}
	
	
}





