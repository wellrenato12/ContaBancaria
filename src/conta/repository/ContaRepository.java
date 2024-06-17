package conta.repository;

import conta.model.Conta;

public interface ContaRepository {
	//CRUD
	public void procurarPorNumero(int numero);
	public void listarTodas();
	public void cadastrar(int numero);
	public void procurarPorNumero(Conta conta);
	public void deletar(int numero);
	
	//Métodos bancários
	public void sacar(int numero, float valor);
	public void depositar(int numero, float valor);
	public void transferir(int numeroOrigem, int numeroDestino, float valor);
}
