public class AntrianTiket {
    public static void main(String[] args) {
        MyQueue queueHolil = new MyQueue(100); // Antrian untuk tiket Holil
        MyQueue queueAldi = new MyQueue(100);  // Antrian untuk tiket Aldi

        // Mengirimkan tiket
        queueHolil.add("Tiket 1 milik Indi");
        queueHolil.add("Tiket 2 milik Fiana");
        queueHolil.add("Tiket 3 milik Bayu");

        // Memproses tiket
        while (!queueHolil.isEmpty()) {
            String tiket = queueHolil.poll();
            System.out.println(tiket + " keluar dari antrian Holil");
            queueAldi.add(tiket);
            System.out.println(tiket + " masuk ke antrian Aldi");
        }

        // Memproses tiket di antrian Aldi
        while (!queueAldi.isEmpty()) {
            String tiket = queueAldi.poll();
            System.out.println(tiket + " keluar dari antrian Aldi");
        }
    }
}
