package lab_6;

public class Lab64 {
    public static void main(String[] args) {
        String url = "https://google.com";
        String[] urlSplit = url.split("://");
        String protocal = urlSplit[0];
        String domainName = urlSplit[1];

        System.out.println(protocal.equals("https"));
        System.out.println(domainName);
        System.out.println(".com or .net?--> its:" + domainName.substring(domainName.length() - 4, domainName.length()));
    }
}
