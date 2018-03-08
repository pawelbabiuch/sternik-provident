package pl.sternik.pb.provident;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckWhoWillAcceptAmount {

	public static void main(String[] args) {
		BranchManagerPower manager = new BranchManagerPower();
		DistrictManagerPower director = new DistrictManagerPower();
		RegionalManagerPower regional = new RegionalManagerPower();
		PresidentPower president = new PresidentPower();
		manager.setSuccessor(director);
		director.setSuccessor(regional);
		regional.setSuccessor(president);

		try {
			while (true) {
				System.out.println("Podaj kwotę wnioskowanej pozyczki:");
				System.out.print(">");
				double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
				manager.processRequest(new LoanRequest(d, "na waciki"));
			}
		} catch (Exception exc) {
			System.exit(1);
		}
	}
}