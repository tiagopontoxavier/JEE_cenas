import io.altar.jseproject.Repository.ProductRepository;

public class Product extends Entity {
	
	private Integer id;
	private Integer desconto;
	private Integer iva;
	private double preco;
	
	public Product(Integer id, Integer desconto, Integer iva, Double preco){
		this.id = id;
		this.desconto = desconto;
		this.iva = iva;
		this.preco = preco;
		ProductRepository.getInstance().addToList(this);
	} 
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Id:" + id + " Desconto: " + desconto +"%" + "| Iva: " + iva +"%" + "| Preco: " + preco ;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDesconto() {
		return desconto;
	}

	public void setDesconto(Integer desconto) {
		this.desconto = desconto;
	}

	public Integer getIva() {
		return iva;
	}

	public void setIva(Integer iva) {
		this.iva = iva;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
