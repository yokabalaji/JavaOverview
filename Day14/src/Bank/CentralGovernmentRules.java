package Bank;

public abstract class CentralGovernmentRules implements NumberPlateRules {
	public String displayfontStyle(String style) {
		return "fontStyle"+style;
	}
	public String displayfontSize(int size) {
		return "fontSize"+size;
	}
	public abstract String displayNumberPlateColor(String vechileType);
	public abstract String displayStateCode(String stateCode);

		
	}
