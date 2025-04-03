public class Gerente extends Funcionario {
    double bonus;

    public Gerente(String name, double salaryBase, double bonus) {
        super(name, salaryBase);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return salaryBase + bonus;
    }
}
