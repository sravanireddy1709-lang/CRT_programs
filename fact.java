package cse;
class recurse {
    int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        recurse obj = new recurse();
        int f = obj.fact(10);
        System.out.println(f);
    }
}

