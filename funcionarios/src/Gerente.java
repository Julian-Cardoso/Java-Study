public class Gerente extends Funcionario {

    public Gerente(String name, double salaryBase) {
        super(name, salaryBase);
    }

    @Override
    public double calculateSalary() {
        return salaryBase * 1.10;
    }
}
