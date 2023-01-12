package arrays;

class CheckifAll_A_AppearsBeforeAll_B {
    public boolean checkString(String s) {
        int length = s.length();
        int fob = -1;
        int loa = -1;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == 'b') {
                fob = i;
                break;
            }
        }

        if (fob == -1) {
            return true;
        }

        for (int i = length - 1; i > 0; i--) {
            if (s.charAt(i) == 'a') {
                loa = i;
                break;
            }
        }
        if(loa<fob){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        CheckifAll_A_AppearsBeforeAll_B appearsBeforeAllB = new CheckifAll_A_AppearsBeforeAll_B();
        System.out.println(appearsBeforeAllB.checkString("abaabbb"));
    }
}