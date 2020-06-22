package pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoChefe implements Departamento {
    private Integer id;
    private String nome;
 
    private List<Departamento> departamentoFilhos;
 
    public DepartamentoChefe(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
        this.departamentoFilhos = new ArrayList<>();
    }
 
    public void printNomeDepartamento() {
    	departamentoFilhos.forEach(Departamento::printNomeDepartamento);
    }
 
    public void addDepartamento(Departamento departmento) {
    	departamentoFilhos.add(departmento);
    }
 
    public void removerDepartment(Departamento departmento) {
    	departamentoFilhos.remove(departmento);
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

	public List<Departamento> getDepartamentoFilhos() {
		return departamentoFilhos;
	}

	public void setDepartamentoFilhos(List<Departamento> departamentoFilhos) {
		this.departamentoFilhos = departamentoFilhos;
	}

	
    
    
    
}