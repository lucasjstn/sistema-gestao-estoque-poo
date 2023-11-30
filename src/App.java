import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class App {

    public static HashMap<String, Pessoa> usuarios = new HashMap<String, Pessoa>();

    static Pessoa criarUsuarioPadrao() {
        Pessoa usuarioPadrao = new Pessoa(1, "lucas", "23847243-23", "2.234.234", "(81) 98433-2342", "lucas7@email.com", "23/23/2023", "06/02/2023");

        return usuarioPadrao;
    }

    static void menuEntrar(Pessoa pessoa) {
        String nome = pessoa.getNome();
        System.out.printf("\033[1mBem vindo "+nome.toUpperCase()+":\033[0m\n");
        System.out.printf("1 Cadastrar Fornecedor:\n");

        int opcao = Integer.parseInt(System.console().readLine());

        switch (opcao) {
            case 1:
                cadastrarFornecedor();
                break;
        
            default:
                break;
        }
    }

    static void menuInicial() {
            System.out.printf("\033[1mMenu:\033[0m\n");
            System.out.printf("1 Criar usuário:\n");
            System.out.printf("2 Entrar:\n");
            System.out.printf("3 Sair:\n");

            int opcao = Integer.parseInt(System.console().readLine());
            switch (opcao) {
                case 1:
                    System.out.println("Criar usuário:");
                    break;
                case 2:
                    System.out.println("Insira seu email:");
                    String email = System.console().readLine();
                    if(usuarios.containsKey(email)) {
                        menuEntrar(usuarios.get(email));
                    } else {
                        System.out.println("Errado");
                    }
                    break; 
                case 3:
                    break;
                default:
                    break;
        }
    }
    public static void main(String[] args) throws Exception {

        Pessoa novoUsuario = criarUsuarioPadrao();
        usuarios.put(novoUsuario.getEmail(), novoUsuario);

        menuInicial();

        // Estoque estoque = new Estoque();

        // estoque.adicionarProduto("ProdutoA", 10);
        // estoque.adicionarProduto("ProdutoB", 15);

        // estoque.listarProdutos();

        }
    }

    class Produto {
        private int id;
        private int codigo;
        private String nome;
        private String descricao;
        private String fornecedor;
        private String dataCadastro;

        public Produto(int id, int codigo, String nome, String descricao, String fornecedor, String dataCadastro) {
            this.id = id;
            this.codigo = codigo;
            this.nome = nome;
            this.descricao = descricao;
            this.fornecedor = fornecedor;
            this.dataCadastro = dataCadastro;
        }

        public int getCodigo() {
            return codigo;
        }

        public String getDataCadastro() {
            return dataCadastro;
        }

        public String getDescricao() {
            return descricao;
        }

        public String getFornecedor() {
            return fornecedor;
        }

        public int getId() {
            return id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setFornecedor(String fornecedor) {
            this.fornecedor = fornecedor;
        }
        
    }

    class Pessoa {
    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private String telefone;
    private String email;
    private String dataCadastro;
    private String dataNascimento;

    // Construtor
    public Pessoa(int id, String nome, String cpf, String rg, String telefone, String email, String dataCadastro, String dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.email = email;
        this.dataCadastro = dataCadastro;
        this.dataNascimento = dataNascimento;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}

    class Fornecedor extends Pessoa {
    private String cnpj;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public Fornecedor(int id, String nome, String cpf, String rg, String telefone, String email, String dataCadastro, String dataNascimento,
                      String cnpj, String logradouro, String bairro, String cidade, String estado, String cep) {
        super(id, nome, cpf, rg, telefone, email, dataCadastro, dataNascimento);
        this.cnpj = cnpj;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}

    class Estoque {
        private Map<String, Integer> produtos;

        public Estoque() {
            this.produtos = new HashMap<>();
        }

        public void adicionarProduto(String produto, int quantidade) {
            if (produtos.containsKey(produto)) {
                int quantidadeAtual = produtos.get(produto);
                produtos.put(produto, quantidadeAtual + quantidade);
            } else {
                produtos.put(produto, quantidade);
            }
            System.out.println(quantidade + " unidades de " + produto + " foram adicionadas ao estoque.");
        }

        public void removerProduto(String produto, int quantidade) {
            if (produtos.containsKey(produto)) {
                int quantidadeAtual = produtos.get(produto);
                if (quantidadeAtual >= quantidade) {
                    produtos.put(produto, quantidadeAtual - quantidade);
                    System.out.println(quantidade + " unidades de " + produto + " foram removidas do estoque.");
                } else {
                    System.out.println("Quantidade insuficiente de " + produto + " no estoque.");
                }
            } else {
                System.out.println(produto + " não encontrado no estoque.");
            }
        }

        public void atualizarProduto(String produto, int novaQuantidade) {
            produtos.put(produto, novaQuantidade);
            System.out.println("Estoque de " + produto + " atualizado para " + novaQuantidade + " unidades.");
        }

        public void listarProdutos() {
            System.out.println("Produtos disponíveis no estoque:");
            for (Map.Entry<String, Integer> entry : produtos.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " unidades");
            }
        }
    }

