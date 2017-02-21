
public class Contact {
	
/*An object of this class represents Contact details for a particular reservation*/
	
	private String name;
	private String address;
	private String cellNum;
	private String homeNum;
	private String other;
	
	public Contact(String name,String address,String cellNum,String homeNum,String other){
		
		this.name= name;
		this.address = address;
		this.cellNum = cellNum;
		this.homeNum = homeNum;
		this.other = other;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCellNum() {
		return cellNum;
	}
	
	public void setCellNum(String cellNum) {
		this.cellNum = cellNum;
	}

	public String getHomeNum() {
		return homeNum;
	}

	public void setHomeNum(String homeNum) {
		this.homeNum = homeNum;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}
	
}

