package Bank;

public class TamilNadu extends CentralGovernmentRules {
		public String displayStateCode(String stateCode) {
			return "StateCode="+stateCode;
	}
		public String displayNumberPlateColor(String vechileType) {
			if(vechileType.equalsIgnoreCase("privatevachile")) {
				return "black with white";
			}
			else if(vechileType.equalsIgnoreCase("publicvechile")) {
				return "black with yellow";
			}
			else if(vechileType.equalsIgnoreCase("electricvechile")) {
				return "green with white";
			}else {
				return "its motor bike";
			}
		}

}
