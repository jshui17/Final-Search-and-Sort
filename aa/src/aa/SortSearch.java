import java.util.ArrayList;

public class SortSearch {

	static ArrayList<Comparable> getSelection(ArrayList<Comparable> a, int n){
		int minindex=0;
		Comparable current="";
		Comparable min="";
		for(int i=0;i<n-1;i++) {
			current="";
			minindex=i;
			int z=i;
			for(int x=i+1;x<n;x++) {
				if(a.get(x).compareTo(a.get(minindex))<0) {
					minindex=x;

				}
			}
			current=a.get(minindex);
			min=a.get(z);
			a.set(z, current);
			a.set(minindex, min);
			
			
	}
		return a;
	}
	
	static ArrayList<Comparable> getInsertion(ArrayList<Comparable> a, int n){
		Comparable current;
		Comparable previous;
		for(int x=1;x<n;x++) {
			int y=x;
			while((y>0)&&(a.get(y-1).compareTo(a.get(y))>0)){
				current=a.get(y);
				previous=a.get(y-1);
				a.set(y-1, current);
				a.set(y, previous);
				y--;
			}	
		}
		return a;
	}
	
	static String searchLinear(ArrayList<Comparable> a, Comparable s) {
		String searched="";
		if(a.isEmpty()==false) {
		for(int i=0;i<a.size();i++) {
			if(s.compareTo(a.get(i))==0) {
				searched+=a.get(i) +"\n"+"\n";
					}
			}
		}
		if(searched=="") {
			searched="not found";
		}
		return searched;
	}

	static String searchBinary(ArrayList<Comparable> a, Comparable s) {
		ArrayList<Comparable> sorted= new ArrayList<Comparable>();
		sorted=getSelection(a,a.size());
		String name="";
		int start=0;
		int finish=sorted.size()-1;
		int mid=sorted.size()/2;
		while(start<=finish) {
			if(sorted.get(mid).compareTo(s)<0) {
			start=mid+1;
			}
			
			else if(sorted.get(mid).compareTo(s)>0) {
			finish=mid-1;
			}
			else {
				name+=sorted.get(mid);
				sorted.remove(mid);
				start = 0;
				mid = sorted.size()/2;
				finish = sorted.size()-1;
				continue;
			}
			mid= (start+finish)/2;
		}
		

		if(name.isEmpty()) {
			name+="not found";
		}
		
		return name;
	}
	
	
}
