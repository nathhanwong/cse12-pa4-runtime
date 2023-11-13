package cse12pa4student;

import java.util.List;
import java.util.ArrayList;
import static cse12pa4mysteries.Mysteries.*;

public class Measure {


	public static List<Measurement> measure(String[] toRun, int startN, int stopN) {
		List<Measurement>measurements = new ArrayList<>();

		for (String methodName : toRun) {
			for (int n = startN; n <= stopN; n++) {
				long startTime = System.nanoTime();

				switch (methodName) {
					case "A":
					mysteryA(n);
					break;
					case "B":
					mysteryB(n);
					break;
				}
				long endTime = System.nanoTime();
				long executionTime= endTime - startTime;

				measurements.add(new Measurement(methodName, n, executionTime));
			}
		}
		return measurements;
	}
	

	public static String measurementsToCSV(List<Measurement> toConvert) {
		StringBuilder csvBuilder = new StringBuilder();

		csvBuilder.append("name, n, nanoseconds\n");
		for (Measurement measurement : toConvert) {
			csvBuilder.append(measurement.name)
			.append(",")
			.append(measurement.valueOfN)
			.append(",")
			.append(measurement.nanosecondsToRun)
			.append("\n");
		}
		return csvBuilder.toString();

	}
}
