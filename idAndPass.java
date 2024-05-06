package secondProgram;
import java.util.HashMap;

public class idAndPass {

		private HashMap<String,String> loginInfo = new HashMap<String,String>();

		public idAndPass(){
			
			loginInfo.put("Mukesh","Muk@123");
			loginInfo.put("Binod","Bin@123");
			loginInfo.put("Rani","Ran@123");
		}
		
		protected HashMap getLoginInfo() {
			return loginInfo;
		}
		
		
		
}
