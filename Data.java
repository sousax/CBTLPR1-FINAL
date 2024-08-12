public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }

    public Data(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    public void setDia(int d) {
        this.dia = d;
    }

    public void setMes(int m) {
        this.mes = m;
    }

    public void setAno(int a) {
        this.ano = a;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String mostra1() {
        return dia + "/" + mes + "/" + ano;
    }

    public String mostra2() {
        return String.format("%02d-%02d-%04d", dia, mes, ano);
    }

    public boolean bissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public int diasTranscorridos() {
        return (ano - 1970) * 365 + (mes - 1) * 30 + dia;
    }

    public void apresentaDataAtual() {
        System.out.println("Data atual: " + mostra1());
    }
}