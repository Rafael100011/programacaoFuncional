package entities;

public class ImportedProduct extends Product{
	
	private Double customFee;
	
	public ImportedProduct() {
	}
	
	public ImportedProduct(String name,Double customFee,Double price) {
		super(name,price);
		this.customFee = customFee;
	}
	
	
	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}

	@Override
	public String priceTag() {
		return getName() +" $ ";
	}
	
	public Double totalPrice() {
		return customFee - getPrice() ;
	}
	public String toString() {
		return priceTag() + totalPrice();
	}
}
