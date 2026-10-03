public class Task2{
    public static void main(String[] args) {
        boolean boo = true;
        byte varByte = 0;
        short varShort = 1;
        int varInt = 31;
        float varFloat = 2.0f;
        char h = 'H';
        char w = 'wasdf';
        char r = 'r';
        char l = 'l';
        char d = 'd';
        String text = "" + h + varInt + varShort + varByte + " " + w + varByte + r + l + d +" "+ varFloat + " " + boo;
        
        System.out.println(text);
    }
}