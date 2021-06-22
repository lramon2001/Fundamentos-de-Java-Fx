package repositorios.interfaces;


import java.util.ArrayList;
import java.util.List;



public interface AgendaRepositorio<T>{
	
	List<T> selecionar();
	void inserir(T entidade);
	void atualizar(T entidade);
	void excluir (T entidade);
	
	
	

}
