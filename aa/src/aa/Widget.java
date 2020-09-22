public class Widget implements Comparable {

	private int productNum;
	private int numSold;
	
	public Widget(int num, int sold) {
		productNum=num;
		numSold=sold;
	}
	public int getProductNum() {
		return productNum;
	}
	public int getNumSold() {
		return numSold;
	}
	public String toString() {
		return "\n" + "Product Number: " + productNum + "\n" + "Amount Sold: " + numSold + "\n";
	}
	
	public int compareTo(Object obj) {
		if(((Widget)(obj)).getNumSold()<(this.getNumSold())){
			return -1;
		}
		if(((Widget)(obj)).getNumSold()>(this.getNumSold())){
			return 1;
		}
		else{
			return 0;
		}
	}
}



