public class Pessoa{
    public static void main(String[] args) {
        Fisica fisica = new Fisica();
        Juridica juridica = new Juridica();

        fisica.setCpf("123456789");
        juridica.setCnpj("1234567890");

         System.out.println("CPF: "+fisica.getCpf());
         System.out.println("CNPJ: "+juridica.getCnpj());
    }
}