package aa;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import BreezySwing.GBFrame;
import java.util.Random;

public class mainFrame{
	static int [] x= new int[10];
	String first="";
	String last="";
	static ArrayList<String> possibleNames = new ArrayList<String>();
	
	public mainFrame(String firstName, String lastName) {
		first=firstName;
		last=lastName;
		for(int i=1;i<lastName.length();i++) {
			possibleNames.add(first+last.substring(0,i));
		}
	}
	
	public static void main(String[] args) {
		String [] n = new String[3];
		n[0]="hi";
		n[1]="c";
		n[2]="f";
		possibleNames.add("b");
		setAvailableUserNames(n);
	}
	
	public static void setAvailableUserNames(String[] usedNames) {
		for(int i=0;i<usedNames.length;i++) {
			for(int x=0;x<possibleNames.size();x++) {
				if(usedNames[i].equals(possibleNames.get(x))) {
					possibleNames.remove(x);
				}
			}
		}
		System.out.println(possibleNames);
	}

	
	public static double computeBonusThreshold() {
		double answer=0;
		int min=x[0];
		int max=x[0];
		for(int i=0;i<x.length;i++) {
			answer+=x[i];
			if(x[i]>max) {
				max=x[i];
			}
			if(x[i]<min) {
				min=x[i];
			}
		}
		answer=(answer-(max+min))/(x.length-2);
		return answer;
	}
	
	public static void computeWages(double fixedWage, double perItemWage) {
		double bonus=computeBonusThreshold();
		double [] wages = new double[x.length];
		for(int i=0;i<wages.length;i++) {
			if(x[i]<=bonus) {
				wages[i]=fixedWage+perItemWage*x[i];
			}
			else {
				wages[i]=(fixedWage+perItemWage*x[i])*1.1;
			}
		}
	}
}

