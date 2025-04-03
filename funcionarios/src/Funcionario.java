public class Funcionario {
    private String name;
    protected double salaryBase;

    public Funcionario (String name, double salaryBase){
        this.name = name;
        this.salaryBase = salaryBase;
    }
    public double calculateSalary(){
        return salaryBase;
    }

    public void showInfor(){
        System.out.printf("Nome: %s | Salário: R$%.2f%n", name, calculateSalary());
    }
}