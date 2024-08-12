public class Main {
    public static void main(String[] args) {

        ConsultaAgendada p1 = new ConsultaAgendada(10, 30, 0, 15, 8, 2024, "João Silva", "Dr. Oliveira");

        System.out.println("Propriedades de p1:");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("Nome do Médico: " + p1.getNomeMedico());
        System.out.println();

        ConsultaAgendada p2 = new ConsultaAgendada();

        System.out.println("Propriedades de p2:");
        System.out.println("Data: " + p2.getData());
        System.out.println("Hora: " + p2.getHora());
        System.out.println("Nome do Paciente: " + p2.getNomePaciente());
        System.out.println("Nome do Médico: " + p2.getNomeMedico());
        System.out.println();

        p1.setData(16, 8, 2024);
        p1.setHora(14, 45, 0);
        p1.setNomePaciente("Maria Souza");
        p1.setNomeMedico("Dr. Pereira");

        System.out.println("Propriedades de p1 após alteração:");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("Nome do Médico: " + p1.getNomeMedico());
        System.out.println();
        System.out.println("Quantidade final de consultas: " + ConsultaAgendada.getAmostra());
    }
}
