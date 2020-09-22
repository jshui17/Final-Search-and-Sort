import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.util.ArrayList;
import BreezySwing.GBFrame;

public class GUI extends GBFrame{
	 JButton AddEmployee = addButton ("Add Employee", 1,1,1,1);
	 JButton AddStudent = addButton ("Add Student", 2,1,1,1);
	 JButton AddWidget = addButton ("Add Widget", 3,1,1,1);
	 JButton PrintSelectionEmployees = addButton ("Print Employees using selection sort", 4,1,1,1);
	 JButton PrintSelctionStudents = addButton ("Print Students using selection sort", 5,1,1,1);
	 JButton PrintSelectionWidget = addButton ("Print Widgets using selection sort", 6,1,1,1);
	 JButton PrintInsertionEmployees = addButton ("Print Employees using insertion sort", 7,1,1,1);
	 JButton PrintInsertionStudents = addButton ("Print Students using insertion sort", 8,1,1,1);
	 JButton PrintInsertionWidget = addButton ("Print Widget using insertion sort", 9,1,1,1);
	 JButton SearchStudent = addButton ("Search for Students by name", 10,1,1,1);
	 JButton SearchOther = addButton ("Search for Employee or Widget by Salary or Amount Sold", 11,1,1,1);
	 JLabel nm = addLabel("Jonathan Shui 2019",12,1,1,1);
	 
	 SortSearch Search = new SortSearch();
	 
	 @SuppressWarnings("rawtypes")
	ArrayList<Comparable> a = new ArrayList<Comparable>();

	 @SuppressWarnings({ "rawtypes", "static-access" })
	public void buttonClicked(JButton buttonobj) {
		 if(buttonobj==AddEmployee) {
			 EmployeeDialog Employee= new EmployeeDialog(this, Search, a);
			 Employee.setVisible(true);
		 }
		 if(buttonobj==AddStudent){
			 StudentDialog Student = new StudentDialog(this, Search, a);
			 Student.setVisible(true);
		 }
		 if(buttonobj==AddWidget){
			 WidgetDialog Widget= new WidgetDialog(this, Search, a);
			 Widget.setVisible(true);
		 }
		 if(buttonobj==PrintSelectionEmployees) {
			 ArrayList<Comparable> Employees = new ArrayList<>();
			 for(int i=0;i<a.size();i++) {
				 if(a.get(i) instanceof Employee) {
					 Employees.add(a.get(i));
				 }
			 }
			 if(Search.getSelection(Employees, Employees.size()).isEmpty()) {
				 messageBox("Empty array");
			 }
			 else {
			 messageBox(Search.getSelection(Employees, Employees.size()));
			 }
		 }
		 
		 if(buttonobj==PrintSelctionStudents) {
			 ArrayList<Comparable> Students = new ArrayList<>();
			 for(int i=0;i<a.size();i++) {
				 if(a.get(i) instanceof Student) {
					 Students.add(a.get(i));
				 }
			 }
			 if(Search.getSelection(Students, Students.size()).isEmpty()) { 
				 messageBox("Empty array");
			 }
			 else {
				 messageBox(Search.getSelection(Students, Students.size()));	 
			 }
		 }
		 
		 if(buttonobj==PrintSelectionWidget) {
			 ArrayList<Comparable> Widgets = new ArrayList<>();
			 for(int i=0;i<a.size();i++) {
				 if(a.get(i) instanceof Widget) {
					 Widgets.add(a.get(i));
				 }
			 }
			 if(Search.getSelection(Widgets, Widgets.size()).isEmpty()) {
				 messageBox("Empty array");
			 }
			 else {
			 messageBox(Search.getSelection(Widgets, Widgets.size()));
			 }
		 }
		 
		 if(buttonobj==PrintInsertionEmployees) {
			 ArrayList<Comparable> Employees = new ArrayList<>();
			 for(int i=0;i<a.size();i++) {
				 if(a.get(i) instanceof Employee) {
					 Employees.add(a.get(i));
				 }
			 }
			 if(Search.getInsertion(Employees, Employees.size()).isEmpty()) {
				 messageBox("Empty array");
			 }
			 else {
			 messageBox(Search.getInsertion(Employees, Employees.size()));
			 }
		 }
		 
		 if(buttonobj==PrintInsertionStudents) {
			 ArrayList<Comparable> Students = new ArrayList<>();
			 for(int i=0;i<a.size();i++) {
				 if(a.get(i) instanceof Student) {
					 Students.add(a.get(i));
				 }
			 }
			 if(Search.getInsertion(Students, Students.size()).isEmpty()) {
				 messageBox("Empty array");
			 }
			 else {
			 messageBox(Search.getInsertion(Students, Students.size()));
			 }
		 }
		 
		 if(buttonobj==PrintInsertionWidget) {
			 ArrayList<Comparable> Widgets = new ArrayList<>();
			 for(int i=0;i<a.size();i++) {
				 if(a.get(i) instanceof Widget) {
					 Widgets.add(a.get(i));
				 }
			 }
			 if(Search.getInsertion(Widgets, Widgets.size()).isEmpty()) {
				 messageBox("Empty array");
			 }
			 else {
			 messageBox(Search.getInsertion(Widgets, Widgets.size()));
			 }
		 }
		 
		 if(buttonobj==SearchStudent) {
			 StudentSearch Student= new StudentSearch(this, Search, a);
			 Student.setVisible(true);
		 }
		 
		 if(buttonobj==SearchOther) {
			 SearchOtherDialog SearchD = new SearchOtherDialog(this,Search, a);
			 SearchD.setVisible(true);
		 }
		 
	 }
	 
	
	 public static void main(String[] args){
		    JFrame frm = new GUI();
		    frm.setTitle ("Final Search and Sort");
		    frm.setSize (750, 250);
		    frm.setVisible (true);
	 }
}






