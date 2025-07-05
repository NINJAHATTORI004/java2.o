public class testBank {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("ROI: " + b.getROI());
    }
}

class Bank {
    public double getROI() {
        return 0.0;
    }
}

class SBI extends Bank {
    @Override
    public double getROI() {
        return 7.0;
    }
}