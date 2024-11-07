public class StringLengthWithoutInbuildF{
    public static void main(String[] args) {
        String str = "Hello World!";
        int length = StringLength(str);
        System.out.println("The length of the string is : "+ length);
    }

    public static int StringLength(String str){
        int count=0;
        while(true){
            try{
                char c = str.charAt(count);
                count++;
            }
            catch(StringIndexOutOfBoundsException e){
                break;
        }

    }
    return count;
}
}