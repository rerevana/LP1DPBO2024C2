import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Human rain = new Human();
        rain.setName(name: "Rain");
        rain.setGender(gender: 'L');

        Human techi = new Human(name: "Techi", gender: 'P');

        int i, n = 0;
        String name;
        char gender;

        ArrayList<Human> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        try{
            n = sc.nextInt();
        }

        catch(Exception e){
            System.out.println(x: "The input is not an integer!");
        }

        for(i = 0; i < n; i++){
            name = sc.next();
            gender = sc.next().charAt(index: 0);

            Human temp = new Human();
            temp.setName(name); temp.setGender(gender);
            list.add(temp);
        }

        System.out.println(x: "\n Automatic Output :");
        System.out.println("The first human's name is " + rain.getName());
        System.out.println(rain.getName() + "'s gender is " + rain.getGender());
        System.out.println("The second human's name is " + techi.getName());
        System.out.println(techi.getName() + "'s gender is " + techi.getGender());
        System.out.println();

        System.out.println(x: "Iteration output : ");
        for(i = 0; i < list.size(); i++){
            System.out.println(Integer.toString(i + 1) + ". " + list.get(i).getName() + " | " + list.get(i).getGender());
        }

        sc.close();
    }
}