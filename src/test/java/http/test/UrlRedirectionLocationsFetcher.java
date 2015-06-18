package http.test;


import java.io.IOException;
import java.net.URI;
import java.util.List;
 
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
 
/**
 * Utility class to get all redirection locations of a URL.
 * 
 * http://www.srccodes.com/p/article/41/get-redirections-url-apache-httpcomponents-httpclient
 * 
 * @author Abhijit Ghosh
 * @version 1.0
 */
public class UrlRedirectionLocationsFetcher {
    // Web browser agent
    public static String USER_AGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_3) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.151 Safari/535.19";
     
    // Create and configure HttpClient
    private static final CloseableHttpClient httpClient = HttpClients.custom()
            .setUserAgent(USER_AGENT)
            .setDefaultRequestConfig(RequestConfig.custom().setCookieSpec(CookieSpecs.BROWSER_COMPATIBILITY).build())
            .build();
     
    /**
     * To get all the redirect locations of the supplied link
     * 
     * @param link
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     */
    public List<URI> getAllRedirectLocations(String link) throws ClientProtocolException, IOException {
        List<URI> redirectLocations = null;
        CloseableHttpResponse response = null;
         
        try {
            HttpClientContext context = HttpClientContext.create();
            HttpGet httpGet = new HttpGet(link);
            response = httpClient.execute(httpGet, context);
             
            // get all redirection locations
            redirectLocations = context.getRedirectLocations();
        } finally {
            if(response != null) {
                response.close();
            }
        }
         
        return redirectLocations;
    }
     
    public static void main(String[] args) throws ClientProtocolException, IOException {
        // Input URL
        String link = "http://bit.ly/1c1mBAI";
         
        UrlRedirectionLocationsFetcher urlRedirectionLocationsFetcher = new UrlRedirectionLocationsFetcher();
        List<URI> allRedirectLocations = urlRedirectionLocationsFetcher.getAllRedirectLocations(link);
         
        if (allRedirectLocations != null) {
            System.out.println(link);
             
            for (URI uri : allRedirectLocations) {
                System.out.println("|\nv\n" + uri.toASCIIString());
            }
        } else {
            System.out.println("Not found!");
        }
    }
}
