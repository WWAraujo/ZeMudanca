package br.com.zemudanca.model;

public class Servico {

    private String os, idCliente, tipoServico, retirada, entrega, data, hora;

    public Servico(String os, String idCliente, String tipoServico, String retirada, String entrega, String data, String hora) {
        this.os = os;
        this.idCliente = idCliente;
        this.tipoServico = tipoServico;
        this.retirada = retirada;
        this.entrega = entrega;
        this.data = data;
        this.hora = hora;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getRetirada() {
        return retirada;
    }

    public void setRetirada(String retirada) {
        this.retirada = retirada;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
