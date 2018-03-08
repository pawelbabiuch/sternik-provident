package pl.sternik.pb.provident;

public class RegionalManagerPower extends AcceptancePower {
    
	@Override
	protected double getMaxAllowedAmount() {
		return 30000;
	}

	@Override
	protected String getRoleName() {
		return "Menadzer regionu";
	}
}