import java.util.ArrayList;
import java.util.Scanner;

public class EntryPoint {
    public static void main(String[] args) {

        int numOfPS;
        int selectType;
        int kPosition;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of PS:");
        numOfPS = sc.nextInt();
        ArrayList<PhanSo> dsachPS = new ArrayList<>();
        for (int i = 0; i < numOfPS; i++) {
            PhanSo new_PS = new PhanSo();
            new_PS.inputPS();
            dsachPS.add(new_PS);
        }

        System.out.println("Select your goal \n 1.Print list \n 2.Add new one \n 3.Delete k position  " +
                " \n 4.Update k position \n 6.Delete all");
        selectType = sc.nextInt();
        if(selectType == 1 ){
            //print
            for (int i = 0; i < dsachPS.size(); i++) {
                System.out.println("\nPhân số thứ " + ( i+ 1) +": " + dsachPS.get(i).showMe());
            }
        }else if (selectType == 2){
            //add new one
            PhanSo new_PS = new PhanSo();
            new_PS.inputPS();
            dsachPS.add(new_PS);
        }else if(selectType == 3){
            //delete k position
            System.out.println("Enter k position:");
            kPosition = sc.nextInt();
            if(kPosition < dsachPS.size()){
                dsachPS.remove(kPosition);
            }else {
                System.out.println("Incorrect position");
            }
        }else if(selectType == 4){
            //update k position
            System.out.println("Enter k position:");
            kPosition = sc.nextInt();
            if(kPosition < dsachPS.size()){
                dsachPS.get(kPosition).inputPS();
            }else {
                System.out.println("Incorrect position");
            }
        }else if(selectType == 6){
            //delete all
            dsachPS.clear();
        }

        // xuất lại danh sách sau khi thực hiện
        if(dsachPS.size() > 0){
            for (int i = 0; i < dsachPS.size(); i++) {
                System.out.println("\nPhân số thứ " + ( i+ 1) +": " + dsachPS.get(i).showMe());
            }
        }else{
            System.out.println("This is an empty list");
        }

    }
}
