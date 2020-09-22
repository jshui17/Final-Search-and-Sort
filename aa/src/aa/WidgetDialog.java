import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.util.ArrayList;

import BreezySwing.GBDialog;
import BreezySwing.IntegerField;
import BreezySwing.DoubleField;

public class WidgetDialog extends GBDialog{
	JLabel Code = addLabel ("Enter Code",1,1,1,1);

	IntegerField CodeField= addIntegerField (0,2,1,1,1);
	
	JLabel Sold = addLabel ("Enter amount sold",3,1,1,1);

	IntegerField SoldField= addIntegerField (0,4,1,1,1);
	
	JButton Submit = addButton("Submit",5,1,1,1);
	
	SortSearch Search = new SortSearch();

	ArrayList <Comparable> Widget;
	
	public void buttonClicked(JButton buttonObj){

		if(buttonObj==Submit) {
			if(CodeField.getText().isEmpty()==false && SoldField.getText().isEmpty()==false && CodeField.isValidNumber() && SoldField.isValidNumber() && SoldField.getNumber()>=0) {
				if(CodeField.getNumber()>=100 && CodeField.getNumber()<=999) {
					Widget.add(new Widget(CodeField.getNumber(), SoldField.getNumber()));
					dispose();
				}
				else {
					messageBox("Code must be a three digit integer between 100 and 999");
				}
			}
			else {
				messageBox("Code and Sold Field cannot be empty and must be valid numbers");
			}
		}
    }
	
	
	public WidgetDialog(JFrame parent, SortSearch s, ArrayList<Comparable> a) {
		super(parent);
		setTitle ("Add Widget");
	    setDlgCloseIndicator ("Cancel");                
	    setSize (300, 200);   
	    this.Search = s;
	    Widget=a;
	}
}








