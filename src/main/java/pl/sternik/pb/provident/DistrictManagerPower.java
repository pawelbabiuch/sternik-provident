package pl.sternik.pb.provident;

public class DistrictManagerPower extends AcceptancePower {
    
	@Override
	protected double getMaxAllowedAmount() {
		return 2000;
	}

	@Override
	protected String getRoleName() {
		return "Dyrektor Okręgu";
	}
}