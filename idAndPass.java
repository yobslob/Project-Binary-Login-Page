package Login;
import java.util.HashMap;

public class idAndPass {
    
    HashMap<String,String> loginInfo = new HashMap<String,String>();

    idAndPass(){

        loginInfo.put("Ramesh","Ramesh@123");
        loginInfo.put("Chameli","Chameli@123");
        loginInfo.put("Gulabo","Gulabo@123");
    }

    protected HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }
}
