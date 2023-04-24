package Livro;

public class LivroData {

        private String nome;
        private int edicao;
        private String autor;
        private float preco;
        private int quantidade;

        public void Livro(String nome, int edicao, String autor, float preco, int quantidade) {
            this.nome = nome;
            this.edicao = edicao;
            this.autor = autor;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getEdicao() {
            return edicao;
        }

        public void setEdicao(int edicao) {
            this.edicao = edicao;
        }

    }
