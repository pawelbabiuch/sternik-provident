package pl.sternik.pb.provident;

public class BranchManagerPower extends AcceptancePower {
    
	@Override
	protected double getMaxAllowedAmount() {
		return 500;
	}

	@Override
	protected String getRoleName() {
		return "Kierownik Oddziału";
	}
}