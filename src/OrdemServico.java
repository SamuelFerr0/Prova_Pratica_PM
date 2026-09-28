

public class OrdemServico {
    private String codigo;
    private String cliente;
    private String modeloveiculo;
    private String placaveiculo;
    private String data;
    private String status;
    private double valoerestimado;
    private String servico;

    public OrdemServico(String codigo, String cliente, String modeloveiculo,String placaveiculo, String data, String status, double valoerestimado, String servico){
        this.setCodigo(codigo);
        this.setCliente(cliente);
        this.setModeloveiculo(modeloveiculo);
        this.setPlacaveiculo(placaveiculo);
        this.setData(data);
        this.setStatus(status);
        this.setValoerestimado(valoerestimado);
        this.setServico(servico);
    }



    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getModeloveiculo() {
        return modeloveiculo;
    }

    public void setModeloveiculo(String modeloveiculo) {
        this.modeloveiculo = modeloveiculo;
    }

    public String getPlacaveiculo() {
        return placaveiculo;
    }

    public void setPlacaveiculo(String placaveiculo) {
        this.placaveiculo = placaveiculo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getValoerestimado() {
        return valoerestimado;
    }

    public void setValoerestimado(double valoerestimado) {
        this.valoerestimado = valoerestimado;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }
}
