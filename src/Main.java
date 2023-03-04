import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();
        while (true)
        switch (search) {
            case "Area1" -> {
                try {

                    Parallelepiped parallelepiped = new Parallelepiped();
                    parallelepiped.setHeight(new Scanner(System.in).nextInt());
                    parallelepiped.setLenght(new Scanner(System.in).nextInt());
                    parallelepiped.setWidght(new Scanner(System.in).nextInt());
                    parallelepiped.area();

                } catch (AreaException e) {
                    System.out.println(e.getMessage());
                }
            }
            case "Volume1" -> {
                try {
                    Parallelepiped parallelepiped = new Parallelepiped();
                    parallelepiped.setHeight(scanner.nextInt());
                    parallelepiped.setLenght(scanner.nextInt());
                    parallelepiped.setWidght(scanner.nextInt());
                    parallelepiped.volume();
                } catch (AreaException e1) {
                    System.out.println(e1.getMessage());
                }
            }

            case "Area2" -> {
                try {
                    Cylinder cylinder = new Cylinder();
                    cylinder.setHeight1(scanner.nextInt());
                    cylinder.setRadius(scanner.nextInt());
                    cylinder.area1();
                } catch (AreaException e2) {
                    System.out.println(e2.getMessage());
                }
            }
            case "Volume2" -> {
                try {
                    Cylinder cylinder = new Cylinder();
                    cylinder.setHeight1(scanner.nextInt());
                    cylinder.setRadius(scanner.nextInt());
                    cylinder.volume1();
                } catch (AreaException e3) {
                    System.out.println(e3.getMessage());
                }
            }
        }


    }
}