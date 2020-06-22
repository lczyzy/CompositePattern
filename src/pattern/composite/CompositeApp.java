package pattern.composite;

public class CompositeApp {
    public static void main(String args[]) {
    	
        Departamento departamentoVendas = new DepartamentoVendas( 1, "Departamentos Vendas");
        Departamento departamentoFinancas = new DepartamentoFinancas( 2, "Departamento Finanças");
 
        DepartamentoChefe departamentoChefe = new DepartamentoChefe(3, "Departamento Chefe");
 
        departamentoChefe.addDepartamento(departamentoVendas);
        departamentoChefe.addDepartamento(departamentoFinancas);
 
        departamentoChefe.printNomeDepartamento();
    }
}

//https://www.baeldung.com/java-composite-pattern#leafs