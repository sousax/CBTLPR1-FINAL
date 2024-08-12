import java.util.Scanner;

public class Hora {
    private int hora;
    private int min;
    private int seg;

    public Hora() {
        Scanner scanner = new Scanner(System.in);
        this.hora = lerHora(scanner);
        this.min = lerMinuto(scanner);
        this.seg = lerSegundo(scanner);
    }

    public Hora(int h, int m, int s) {
        if (horaValida(h)) {
            this.hora = h;
        } else {
            throw new IllegalArgumentException("Hora inválida!");
        }
        if (minutoValido(m)) {
            this.min = m;
        } else {
            throw new IllegalArgumentException("Minuto inválido!");
        }
        if (segundoValido(s)) {
            this.seg = s;
        } else {
            throw new IllegalArgumentException("Segundo inválido!");
        }
    }

    public void setHor(int h) {
        if (horaValida(h)) {
            this.hora = h;
        } else {
            throw new IllegalArgumentException("Hora inválida!");
        }
    }

    public void setMin(int m) {
        if (minutoValido(m)) {
            this.min = m;
        } else {
            throw new IllegalArgumentException("Minuto inválido!");
        }
    }

    public void setSeg(int s) {
        if (segundoValido(s)) {
            this.seg = s;
        } else {
            throw new IllegalArgumentException("Segundo inválido!");
        }
    }

    public void setHor() {
        Scanner scanner = new Scanner(System.in);
        this.hora = lerHora(scanner);
    }

    public void setMin() {
        Scanner scanner = new Scanner(System.in);
        this.min = lerMinuto(scanner);
    }

    public void setSeg() {
        Scanner scanner = new Scanner(System.in);
        this.seg = lerSegundo(scanner);
    }

    public int getHor() {
        return this.hora;
    }

    public int getMin() {
        return this.min;
    }

    public int getSeg() {
        return this.seg;
    }

    public String getHora1() {
        return String.format("%02d:%02d:%02d", this.hora, this.min, this.seg);
    }

    public String getHora2() {
        String periodo = this.hora >= 12 ? "PM" : "AM";
        int hora12 = this.hora % 12;
        if (hora12 == 0) {
            hora12 = 12;
        }
        return String.format("%02d:%02d:%02d %s", hora12, this.min, this.seg, periodo);
    }

    public int getSegundos() {
        return this.hora * 3600 + this.min * 60 + this.seg;
    }

    private int lerHora(Scanner scanner) {
        int h;
        do {
            System.out.print("Digite a hora (0-23): ");
            h = scanner.nextInt();
        } while (!horaValida(h));
        return h;
    }

    private int lerMinuto(Scanner scanner) {
        int m;
        do {
            System.out.print("Digite o minuto (0-59): ");
            m = scanner.nextInt();
        } while (!minutoValido(m));
        return m;
    }

    private int lerSegundo(Scanner scanner) {
        int s;
        do {
            System.out.print("Digite o segundo (0-59): ");
            s = scanner.nextInt();
        } while (!segundoValido(s));
        return s;
    }

    private boolean horaValida(int h) {
        return h >= 0 && h <= 23;
    }

    private boolean minutoValido(int m) {
        return m >= 0 && m <= 59;
    }

    private boolean segundoValido(int s) {
        return s >= 0 && s <= 59;
    }
}
