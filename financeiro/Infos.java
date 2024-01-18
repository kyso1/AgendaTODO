package financeiro;

import java.util.Scanner;

public class Infos{
    private float salario;
    private float agua;
    private float luz;
    private float aluguel;
    private float any;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getAgua() {
        return agua;
    }

    public void setAgua(float agua) {
        this.agua = agua;
    }

    public float getLuz() {
        return luz;
    }

    public void setLuz(float luz) {
        this.luz = luz;
    }

    public float getAluguel() {
        return aluguel;
    }

    public void setAluguel(float aluguel) {
        this.aluguel = aluguel;
    }

    public float getAny() {
        return any;
    }

    public void setAny(float any) {
        this.any = any;
    }

    public void zerar(){
        this.salario = 0;
        this.agua = 0;
        this.aluguel = 0;
        this.luz = 0;
        this.any = 0;
    }
    public void setar(Scanner scan){
        System.out.print("Digite o valor do seu salário: ");
        salario = Float.parseFloat(scan.next());
        System.out.print("Digite o valor médio da sua conta de água: ");
        agua = Float.parseFloat(scan.next());
        System.out.print("Digite o valor médio da sua conta de luz: ");
        luz = Float.parseFloat(scan.next());
        System.out.print("Digite o valor do seu aluguel: ");
        aluguel = Float.parseFloat(scan.next());
        System.out.print("Digite o de qualquer outra conta recorrente que você tiver: ");
        any = Float.parseFloat(scan.next());
        
        float sobra = salario - (agua + luz + aluguel + any);
        if(sobra > 0){
            System.out.printf("Você está com o saldo positivo de : R$%.2f", sobra);
        }else if(sobra < 0){
            System.out.printf("Você está com um déficit de : R$%.2f", sobra);
        } 
    }    
    public void meta(Scanner scan){
        
    }
}