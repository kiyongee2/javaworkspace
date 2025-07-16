package generics.product;

public class Product<T, M> {
	private T kind;
	private M model;
	
	//setter, getter
	public void setKind(T kind) {
		this.kind = kind;
	}
	
	public T getKind() {
		return kind;
	}
	
	public void setModel(M model) {
		this.model = model;
	}
	
	public M getModel() {
		return model;
	}
}
