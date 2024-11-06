public class MesinKetikManual {
    public static void main(String[] args) {
        MyStack stackS1 = new MyStack(100); // Stack untuk menyimpan input
        MyStack stackS2 = new MyStack(100); // Stack untuk membalik urutan

        // Simulasi input
        char[] inputs = {'A', 'B', 'C', '\b', 'D', 'E', '\b', 'F'};

        // Memproses input
        for (char input : inputs) {
            if (input == '\b') {
                if (!stackS1.isEmpty()) {
                    System.out.println("#Pop! dari S1");
                    stackS1.pop();
                }
            } else {
                System.out.println("# Memasukkan huruf " + input + " ke S1");
                stackS1.push(input);
            }
            System.out.print("Isi stack S1 : ");
            System.out.println(stackS1);
        }

        // Membalik urutan huruf dari stack S1 ke stack S2
        while (!stackS1.isEmpty()) {
            char c = stackS1.pop();
            stackS2.push(c);
            System.out.println("#Pop! dari S1");
            System.out.print("Isi stack S1 : " + stackS1);
            System.out.println();
            System.out.println("# Memasukkan huruf " + c + " ke S2");
            System.out.print("Isi stack S2 : " + stackS2);
            System.out.println();
        }

        // Menampilkan semua huruf yang telah dimasukkan
        System.out.print("Semua huruf yang telah dimasukkan: ");
        while (!stackS2.isEmpty()) {
            System.out.print(stackS2.pop() + " ");
        }
    }
}