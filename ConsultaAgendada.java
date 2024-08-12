import java.util.Scanner;

public class ConsultaAgendada {
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private static int quantidade = 0;
    private String nomeMedico;

    public ConsultaAgendada() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a data (dd mm aaaa): ");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int ano = scanner.nextInt();
        setData(dia, mes, ano);

        System.out.print("Digite a hora (hh mm ss): ");
        int hora = scanner.nextInt();
        int minuto = scanner.nextInt();
        int segundo = scanner.nextInt();
        setHora(hora, minuto, segundo);

        System.out.print("Digite o nome do paciente: ");
        scanner.nextLine(); // Consumir a quebra de linha
        String paciente = scanner.nextLine();
        setNomePaciente(paciente);

        System.out.print("Digite o nome do médico: ");
        String medico = scanner.nextLine();
        setNomeMedico(medico);

        quantidade++;
    }

    public ConsultaAgendada(int hora, int minuto, int segundo, int dia, int mes, int ano, String paciente, String medico) {
        this.data = new Data(dia, mes, ano);
        this.hora = new Hora(hora, minuto, segundo);
        this.nomePaciente = paciente;
        this.nomeMedico = medico;
        quantidade++;
    }

    public ConsultaAgendada(Data data, Hora hora, String paciente, String medico) {
        this.data = data;
        this.hora = hora;
        this.nomePaciente = paciente;
        this.nomeMedico = medico;
        quantidade++;
    }

    public void setData(int dia, int mes, int ano) {
        this.data = new Data(dia, mes, ano);
    }

    public void setData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nova data (dd mm aaaa): ");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int ano = scanner.nextInt();
        setData(dia, mes, ano);
    }

    public void setHora(int hora, int minuto, int segundo) {
        this.hora = new Hora(hora, minuto, segundo);
    }

    public void setHora() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nova hora (hh mm ss): ");
        int hora = scanner.nextInt();
        int minuto = scanner.nextInt();
        int segundo = scanner.nextInt();
        setHora(hora, minuto, segundo);
    }

    public void setNomePaciente(String paciente) {
        this.nomePaciente = paciente;
    }

    public void setNomePaciente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o novo nome do paciente: ");
        String paciente = scanner.nextLine();
        setNomePaciente(paciente);
    }

    public void setNomeMedico(String medico) {
        this.nomeMedico = medico;
    }

    public void setNomeMedico() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o novo nome do médico: ");
        String medico = scanner.nextLine();
        setNomeMedico(medico);
    }

    public static int getAmostra() {
        return quantidade;
    }

    public String getData() {
        return data.mostra1();
    }

    public String getHora() {
        return hora.getHora1();
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }
}
