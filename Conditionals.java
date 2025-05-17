public class Conditionals {
    public static void main(String[] args) {
        
        int a = 20;
        int b = 1;

        if(a > b){
            System.out.println("20 is greater");
        }
        else{
            System.out.println("1 is smaller");
        }

        int x = 2;

        switch (x) {
            case 1:
                System.out.println("Pizza");
                break;
            case 2:
                System.out.println("Burger");
                break;
            case 3:
                System.out.println("Pasta");
                break;
            default:
                break;
        }


    }
}
