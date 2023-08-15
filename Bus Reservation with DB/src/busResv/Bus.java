package busResv;

public class Bus {

	private int busNo;
	private boolean ac;
	private int capacity;
	
	Bus(int no,boolean ac, int cap){
		this.busNo =no;
		this.ac=ac;
		this.capacity=cap;
	}
	public int getBusNo() {
		return busNo;
	}
	public boolean isac(){
		return ac;
	}
	public void setac(boolean ac) {
		ac=ac;
	}
	public int getCapacity(){
		return capacity;
	}
	public void setCapacity(int cap) {
		capacity=cap;
	}
	public void displayBusInfo() {
		System.out.println("Bus no "+busNo+" Ac : "+ac+" Total capacity: "+capacity);
	}
}
