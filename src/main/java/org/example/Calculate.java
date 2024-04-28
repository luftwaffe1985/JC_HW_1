package main.java.org.example;

public class Calculate {
    protected int a;
    protected int b;
    protected int res;
    protected String act;

    Dialog dialog = new Dialog();

    // Calculate class returns String

    public String runCalculate() {
        a = dialog.enterNum();
        act = dialog.enterAction();
        b = dialog.enterNum();
        if ("+".equals(act)) {
            this.res = a + b;
        } else if ("-".equals(act)) {
            this.res = a - b;
        } else if ("*".equals(act)) {
            this.res = a * b;
        } else if ("/".equals(act)) {
            this.res = a / b;
        } else {
            this.res = -2198345;
        }
        dialog.closeScan();
        if (res == -2198345)
            return "Bye!";
        else
            return String.format("%d %s %d %s %d", a, act, b, "=", res);
    }
}