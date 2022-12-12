import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.println("nhập số lượng phần tử mảng 2 chiều: ");
        n1 = sc.nextInt();
        do{
            System.out.println("nhập số lượng phần tử mảng con: ");
            n2 = sc.nextInt();
        }while (n2<n1);

        int [] [] arr = new int [n1] [n2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                System.out.println("nhập giá trị phần tử thứ "+(i+1)+" vị trí "+(j+1)+":");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("phần tử mảng 2 chiều: ");
        for(int i =0;i<n1;i++){
            for(int j = 0;j<n2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
        int max = arr[0][0];
        int indexI =0,indexJ =0;
        for(int i = 0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(max < arr[i][j]) {
                    max = arr[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }

        }
        System.out.println("phần tử lớn nhất là: "+max);
        System.out.println("tại vị trí: "+indexI+" "+indexJ);
    }
}