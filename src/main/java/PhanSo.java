import java.util.Scanner;

public class PhanSo {
    int tuSo ;
    int mauSo ;


    public void inputPS() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input TS : ");
        this.tuSo = input.nextInt();
        System.out.println("Input MS : ");
        this.mauSo = input.nextInt();
    }

    public String showMe(){
        return this.tuSo + "/" + this.mauSo;
    }

}
