import java.util.ArrayList;

public class Box {
    private int numero;
    private String servicopermitido;
    private int capacidade;
    private String localizacao;
    private ArrayList<OrdemServico> OrdensServicos;

    public Box(int numero, String servicopermitido, int capacidade, String localizacao){
        this.setNumero(numero);
        this.setServicopermitido(servicopermitido);
        this.setCapacidade(capacidade);
        this.setLocalizacao(localizacao);

    }
    public void adicionarOrdemServico(OrdemServico ordemServico){
        if (this.getServicopermitido() == ordemServico.getServico()) {
            if (ordemServico.getStatus() != "aberta") {

                getOrdensServicos().add(ordemServico);

            }
        }
    }
    public void removerOrdensServicos(){
        int total = 0;
        for (OrdemServico o: this.getOrdensServicos()){
            if (o.getStatus()=="finalizada"){
                getOrdensServicos().remove(o);
            }
        }
        System.out.println(("Quantidade total: "+total));
    }
    public void exibirOrdensSercos(){
        int total = 0;
        for (OrdemServico o: this.getOrdensServicos()){
            System.out.println("Ordem Serviço"+"\ncodigo: "+ o.getCodigo()+ "\ncliente: "+ o.getCliente()+ "\nmodelo do veiculo: "+ o.getModeloveiculo()+ "\nplaca veiculo: "+o.getPlacaveiculo()+ "\ndata: "+o.getData()+ "\nstatus: "+o.getStatus()+ "\nvalor estimado: "+o.getValoerestimado());
            total+=1;
        }
        System.out.println(("Quantidade total: "+total));
    }
    public void quantidadeOrdensFinalizadas(){
        int total = 0;
        for (OrdemServico o: this.getOrdensServicos()){
            if (o.getStatus()=="finalizado"){
                total+=1;
            }

        }
        System.out.println(("Quantidade total: "+total));
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getServicopermitido() {
        return servicopermitido;
    }

    public void setServicopermitido(String servicopermitido) {
        this.servicopermitido = servicopermitido;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public ArrayList<OrdemServico> getOrdensServicos() {
        return OrdensServicos;
    }

    public void setOrdensServicos(ArrayList<OrdemServico> ordensServicos) {
        OrdensServicos = ordensServicos;
    }



}
