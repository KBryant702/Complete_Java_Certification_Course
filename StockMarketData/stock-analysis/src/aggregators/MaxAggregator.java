package aggregators;

import java.util.ArrayList;
import java.util.List;

public class MaxAggregator extends Aggregator{
	

	@Override
	public double calculate() {
		double max = numbers.get(0);
		for(Double number : numbers){
			if(number > max){
				max = number;
			}
		}
		return max;
	}

	public MaxAggregator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MaxAggregator(List<Double> numbers) {
		super(numbers);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Double> getValues() {
		return numbers;
	}
	
}
