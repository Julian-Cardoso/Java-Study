public class Desenvolvedor extends Funcionario{
    int projects;

    public Desenvolvedor(String name, double salaryBase, int projects){
        super(name, salaryBase);
        this.projects = projects;
    }

    @Override
    public double calculateSalary(){
        double bonus = 100.0;
        return salaryBase + (bonus * projects);
    }
}
