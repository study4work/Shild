package main.java.com.alexander_lysenko.javacore.chapter22;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpURLDemo {
    public static void main(String[] args) throws Exception {
        URL hp = new URL("http://www.google.com");
        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();

        System.out.println(hpCon.getRequestMethod());
        System.out.println(hpCon.getResponseCode());
        System.out.println(hpCon.getResponseMessage());
        Map<String, List<String>> map = hpCon.getHeaderFields();
        Set<String> fields = map.keySet();
        for (String s : fields) {
            System.out.println(s + map.get(s));
        }

    }
}
