package Login;

public class main {
    public static void main(String[] args){

        idAndPass idnpass = new idAndPass();
        loginPage login = new loginPage(idAndPass.getLoginInfo());

    }
}
