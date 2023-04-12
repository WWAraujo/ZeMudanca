class Cliente{

    constructor(){
        this.id = 1;
        this.arrayClientes = [];
    }

    salvar() {
        let produto = this.lerDados();
        console.log(cliente);
        this.validaCampo(cliente);
    }

    lerDados() {
        let cliente={
            cliente.id = this.id;
            cliente.nomeCliente=document.getElementById('nome').value;
            cliente.nomeTelefone=document.getElementById('telefone-1,telefone-2').value;
            cliente.nomeEndereco=document.getElementById('endereco').value;

        return cliente;
        }
    }
    validaCampo(){
        if(cliente.nomeCliente == ""){
        alert("Digite o Nome");
        }
    }
}


var cliente= new Cliente();