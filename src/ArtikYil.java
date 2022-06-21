import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;

        System.out.println("Ogrenmek istediginiz yili girin : ");
        yil = input.nextInt();

        if ((yil % 4 == 0)){
            if (yil % 100 == 0){
                if (yil % 400 == 0){
                    System.out.println("Artik yil");
                } else{
                    System.out.println("Artik yil degil");
                }
            }else{
                System.out.println("Artik yil");
            }
        }else{
            System.out.println("Artik yil degil");
        }
    }

}