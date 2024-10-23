public class Oprations {

    public void add (double num1, double num2){

        double res = num1 + num2;
        showResult(res);
    }
    public void subtract (double num1, double num2){

        double res = num1 - num2;
        showResult(res);

    }
    public void divide (double num1, double num2){

        double res = num1 / num2;
        showResult(res);

    }
    public void multiply (double num1, double num2){

        double res = num1 * num2;
        showResult(res);

    }

    public void showResult(double num){

        System.out.println("Your result is: " + num);

    }

}
