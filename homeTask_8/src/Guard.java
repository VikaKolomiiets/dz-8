public class Guard {
    public static void checkString(String name) throws Exception {
        if (name == null) {
            throw new Exception("Name can not be a null");
        }
        if (name.length() < 2){
            throw new Exception("Name should contains more than 2 letters");
        }
    }
}
