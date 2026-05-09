public class Familia {
    private String encarregadoEducacao;
    private String ParentescoEncEducacao;
    private String aluno;

    public Familia() {
        this.encarregadoEducacao = "";
        ParentescoEncEducacao = "";
        this.aluno = "";
    }

    public Familia(String encarregadoEducacao, String parentescoEncEducacao, String aluno) {
        this.encarregadoEducacao = encarregadoEducacao;
        ParentescoEncEducacao = parentescoEncEducacao;
        this.aluno = aluno;
    }

    public String getEncarregadoEducacao() {
        return encarregadoEducacao;
    }

    public void setEncarregadoEducacao(String encarregadoEducacao) {
        this.encarregadoEducacao = encarregadoEducacao;
    }

    public String getParentescoEncEducacao() {
        return ParentescoEncEducacao;
    }

    public void setParentescoEncEducacao(String parentescoEncEducacao) {
        ParentescoEncEducacao = parentescoEncEducacao;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    @Override
    public String toString() {
        return "Familia [encarregadoEducacao=" + encarregadoEducacao + ", ParentescoEncEducacao="
                + ParentescoEncEducacao + ", aluno=" + aluno + "]";
    }

    public String getInfoEncEducacao() {
        return "Familia [encarregadoEducacao=" + "" + ", ParentescoEncEducacao="
                + ParentescoEncEducacao + ", aluno=" + aluno + "]";
    }

    public String getInfoFamilia() {
        return "Familia [encarregadoEducacao=" + "" + ", ParentescoEncEducacao="
                + ParentescoEncEducacao + ", aluno=" + aluno + "]";
    }
}
