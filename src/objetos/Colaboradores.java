package objetos;

public class Colaboradores {
	private String nome;
	private int cpf;
	private String posicao;	
	private String email;
	private int quantidadeDeProjetos = 0;
	private int projetos[] = new int[100];
	private String publicacoes[] = new String[100];
	private String orientacoes[] = new String[100];
		
	public Colaboradores(String nome, int cpf, String posicao, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.posicao = posicao;
		this.email = email;
		for(int i = 0; i < 100; i++) {
			publicacoes[i] = null;
			orientacoes[i] = null;
		}
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public String getPosicao() {
		return posicao;
	}
	
	public void setPosicao(String posicao) {
		if(posicao.equalsIgnoreCase("Gradua��o") || posicao.equalsIgnoreCase("Mestrado") || 
				posicao.equalsIgnoreCase("Doutorado") || posicao.equalsIgnoreCase("Professor") || 
				posicao.equalsIgnoreCase("Pesquisador"))
			this.posicao = posicao;
		else
			System.out.println("Entrada Inv�lido!");
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getQuantidadeDeProjetos() {
		return quantidadeDeProjetos;
	}
	
	public void setQuantidadeDeProjetos(boolean a) {
		if(a) {
			quantidadeDeProjetos ++;
		} else {
			quantidadeDeProjetos --;
		}
	}

	public int getProjetos(int i) {
		System.out.println(projetos[i]);
		return projetos[i];
	}
	
	public void addProjeto(int matricula) {
		this.projetos[quantidadeDeProjetos] = matricula;
		quantidadeDeProjetos ++;
	}

	public String[] getPublicacoes() {
		return publicacoes;
	}

	public void setPublicacoes(String titulo) {
		int i = 0;
		while(publicacoes[i] != null) {
				i++;
		}
		publicacoes[i] = titulo;		
	}

	public String[] getOrientacoes() {
		return orientacoes;
	}

	public void setOrientacoes(String titulo) {
		int i = 0;
		while(orientacoes[i] != null) {
				i++;
		}
		orientacoes[i] = titulo;
	}
}
