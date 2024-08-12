//Exercicio 4 -
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("resultado.txt"))) {
            ConsultaAgendada p1 = new ConsultaAgendada(10, 30, 0, 15, 8, 2024, "João Silva", "Dr. Oliveira");

            writer.write("Propriedades de p1:\n");
            writer.write("Data: " + p1.getData() + "\n");
            writer.write("Hora: " + p1.getHora() + "\n");
            writer.write("Nome do Paciente: " + p1.getNomePaciente() + "\n");
            writer.write("Nome do Médico: " + p1.getNomeMedico() + "\n\n");

            ConsultaAgendada p2 = new ConsultaAgendada();

            writer.write("Propriedades de p2:\n");
            writer.write("Data: " + p2.getData() + "\n");
            writer.write("Hora: " + p2.getHora() + "\n");
            writer.write("Nome do Paciente: " + p2.getNomePaciente() + "\n");
            writer.write("Nome do Médico: " + p2.getNomeMedico() + "\n\n");

            p1.setData(16, 8, 2024);
            p1.setHora(14, 45, 0);
            p1.setNomePaciente("Maria Souza");
            p1.setNomeMedico("Dr. Pereira");

            writer.write("Propriedades de p1 após alteração:\n");
            writer.write("Data: " + p1.getData() + "\n");
            writer.write("Hora: " + p1.getHora() + "\n");
            writer.write("Nome do Paciente: " + p1.getNomePaciente() + "\n");
            writer.write("Nome do Médico: " + p1.getNomeMedico() + "\n\n");

            writer.write("Quantidade final de consultas: " + ConsultaAgendada.getAmostra() + "\n");

            System.out.println("Resultados salvos em resultado.txt");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}