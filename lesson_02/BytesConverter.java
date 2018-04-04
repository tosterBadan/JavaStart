public class BytesConverter {
    public static void main(String[] args) {

        long size = Long.parseLong(args[0]);

        long gb = (size & (0x3FF<<30)) >> 30;
        long mb = (size & (0x3FF<<20)) >> 20;
        long kb = (size & (0x3FF<<10)) >> 10;
        long by = (size & 0x3FF);

        System.out.println(args[0] + "bytes is: " + gb + "Gb " + mb + "Mb " + kb + "kb  " + by + "bytes");
    }
}
