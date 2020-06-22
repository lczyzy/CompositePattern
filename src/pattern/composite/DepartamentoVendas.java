package pattern.composite;

public class DepartamentoVendas implements Departamento {
	
	private Integer id;
    private String nome;
 
    public void printNomeDepartamento() {
        System.out.println(getClass().getSimpleName());
    }
    
    public DepartamentoVendas(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
 
  
    
	
}
