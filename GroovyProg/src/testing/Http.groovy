package testing

import groovy.json.*

import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.HttpsURLConnection;

class TrustManager implements X509TrustManager {
  public java.security.cert.X509Certificate[] getAcceptedIssuers() { return null;  }
  public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) { }
  public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) { }
}


class Http {

    def Http() {
         TrustManager[] trustAllCerts = new TrustManager[1]
         trustAllCerts[0] = new TrustManager()
         SSLContext sc = SSLContext.getInstance("SSL");
         sc.init(null, trustAllCerts, new java.security.SecureRandom());
         HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
    }

     def getSonarStatus(){

         def url = new URL('https://sonar.regeneron.regn.com/api/ce/task?id=AWm1Bod1qjh34HVWrhK1')
         def json = new JsonSlurper().parseText(url.getText())
         println JsonOutput.prettyPrint(JsonOutput.toJson(json))

         println json["task"]["status"]


         

     }
}