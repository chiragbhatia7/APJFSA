class RBI {
    int getInterestRate() {
        return 0;
    }
}

class SBI extends RBI {
    int getInterestRate() {
        return 9;
    }
}

class PNB extends RBI {
    int getInterestRate() {
        return 11;
    }
}

class ICICI extends RBI {
    int getInterestRate() {
        return 8;
    }
}

class Overiding {
    public static void main(String args[]) {
        RBI r1 = new ICICI();
        System.out.println(r1.getInterestRate());
        RBI r2 = new PNB();
        System.out.println(r2.getInterestRate());
        RBI r3 = new SBI();
        System.out.println(r3.getInterestRate());
    }
}