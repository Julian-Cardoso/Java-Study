public class Empresa {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Jose", 2500);
        Funcionario funcionario2 = new Funcionario("Maria", 2000);

        funcionario1.showInfor();
        funcionario2.showInfor();

        Gerente gerente1 = new Gerente("Fábio", 3000, 2000);
        Gerente gerente2 = new Gerente("Carla", 5000, 1500);

        gerente1.showInfor();
        gerente2.showInfor();

        Desenvolvedor dev1 = new Desenvolvedor("Junior", 2500, 4);
        Desenvolvedor dev2 = new Desenvolvedor("Cristina", 3000, 6);

        dev1.showInfor();
        dev2.showInfor();
    }
}
