package pattern.composite;

public class DepartamentoFinancas implements Departamento {
	
	private Integer id;
    private String nome;
 
    public void printNomeDepartamento() {
        System.out.println(getClass().getSimpleName());
    }

    public DepartamentoFinancas(Integer id, String nome) {
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
