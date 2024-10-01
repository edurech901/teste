public class Mesa {
    int num_mesa;
    int capacidade;
    boolean status;
    int quant_pedidos;
    double valor_vendido;

    public Mesa(int num_mesa, int capacidade) {
        this.num_mesa = num_mesa;
        this.capacidade = capacidade;
        this.status = false;
        quant_pedidos = 0;
        valor_vendido = 0;
    }

    public int getNumMesa() {
        return num_mesa;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public boolean getStatus() {
        return status;
    }

    public void setNum_mesa(int num_mesa) {
        this.num_mesa = num_mesa;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getValorVendido() {
        return valor_vendido;
    }

    public void setValorVendido(double valor_vendido) {
        this.valor_vendido = valor_vendido;
    }

    public void consultarStatus() {
        if (status == false) {
            System.out.println("A mesa " + this.num_mesa + " está disponível");
        } else {
            System.out.println("A mesa " + this.num_mesa + " não está disponível");
        }
    }

    public void mudarStatus() {
        if (status == false) {
            status = true;
            System.out.println("A mesa " + this.num_mesa + " não está mais disponível");
        } else {
            status = false;
            System.out.println("A mesa " + this.num_mesa + " agora está disponível");
        }
    }

    public int getQuantPedidos() {
        return quant_pedidos;
    }

    public void setQuantPedidos(int quant_pedidos) {
        this.quant_pedidos = quant_pedidos;
    }

   

}