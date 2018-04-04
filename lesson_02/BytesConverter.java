public class BytesConverter {
    public static void main(String[] args) {

        long size = Long.parseLong(args[0]);

        long gb = (size & 0xFF000000) >> 24;
        long mb = (size & 0x00FF0000) >> 16;
        long kb = (size & 0x0000FF00) >> 8;
        long by = (size & 0x000000FF);

        System.out.println(args[0] + "bytes is: " + gb + "Gb " + mb + "Mb " + kb + "kb  " + by + "bytes");
    }
}
