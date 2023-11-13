package cse12pa4student;
import java.util.List;
public class Main {
	
	public static void main(String[] args) {
		String[]toRun={"C","D"};
		int startN = 40;
		int stopN = 100;

		List<Measurement> measurements= Measure.measure(toRun,startN,stopN);

		String csvData = Measure.measurementsToCSV(measurements);
		System.out.println(csvData);
		
	}
}
