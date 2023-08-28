package lab_6;

public class Lab64 {
    public static void main(String[] args) {

        String url = "https://google.comm";
        int checkUrl = url.indexOf("https");

        if (checkUrl != 0) {
            System.out.println("This is http");
        } else {
            System.out.println("This is https");
        }

        String subUrl= url.substring(8);
        if (subUrl.equals("google.com")){
            System.out.println("It's domain name");
        }else {
            System.out.println("Warning!");
        }

        String subUrl1= url.substring(14);
        if(subUrl1.equals(".com")){
            System.out.println("It's .com");
        }else{
            System.out.println("It's .net or st");
        }
    }
}
